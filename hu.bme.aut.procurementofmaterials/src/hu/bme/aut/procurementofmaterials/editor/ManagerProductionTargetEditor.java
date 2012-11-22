package hu.bme.aut.procurementofmaterials.editor;

import hu.bme.aut.procurementofmaterials.editorinput.ManagerProductionTargetEditorInput;
import hu.bme.aut.procurementofmaterials.editorpage.ManagerProductionTargetEditorPage;
import hu.bme.aut.procurementofmaterials.model.EditableTableItem;
import hu.bme.aut.procurementofmaterials.service.CdoServiceManager;
import hu.bme.aut.procurementofmaterials.view.ManagerProductionTargetView;

import java.util.ArrayList;
import java.util.List;

import model.FinishedPorductWIthNumber;
import model.FinishedProduct;
import model.MaterialsModel;
import model.ProductionTarget;
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

public class ManagerProductionTargetEditor extends FormEditor {

	public static final String ID = "hu.bme.aut.procurementofmaterials.managerproductiontargeteditor";
	private boolean dirty = false;
	private CDOTransaction transaction;
	private ProductionTarget productionTarget;
	private boolean alreadyAdded;
	private ManagerProductionTargetEditorPage managerProductionTargetEditorPage;
	
	private List<EditableTableItem> tableitems;

	@Override
	protected void addPages() {
		managerProductionTargetEditorPage = new ManagerProductionTargetEditorPage(this, "", productionTarget.getName(), productionTarget,tableitems);
		try {
			addPage(managerProductionTargetEditorPage);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		
		productionTarget.setName(managerProductionTargetEditorPage.getNameText().getText());
		int year = managerProductionTargetEditorPage.getDateTime().getYear();
		int month = managerProductionTargetEditorPage.getDateTime().getMonth();
		int day = managerProductionTargetEditorPage.getDateTime().getDay();
		
		productionTarget.setDeadline(year + ":" + month + ":" + day);
		
		MaterialsModel root = (MaterialsModel) transaction.getResource(CdoServiceManager.getInstance().getResourcePath()).getContents().get(0);
		productionTarget.getFinishedProducts().clear();
		
		for (EditableTableItem item : tableitems) {
			FinishedProduct finishedProduct = root.getFinishedProducts().get(item.index);
			FinishedPorductWIthNumber finishedPorductWIthNumber = ModelFactoryImpl.eINSTANCE.createFinishedPorductWIthNumber();
			finishedPorductWIthNumber.setNumber(Integer.parseInt(item.number));
			finishedPorductWIthNumber.setFinisshedProductID(finishedProduct.getID());
			
			productionTarget.getFinishedProducts().add(finishedPorductWIthNumber);
		}
		
		if (alreadyAdded) {
			try {
				transaction.setCommitComment("Add new complex fixture");
				transaction.commit();
			} catch (CommitException e) {
				e.printStackTrace();
			}
		} else {
			if (0 < transaction.getRootResource().getContents().size()) {
				root.getProductionTargets().add(productionTarget);
				
				try {
					transaction.setCommitComment("Add new complex fixture");
					transaction.commit();
				} catch (CommitException e) {
					e.printStackTrace();
				}
			}
		}
		
		setPartName(productionTarget.getName());
		
		dirty = false;
		firePropertyChange(PROP_DIRTY);
		
		IViewPart viewPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(ManagerProductionTargetView.ID);
		if (viewPart instanceof ManagerProductionTargetView) {
			ManagerProductionTargetView targetView = (ManagerProductionTargetView) viewPart;
			targetView.refresh();
		}
	}

	@Override
	public void doSaveAs() {
		
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
	
	public static void openProductionTargetEditor(final ProductionTarget productionTarget) {
		final Display display = null == Display.getCurrent() ? Display.getDefault() : Display.getCurrent();
		display.asyncExec(new Runnable() {
			final ManagerProductionTargetEditorInput editorInput = new ManagerProductionTargetEditorInput(productionTarget);
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
			productionTarget = transaction.getObject((ProductionTarget) (((ManagerProductionTargetEditorInput) (input)).getProductionTarget()));
			alreadyAdded = true;
		} catch (Exception e) {
			alreadyAdded = false;
			productionTarget = ((ManagerProductionTargetEditorInput) input).getProductionTarget();
		}
		
		setPartName(productionTarget.getName());
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

	public ProductionTarget getProductionTarget() {
		return productionTarget;
	}

	public void setFixture(ProductionTarget productionTarget) {
		this.productionTarget = productionTarget;
	}
}
