package hu.bme.aut.procurementofmaterials.editor;

import hu.bme.aut.procurementofmaterials.editorinput.ProducerComplexFixtureEditorInput;
import hu.bme.aut.procurementofmaterials.editorpage.ProducerComplexFixtureEditorPage;
import hu.bme.aut.procurementofmaterials.model.EditableTableItem;
import hu.bme.aut.procurementofmaterials.service.CdoServiceManager;
import hu.bme.aut.procurementofmaterials.view.ProducerComplexFixtureView;

import java.util.ArrayList;
import java.util.List;

import model.ComplexFixture;
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

public class ProducerComplexFixtureEditor extends FormEditor {

	public static final String ID = "hu.bme.aut.procurementofmaterials.producercomplexfixtureeditor";
	private boolean dirty = false;
	private CDOTransaction transaction;
	private ComplexFixture complexFixture;
	private boolean alreadyAdded;
	private ProducerComplexFixtureEditorPage fixtureEditorPage;
	
	private List<EditableTableItem> tableitems;

	@Override
	protected void addPages() {
		fixtureEditorPage = new ProducerComplexFixtureEditorPage(this, "", complexFixture.getName(), complexFixture,tableitems);
		try {
			addPage(fixtureEditorPage);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		
		complexFixture.setName(fixtureEditorPage.getNameText().getText());
		
		MaterialsModel root = (MaterialsModel) transaction.getResource(CdoServiceManager.getInstance().getResourcePath()).getContents().get(0);
		complexFixture.getFixtures().clear();
		for (EditableTableItem item : tableitems) {
			Fixture fixture = root.getFixtures().get(item.index);
			FixtureWithNumber fixtureWithNumber = ModelFactoryImpl.eINSTANCE.createFixtureWithNumber();
			fixtureWithNumber.setNumbers(Integer.parseInt(item.number));
			fixtureWithNumber.setFixtureID(fixture.getID());
			
			complexFixture.getFixtures().add(fixtureWithNumber);
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
				root.getComplexFixtures().add(complexFixture);
				
				try {
					transaction.setCommitComment("Add new complex fixture");
					transaction.commit();
				} catch (CommitException e) {
					e.printStackTrace();
					transaction.close();
				}
			}
		}
		
		setPartName(complexFixture.getName());
		
		dirty = false;
		firePropertyChange(PROP_DIRTY);
		
		IViewPart viewPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(ProducerComplexFixtureView.ID);
		if (viewPart instanceof ProducerComplexFixtureView) {
			ProducerComplexFixtureView fixturesView = (ProducerComplexFixtureView) viewPart;
			fixturesView.refresh();
		}
	}

	@Override
	public void doSaveAs() {
		
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
	
	public static void openProducerEditor(final ComplexFixture complexFixture) {
		final Display display = null == Display.getCurrent() ? Display.getDefault() : Display.getCurrent();
		display.asyncExec(new Runnable() {
			final ProducerComplexFixtureEditorInput editorInput = new ProducerComplexFixtureEditorInput(complexFixture);
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
			complexFixture = transaction.getObject((ComplexFixture) (((ProducerComplexFixtureEditorInput) (input)).getComplexFixture()));
			alreadyAdded = true;
		} catch (Exception e) {
			alreadyAdded = false;
			complexFixture = ((ProducerComplexFixtureEditorInput) input).getComplexFixture();
		}
		
		setPartName(complexFixture.getName());
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

	public ComplexFixture getFixture() {
		return complexFixture;
	}

	public void setFixture(ComplexFixture fixture) {
		this.complexFixture = fixture;
	}
}
