package hu.bme.aut.procurementofmaterials.handler;

import hu.bme.aut.procurementofmaterials.IDGenerator;
import hu.bme.aut.procurementofmaterials.authenticator.UserAuthenticator;
import hu.bme.aut.procurementofmaterials.editor.ManagerProductionTargetEditor;
import hu.bme.aut.procurementofmaterials.editorinput.ManagerProductionTargetEditorInput;
import model.ProductionTarget;
import model.impl.ModelFactoryImpl;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class CreateNewProductionTarget extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (0 == UserAuthenticator.getInstance().getUserType()) {
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
			IWorkbenchPage page = window.getActivePage();
			
			ProductionTarget productionTarget = ModelFactoryImpl.eINSTANCE.createProductionTarget();
			productionTarget.setID(IDGenerator.generateUniqueID());
			productionTarget.setName("New production target");
			
			ManagerProductionTargetEditorInput input = new ManagerProductionTargetEditorInput(productionTarget);
			
			try {
				page.openEditor(input, ManagerProductionTargetEditor.ID);
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		} else {
			showErrorMessage();
		}
		
		return null;
	}
	
	@Override
	public boolean isEnabled() {
		if (0 == UserAuthenticator.getInstance().getUserType()) {
			return true;
		} else {
			return false;
		}
	}
	
	private void showErrorMessage() {
		MessageDialog.openError(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				"Error",  //$NON-NLS-1$
				"Non authorized action!");  //$NON-NLS-1$
	}
}
