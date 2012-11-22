package hu.bme.aut.procurementofmaterials.editorpage;

import hu.bme.aut.procurementofmaterials.Activator;
import hu.bme.aut.procurementofmaterials.service.CdoServiceManager;
import model.ComplexFixture;
import model.ComplexFixtureWithNumber;
import model.FinishedProduct;
import model.Fixture;
import model.FixtureWithNumber;
import model.MaterialsModel;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TreeEditor;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public class ProducerProductionTreeEditorPage extends FormPage {

	private final FinishedProduct finsihedProduct;

	public ProducerProductionTreeEditorPage(FormEditor editor, String id, String title, FinishedProduct finsihedProduct) {
		super(editor, id, title);
		this.finsihedProduct = finsihedProduct;
	}
	
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		
		toolkit.decorateFormHeading(form.getForm());
		form.setText("Production tree");
		Composite body = form.getBody();
		
		body.setLayout(new FillLayout());
		
		final Tree tree = new Tree(body, SWT.SINGLE);
		
		TreeItem root = new TreeItem(tree, SWT.NONE);
		root.setText(finsihedProduct.getName() + " production tree");
		
		CDOTransaction transaction = CdoServiceManager.getInstance().openTransaction();
		if (0 < transaction.getRootResource().getContents().size()) {
			CDOResource resource = transaction.getResource(CdoServiceManager.getInstance().getResourcePath());
			MaterialsModel materialsModel = (MaterialsModel) resource.getContents().get(0);
			if (0 != materialsModel.getFixtures().size() && 0 != materialsModel.getComplexFixtures().size()) {
				produceProductionTree(materialsModel, root);
			}
		}
		root.setExpanded(true);
		root.setImage(Activator.getImageDescriptor("icons/document-tree.png").createImage());

		final TreeEditor editor = new TreeEditor(tree);
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;
	}
	
	private void produceProductionTree(MaterialsModel materialsModel, TreeItem root) {
		EList<ComplexFixture> complexFixtures = materialsModel.getComplexFixtures();
		EList<Fixture> fixtures = materialsModel.getFixtures();
		for (ComplexFixtureWithNumber complexFixtureWithNumber : finsihedProduct.getComplexFixtures()) {
			ComplexFixture cF = getComplexFixture(complexFixtureWithNumber.getComplexFixtureID(), complexFixtures);
			
			TreeItem complexItem = new TreeItem(root, SWT.NONE);
			complexItem.setText(cF.getName() + " (" + complexFixtureWithNumber.getNumbers() + ")");
			
			for (FixtureWithNumber fixtureWithNumber : cF.getFixtures()) {
				Fixture f = getFixture(fixtureWithNumber.getFixtureID(), fixtures);
				
				TreeItem fixtureItem = new TreeItem(complexItem, SWT.NONE);
				fixtureItem.setText(f.getName()+ " (" + fixtureWithNumber.getNumbers() + ")");
				fixtureItem.setExpanded(true);
				fixtureItem.setImage(Activator.getImageDescriptor("icons/wrench.png").createImage());
			}
			complexItem.setExpanded(true);
			complexItem.setImage(Activator.getImageDescriptor("icons/gear.png").createImage());
		}
		for (FixtureWithNumber fixtureWithNumber : finsihedProduct.getFixtures()) {
			Fixture f = getFixture(fixtureWithNumber.getFixtureID(), fixtures);
			
			TreeItem fixtureItem = new TreeItem(root, SWT.NONE);
			fixtureItem.setText(f.getName()+ " (" + fixtureWithNumber.getNumbers() + ")");
			fixtureItem.setExpanded(true);
			fixtureItem.setImage(Activator.getImageDescriptor("icons/wrench.png").createImage());
		}
	}

	private ComplexFixture getComplexFixture(String complexFixtureID, EList<ComplexFixture> complexFixtures) {
		for (ComplexFixture complexFixture : complexFixtures) {
			if (complexFixture.getID().equals(complexFixtureID)) {
				return complexFixture;
			}
		}
		return null;
	}

	private Fixture getFixture(String fixtureID, EList<Fixture> fixtures) {
		for (Fixture fixture : fixtures) {
			if (fixture.getID().equals(fixtureID)) {
				return fixture;
			}
		}
		return null;
	}
}
