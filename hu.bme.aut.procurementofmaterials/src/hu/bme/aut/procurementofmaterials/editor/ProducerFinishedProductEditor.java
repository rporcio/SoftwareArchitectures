package hu.bme.aut.procurementofmaterials.editor;

import hu.bme.aut.procurementofmaterials.editorinput.ProducerFinishedProductEditorInput;
import hu.bme.aut.procurementofmaterials.editorpage.ProducerFinishedProductEditorPage;
import hu.bme.aut.procurementofmaterials.model.EditableTableItem;
import hu.bme.aut.procurementofmaterials.service.CdoServiceManager;
import hu.bme.aut.procurementofmaterials.view.ProducerFinishedProductView;

import java.util.ArrayList;
import java.util.List;

import model.ComplexFixture;
import model.ComplexFixtureWithNumber;
import model.FinishedProduct;
import model.Fixture;
import model.FixtureWithNumber;
import model.MaterialsModel;
import model.impl.ModelFactoryImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.editor.FormEditor;

public class ProducerFinishedProductEditor extends FormEditor {
	public static final String ID = "hu.bme.aut.procurementofmaterials.producerfinishedproducteditor";
	private boolean dirty = false;
	private CDOTransaction transaction;
	private FinishedProduct finsihedProduct;
	private boolean alreadyAdded;
	private ProducerFinishedProductEditorPage fixtureEditorPage;
	
	private List<EditableTableItem> tableitems;

	@Override
	protected void addPages() {
		fixtureEditorPage = new ProducerFinishedProductEditorPage(this, "", finsihedProduct.getName(), finsihedProduct, tableitems);
		try {
			addPage(fixtureEditorPage);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		
		finsihedProduct.setName(fixtureEditorPage.getNameText().getText());
		finsihedProduct.setHasProductionTree(fixtureEditorPage.getHasProductionTreeButton().getSelection());
		
		MaterialsModel root = (MaterialsModel) transaction.getResource(CdoServiceManager.getInstance().getResourcePath()).getContents().get(0);

		finsihedProduct.getFixtures().clear();
		finsihedProduct.getComplexFixtures().clear();
		
		for (EditableTableItem item : tableitems) {
			if (root.getFixtures().size() > item.index) {
				Fixture fixture = root.getFixtures().get(item.index);
				FixtureWithNumber fixtureWithNumber = ModelFactoryImpl.eINSTANCE.createFixtureWithNumber();
				fixtureWithNumber.setNumbers(Integer.parseInt(item.number));
				fixtureWithNumber.setFixtureID(fixture.getID());
				
				finsihedProduct.getFixtures().add(fixtureWithNumber);
			} else {
				Integer index = item.index - root.getFixtures().size();
				ComplexFixture complexFixture = root.getComplexFixtures().get(index);
				ComplexFixtureWithNumber complexFixtureWithNumber = ModelFactoryImpl.eINSTANCE.createComplexFixtureWithNumber();
				complexFixtureWithNumber.setNumbers(Integer.parseInt(item.number));
				complexFixtureWithNumber.setComplexFixtureID(complexFixture.getID());
				
				finsihedProduct.getComplexFixtures().add(complexFixtureWithNumber);
			}
		}
			
		if (alreadyAdded) {
			try {
				transaction.setCommitComment("Add new complex fixture");
				transaction.commit();
			} catch (CommitException e) {
				e.printStackTrace();
				transaction.close();
			}
		} else {
			if (0 < transaction.getRootResource().getContents().size()) {
				root.getFinishedProducts().add(finsihedProduct);

				try {
					transaction.setCommitComment("Add new complex fixture");
					transaction.commit();
				} catch (CommitException e) {
					e.printStackTrace();
					transaction.close();
				}
			}
		}
		
		setPartName(finsihedProduct.getName());
		
		dirty = false;
		firePropertyChange(PROP_DIRTY);
		
		IViewPart viewPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(ProducerFinishedProductView.ID);
		if (viewPart instanceof ProducerFinishedProductView) {
			ProducerFinishedProductView finishedProduct = (ProducerFinishedProductView) viewPart;
			finishedProduct.refresh();
		}
	}

	@Override
	public void doSaveAs() {
		
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
	
	public static void openFinishedProductEditor(final FinishedProduct finishedProduct) {
		final Display display = null == Display.getCurrent() ? Display.getDefault() : Display.getCurrent();
		display.asyncExec(new Runnable() {
			final ProducerFinishedProductEditorInput editorInput = new ProducerFinishedProductEditorInput(finishedProduct);
			@Override
			public void run() {
				try {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(editorInput, ID);
				} catch (final PartInitException e) {
					throw new RuntimeException("Error while opening editor.", e);
				}
			}
		});
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		
		transaction = CdoServiceManager.getInstance().openTransaction();
		try {
			finsihedProduct = transaction.getObject((FinishedProduct) (((ProducerFinishedProductEditorInput) (input)).getFinishedProduct()));
			alreadyAdded = true;
		} catch (Exception e) {
			alreadyAdded = false;
			finsihedProduct = ((ProducerFinishedProductEditorInput) input).getFinishedProduct();
		}
		
		setPartName(finsihedProduct.getName());
		tableitems = new ArrayList<EditableTableItem>();
	}
	
	@Override
	public boolean isDirty() {
		return dirty;
	}

	public void setDirty(boolean dirty) {
		this.dirty = dirty;
		firePropertyChange(PROP_DIRTY);
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if (null != transaction) {
			transaction.close();
		}
	}

	public CDOTransaction getTransaction() {
		return transaction;
	}

	public void setTransaction(CDOTransaction transaction) {
		this.transaction = transaction;
	}

	public FinishedProduct getFinishedProduct() {
		return finsihedProduct;
	}

	public void setFinishedProduct(FinishedProduct finsihedProduct) {
		this.finsihedProduct = finsihedProduct;
	}
}
