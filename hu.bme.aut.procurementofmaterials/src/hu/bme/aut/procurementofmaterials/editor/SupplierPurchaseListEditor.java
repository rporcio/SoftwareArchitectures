package hu.bme.aut.procurementofmaterials.editor;

import hu.bme.aut.procurementofmaterials.editorinput.SupplierPurchaseListEditorInput;
import hu.bme.aut.procurementofmaterials.editorpage.SupplierPurchaseListEditorPage;
import hu.bme.aut.procurementofmaterials.view.SupplierPurchaseListView.PurchaseList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.editor.FormEditor;

public class SupplierPurchaseListEditor extends FormEditor {

	public static final String ID = "hu.bme.aut.procurementofmaterials.supplierpurchaselisteditor";
	private PurchaseList purchaseList;
	private SupplierPurchaseListEditorPage supplierPurchaseListEditorPage;

	@Override
	protected void addPages() {
		supplierPurchaseListEditorPage = new SupplierPurchaseListEditorPage(this, purchaseList.getFixtureID(), purchaseList.getFixtureName(), purchaseList);
		try {
			addPage(supplierPurchaseListEditorPage);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void doSaveAs() {

	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	public static void openSupplierPurchaseListEditor(final PurchaseList purchaseList) {
		final Display display = null == Display.getCurrent() ? Display.getDefault() : Display.getCurrent();
		display.asyncExec(new Runnable() {
			final SupplierPurchaseListEditorInput editorInput = new SupplierPurchaseListEditorInput(purchaseList);
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
		SupplierPurchaseListEditorInput editorInput = (SupplierPurchaseListEditorInput) input;
		purchaseList = editorInput.getPurchaseList();
		setPartName(purchaseList.getFixtureName());
	}


	@Override
	public void doSave(IProgressMonitor monitor) {
	}

}

