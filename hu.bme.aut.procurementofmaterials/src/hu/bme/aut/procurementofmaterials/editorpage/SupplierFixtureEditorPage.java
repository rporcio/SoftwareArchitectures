package hu.bme.aut.procurementofmaterials.editorpage;

import hu.bme.aut.procurementofmaterials.editor.SupplierFixtureEditor;
import model.Fixture;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public class SupplierFixtureEditorPage extends FormPage {

	private FormToolkit toolkit;
	private ScrolledForm form;
	
	private final SupplierFixtureEditor editor;
	private final Fixture fixture;
	private Text nameText;
	private Text priceText;
	private Text acquisitionTimeText;

	public SupplierFixtureEditorPage(SupplierFixtureEditor editor, String id, String title, Fixture fixture) {
		super(editor, id, title);
		this.editor = editor;
		this.fixture = fixture;
	}
	
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		toolkit = managedForm.getToolkit();
		form = managedForm.getForm();
		
		toolkit.decorateFormHeading(form.getForm());
		form.setText("Fixture");
		
		Composite parent = form.getBody();
		parent.setLayout(new GridLayout(2, false));
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		toolkit.createLabel(parent, "ID:");
		Text idText = toolkit.createText(parent, fixture.getID());
		idText.setEnabled(false);
		
		toolkit.createLabel(parent, "Name:");
		nameText = toolkit.createText(parent, fixture.getName());
		toolkit.createLabel(parent, "Price:");
		if (fixture.getPrice() > 0) {
			priceText = toolkit.createText(parent, fixture.getPrice()+"");
		} else {
			priceText = toolkit.createText(parent, "");
		}
		toolkit.createLabel(parent, "Acquisition time (days):");
		acquisitionTimeText = toolkit.createText(parent, fixture.getAcquisitionTime());
		
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
		
		nameText.setLayoutData(gridData);
		priceText.setLayoutData(gridData);
		acquisitionTimeText.setLayoutData(gridData);
		
		nameText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				checkIfSaveable();
			}
		});
		
		acquisitionTimeText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				checkIfSaveable();
			}
		});
		
		priceText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				checkIfSaveable();
			}
		});
	}

	private void checkIfSaveable() {
		boolean name = true;
		boolean price = true;
		boolean number = true;
		
		if (nameText.getText().isEmpty()) {
			name = false;
		}
		
		if (!priceText.getText().isEmpty()) {
			try {
				Integer.parseInt(priceText.getText());
			} catch (Exception x) {
				price = false;
				return;
			}
		} else {
			price = false;
		}
		
		if (!acquisitionTimeText.getText().isEmpty()) {
			try {
				Integer.parseInt(acquisitionTimeText.getText());
			} catch (Exception x) {
				number = false;
				return;
			}
			
		} else {
			number = false;
		}
		
		editor.setDirty(name & price & number);
	}

	public Text getNameText() {
		return nameText;
	}

	public Text getAcquisitionTimeText() {
		return acquisitionTimeText;
	}


	public Text getPriceText() {
		return priceText;
	}
}
