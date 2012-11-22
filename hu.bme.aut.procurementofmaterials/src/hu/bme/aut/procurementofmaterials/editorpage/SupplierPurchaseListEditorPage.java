package hu.bme.aut.procurementofmaterials.editorpage;

import hu.bme.aut.procurementofmaterials.view.SupplierPurchaseListView.PurchaseList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public class SupplierPurchaseListEditorPage extends FormPage {

	private final PurchaseList purchaseList;
	private FormToolkit toolkit;
	private ScrolledForm form;

	public SupplierPurchaseListEditorPage(FormEditor editor, String id,	String title, PurchaseList purchaseList) {
		super(editor, id, title);
		this.purchaseList = purchaseList;
	}

	@Override
	protected void createFormContent(IManagedForm managedForm) {
		toolkit = managedForm.getToolkit();
		form = managedForm.getForm();
		
		toolkit.decorateFormHeading(form.getForm());
		form.setText("Purchasing product");
		
		Composite parent = form.getBody();
		parent.setLayout(new GridLayout(2, false));
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		toolkit.createLabel(parent, "Fixture id:");
		Text idText = toolkit.createText(parent, purchaseList.getFixtureID());
		idText.setEnabled(false);
		
		toolkit.createLabel(parent, "Fixture name:");
		Text nameText = toolkit.createText(parent, purchaseList.getFixtureName());
		nameText.setEnabled(false);
		
		toolkit.createLabel(parent, "Number:");
		Text numberText = toolkit.createText(parent, purchaseList.getFixtureNumber()+"");
		numberText.setEnabled(false);
		
		toolkit.createLabel(parent, "Deadline:");
		Text deadlineText = toolkit.createText(parent, purchaseList.getDeadline());
		deadlineText.setEnabled(false);
		
		
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
		
		idText.setLayoutData(gridData);
		nameText.setLayoutData(gridData);
		numberText.setLayoutData(gridData);
		deadlineText.setLayoutData(gridData);
	}
}
