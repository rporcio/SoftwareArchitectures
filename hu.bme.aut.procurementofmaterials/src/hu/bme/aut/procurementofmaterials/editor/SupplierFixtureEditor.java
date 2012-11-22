package hu.bme.aut.procurementofmaterials.editor;
import hu.bme.aut.procurementofmaterials.editorinput.SupplierFixtureEditorInput;
import hu.bme.aut.procurementofmaterials.editorpage.SupplierFixtureEditorPage;
import hu.bme.aut.procurementofmaterials.service.CdoServiceManager;
import hu.bme.aut.procurementofmaterials.view.SupplierFixturesView;
import model.Fixture;
import model.MaterialsModel;
import model.impl.ModelFactoryImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.editor.FormEditor;


public class SupplierFixtureEditor extends FormEditor {
	
	public static final String ID = "hu.bme.aut.procurementofmaterials.suppliereditor";
	private boolean dirty = false;
	private Fixture fixture;
	private SupplierFixtureEditorPage supplierFixtureEditorPage;
	private CDOTransaction transaction;
	private boolean alreadyAdded;

	@Override
	protected void addPages() {
		supplierFixtureEditorPage = new SupplierFixtureEditorPage(this, fixture.getID(), fixture.getName(), fixture);
		try {
			addPage(supplierFixtureEditorPage);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		
		fixture.setName(supplierFixtureEditorPage.getNameText().getText());
		fixture.setPrice(Integer.parseInt(supplierFixtureEditorPage.getPriceText().getText()));
		fixture.setAcquisitionTime(supplierFixtureEditorPage.getAcquisitionTimeText().getText());
		
		if (alreadyAdded) {
			try {
				transaction.setCommitComment("Add new fixture");
				transaction.commit();
			} catch (CommitException e) {
				e.printStackTrace();
				transaction.close();
			}
		} else {
			if (0 < transaction.getRootResource().getContents().size()) {
				MaterialsModel root = (MaterialsModel) transaction.getResource(CdoServiceManager.getInstance().getResourcePath()).getContents().get(0);
				root.getFixtures().add(fixture);
				
				try {
					transaction.setCommitComment("Add new fixture");
					transaction.commit();
				} catch (CommitException e) {
					e.printStackTrace();
					transaction.close();
				}
			} else {
				CDOResource resource = transaction.createResource(CdoServiceManager.getInstance().getResourcePath());
				MaterialsModel materialsModel = ModelFactoryImpl.eINSTANCE.createMaterialsModel();
				materialsModel.getFixtures().add(fixture);
				
				try {
					
					resource.getContents().add(materialsModel);
					transaction.setCommitComment("Create model and first fixture");
					transaction.commit();
				} catch (CommitException e) {
					e.printStackTrace();
					transaction.close();
				}
			}
		}
		
		
		IViewPart viewPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(SupplierFixturesView.ID);
		if (viewPart instanceof SupplierFixturesView) {
			SupplierFixturesView fixturesView = (SupplierFixturesView) viewPart;
			fixturesView.refresh();
		}
		
		dirty = false;
		firePropertyChange(PROP_DIRTY);
		setPartName(fixture.getName());
	}

	@Override
	public void doSaveAs() {
		
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
	
	public static void openSupplierEditor(final Fixture fixture) {
		final Display display = null == Display.getCurrent() ? Display.getDefault() : Display.getCurrent();
		display.asyncExec(new Runnable() {
			final SupplierFixtureEditorInput editorInput = new SupplierFixtureEditorInput(fixture);
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
			fixture = transaction.getObject((Fixture) (((SupplierFixtureEditorInput) (input)).getFixture()));
			alreadyAdded = true;
		} catch (Exception e) {
			alreadyAdded = false;
			fixture = ((Fixture) (((SupplierFixtureEditorInput) (input)).getFixture()));
		}
		setPartName(fixture.getName());
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

}

