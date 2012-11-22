package hu.bme.aut.procurementofmaterials.editor;

import hu.bme.aut.procurementofmaterials.editorinput.ProducerProductionTreeEditorInput;
import hu.bme.aut.procurementofmaterials.editorpage.ProducerProductionTreeEditorPage;
import model.FinishedProduct;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.editor.FormEditor;

public class ProducerProductionTreeEditor extends FormEditor {
	public static final String ID = "hu.bme.aut.procurementofmaterials.producerproductiontreeeditor";
	private FinishedProduct finsihedProduct;
	private ProducerProductionTreeEditorPage fixtureEditorPage;
	private ProducerProductionTreeEditorInput treeEditorInput;
	
	@Override
	protected void addPages() {
		fixtureEditorPage = new ProducerProductionTreeEditorPage(this, finsihedProduct.getID() + 1, finsihedProduct.getName(), finsihedProduct);
		try {
			addPage(fixtureEditorPage);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		
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
			final ProducerProductionTreeEditorInput editorInput = new ProducerProductionTreeEditorInput(finishedProduct);
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
		treeEditorInput = (ProducerProductionTreeEditorInput) input;
		finsihedProduct = treeEditorInput.getFinishedProduct();
		setPartName(finsihedProduct.getName() + " production tree");
	}
	
	@Override
	public boolean isDirty() {
		return false;
	}

}
