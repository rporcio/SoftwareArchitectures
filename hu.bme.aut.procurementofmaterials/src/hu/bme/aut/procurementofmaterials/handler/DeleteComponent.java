package hu.bme.aut.procurementofmaterials.handler;

import hu.bme.aut.procurementofmaterials.authenticator.UserAuthenticator;
import hu.bme.aut.procurementofmaterials.editor.ManagerProductionTargetEditor;
import hu.bme.aut.procurementofmaterials.editor.ProducerComplexFixtureEditor;
import hu.bme.aut.procurementofmaterials.editor.ProducerFinishedProductEditor;
import hu.bme.aut.procurementofmaterials.editor.SupplierFixtureEditor;
import hu.bme.aut.procurementofmaterials.editorinput.ManagerProductionTargetEditorInput;
import hu.bme.aut.procurementofmaterials.editorinput.ProducerComplexFixtureEditorInput;
import hu.bme.aut.procurementofmaterials.editorinput.ProducerFinishedProductEditorInput;
import hu.bme.aut.procurementofmaterials.editorinput.SupplierFixtureEditorInput;
import hu.bme.aut.procurementofmaterials.service.CdoServiceManager;
import model.ComplexFixture;
import model.FinishedProduct;
import model.Fixture;
import model.ProductionTarget;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class DeleteComponent extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		Object element = selection.getFirstElement();
		CDOTransaction transaction = CdoServiceManager.getInstance().openTransaction();
		
		if (null == element) {
			MessageDialog.openError(
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"Error",  //$NON-NLS-1$
					"No component is selected!");  //$NON-NLS-1$
			transaction.close();
			return null;
		}
		
		try{
			if (element instanceof Fixture) {
				if (2 == UserAuthenticator.getInstance().getUserType()) {
					deleteFixture(element, transaction);
				} else {
					showErrorMessage();
				}
			} else if (element instanceof ComplexFixture) {
				if (1 == UserAuthenticator.getInstance().getUserType()) {
					deleteComplexFixture(element, transaction);
				} else {
					showErrorMessage();
				}
			} else if (element instanceof FinishedProduct) {
				if (1 == UserAuthenticator.getInstance().getUserType()) {
					deleteFinishProduct(element, transaction);
				} else {
					showErrorMessage();
				}
			} else if (element instanceof ProductionTarget) {
				if (1 == UserAuthenticator.getInstance().getUserType()) {
					deleteProductionTarget(element, transaction);
				} else {
					showErrorMessage();
				}
			} else {
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			transaction.close();
		}
		
		return null;
	}

	private void showErrorMessage() {
		MessageDialog.openError(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				"Error",  //$NON-NLS-1$
				"Non authorised action!");  //$NON-NLS-1$
	}

	private void deleteFixture(Object element, CDOTransaction transaction) throws CommitException {
		Fixture fixture = transaction.getObject((Fixture) element);
		EcoreUtil.delete(fixture);
		transaction.commit();
		
		SupplierFixtureEditorInput input = new SupplierFixtureEditorInput(fixture);
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findEditor(input);
		if (editor instanceof SupplierFixtureEditor) {
			SupplierFixtureEditor fixtureEditor = (SupplierFixtureEditor) editor;
			fixtureEditor.close(false);
		}
		
	}

	private void deleteComplexFixture(Object element, CDOTransaction transaction) throws CommitException {
		ComplexFixture complexFixture = transaction.getObject((ComplexFixture) element);
		EcoreUtil.delete(complexFixture);
		transaction.commit();
		
		ProducerComplexFixtureEditorInput input = new ProducerComplexFixtureEditorInput(complexFixture);
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findEditor(input);
		if (editor instanceof ProducerComplexFixtureEditor) {
			ProducerComplexFixtureEditor complexFixtureEditor = (ProducerComplexFixtureEditor) editor;
			complexFixtureEditor.close(false);
		}
	}

	private void deleteFinishProduct(Object element, CDOTransaction transaction) throws CommitException {
		FinishedProduct finishedProduct = transaction.getObject((FinishedProduct) element);
		EcoreUtil.delete(finishedProduct);
		transaction.commit();
		
		ProducerFinishedProductEditorInput input = new ProducerFinishedProductEditorInput(finishedProduct);
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findEditor(input);
		if (editor instanceof ProducerFinishedProductEditor) {
			ProducerFinishedProductEditor finishedProductEditor = (ProducerFinishedProductEditor) editor;
			finishedProductEditor.close(false);
		}
	}

	private void deleteProductionTarget(Object element, CDOTransaction transaction) throws CommitException {
		ProductionTarget productionTarget = transaction.getObject((ProductionTarget) element);
		EcoreUtil.delete(productionTarget);
		transaction.commit();
		
		ManagerProductionTargetEditorInput input = new ManagerProductionTargetEditorInput(productionTarget);
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findEditor(input);
		if (editor instanceof ManagerProductionTargetEditor) {
			ManagerProductionTargetEditor productionTargetEditor = (ManagerProductionTargetEditor) editor;
			productionTargetEditor.close(false);
		}
	}
}
