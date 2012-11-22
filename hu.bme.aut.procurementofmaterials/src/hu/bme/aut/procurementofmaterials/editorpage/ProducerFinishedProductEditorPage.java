package hu.bme.aut.procurementofmaterials.editorpage;

import hu.bme.aut.procurementofmaterials.Activator;
import hu.bme.aut.procurementofmaterials.editor.ProducerFinishedProductEditor;
import hu.bme.aut.procurementofmaterials.model.EditableTableItem;
import hu.bme.aut.procurementofmaterials.service.CdoServiceManager;

import java.util.List;

import model.ComplexFixture;
import model.ComplexFixtureWithNumber;
import model.FinishedProduct;
import model.Fixture;
import model.FixtureWithNumber;
import model.MaterialsModel;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public class ProducerFinishedProductEditorPage  extends FormPage {
	private static final String NUMBER_PROPERTY = "number";
	private static final String INDEX_PROPERTY = "index";
	private static String[] VALUE_SET;
	
	private FormToolkit toolkit;
	private ScrolledForm form;
	private final FinishedProduct finishedProduct;
	private Text nameText;
	private Composite parent;
	private TableViewer viewer;
	private Button hasProductionTreeButton;

	private final ProducerFinishedProductEditor editor;
	private final List<EditableTableItem> tableitems;

	private Action addMember = new Action("Add new member", Activator.getImageDescriptor("icons/plus.png")) {

	    public void run() {
	      EditableTableItem newItem = new EditableTableItem("1", new Integer(0));
	      viewer.add(newItem);
	      tableitems.add(newItem);
	      if (!nameText.getText().isEmpty()) {
				editor.setDirty(true);
			} else {
				editor.setDirty(false);
			}
	    }
	  };
	

	public ProducerFinishedProductEditorPage(ProducerFinishedProductEditor editor, String id, String title, FinishedProduct finishedProduct, List<EditableTableItem> tableitems) {
		super(editor, id, title);
		this.editor = editor;
		this.finishedProduct = finishedProduct;
		this.tableitems = tableitems;
		
		int i = 0;
		MaterialsModel materialsModel = (MaterialsModel) editor.getTransaction().getResource(CdoServiceManager.getInstance().getResourcePath()).getContents().get(0);
		VALUE_SET = new String[materialsModel.getFixtures().size() + materialsModel.getComplexFixtures().size()];
		for (Fixture f : materialsModel.getFixtures()) {
			VALUE_SET[i] = f.getName();
			i++;
		}
		for (ComplexFixture f : materialsModel.getComplexFixtures()) {
			VALUE_SET[i] = f.getName();
			i++;
		}
	}
	
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		toolkit = managedForm.getToolkit();
		form = managedForm.getForm();
		
		toolkit.decorateFormHeading(form.getForm());
		form.setText("Finished product");
		
		parent = form.getBody();
		
		FillLayout compositeLayout = new FillLayout();
		parent.setLayout(compositeLayout);
		
		parent.setLayout(new GridLayout(2, false));
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		toolkit.createLabel(parent, "Name:");
		nameText = toolkit.createText(parent, finishedProduct.getName());
		nameText.setLayoutData(gridData);
		toolkit.createLabel(parent, "Has Production Tree");
		hasProductionTreeButton = toolkit.createButton(parent, "", SWT.CHECK);
		hasProductionTreeButton.setSelection(finishedProduct.isHasProductionTree());
		hasProductionTreeButton.setLayoutData(gridData);
		nameText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				if (!nameText.getText().isEmpty() && !tableitems.isEmpty()) {
					for (EditableTableItem item : tableitems) {
						if (!item.number.isEmpty()) {
							try {
								Integer.parseInt(item.number);
							} catch (Exception x) {
								editor.setDirty(false);
							}
						} else {
							editor.setDirty(false);
						}
					}
					editor.setDirty(true);
				} else {
					editor.setDirty(false);
				}
			}
		});
		
		hasProductionTreeButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!nameText.getText().isEmpty() && !tableitems.isEmpty()) {
					for (EditableTableItem item : tableitems) {
						if (!item.number.isEmpty()) {
							try {
								Integer.parseInt(item.number);
							} catch (Exception x) {
								editor.setDirty(false);
							}
						} else {
							editor.setDirty(false);
						}
					}
					editor.setDirty(true);
				} else {
					editor.setDirty(false);
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		viewer = buildAndLayoutTable();
		final Table table = viewer.getTable();

	    attachContentProvider(viewer);
	    attachLabelProvider(viewer);
	    attachCellEditors(viewer, table);
	    
	    MaterialsModel root = (MaterialsModel) editor.getTransaction().getResource(CdoServiceManager.getInstance().getResourcePath()).getContents().get(0);
	    for (FixtureWithNumber fixtureWithNumber : finishedProduct.getFixtures()) {
	    	int i = 0;
	    	for (Fixture fixture : root.getFixtures()) {
				if (fixtureWithNumber.getFixtureID().equals(fixture.getID())) {
					EditableTableItem newItem = new EditableTableItem(fixtureWithNumber.getNumbers()+"", i);
					viewer.add(newItem);
					tableitems.add(newItem);
				}
				i++;
			}
		}
	    
	    for (ComplexFixtureWithNumber complexFixtureWithNumber : finishedProduct.getComplexFixtures()) {
	    	int i = root.getFixtures().size();
	    	for (ComplexFixture complexFixture : root.getComplexFixtures()) {
	    		if (complexFixture.getID().equals(complexFixtureWithNumber.getComplexFixtureID())) {
	    			EditableTableItem newItem = new EditableTableItem(complexFixtureWithNumber.getNumbers()+"", i);
					viewer.add(newItem);
					tableitems.add(newItem);
	    		}
	    		i++;
	    	}
	    }
	    
	    form.getToolBarManager().add(addMember);
		form.getToolBarManager().update(true);
		
		addMember.setToolTipText("Add a new product to the production target.");
	}
	
	
	private void attachLabelProvider(TableViewer viewer) {
		viewer.setLabelProvider(new ITableLabelProvider() {
			public Image getColumnImage(Object element, int columnIndex) {
				return null;
			}

			public String getColumnText(Object element, int columnIndex) {
				switch (columnIndex) {
				case 0:
					return ((EditableTableItem) element).number;
				case 1:
					Number index = ((EditableTableItem) element).index;
					return VALUE_SET[index.intValue()];
				default:
					return "Invalid column: " + columnIndex;
				}
			}

			public void addListener(ILabelProviderListener listener) {
			}

			public void dispose() {
			}

			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			public void removeListener(ILabelProviderListener lpl) {
			}

		});
	}

	private void attachContentProvider(TableViewer viewer) {
		viewer.setContentProvider(new IStructuredContentProvider() {
			public Object[] getElements(Object inputElement) {
				return (Object[]) inputElement;
			}

			public void dispose() {
			}

			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}
		});
	}

	private TableViewer buildAndLayoutTable() {
		TableViewer tableViewer = new TableViewer(parent, SWT.FULL_SELECTION|SWT.BORDER);
		Table table = tableViewer.getTable();

		TableLayout layout = new TableLayout();
		layout.addColumnData(new ColumnWeightData(50, 75, true));
		layout.addColumnData(new ColumnWeightData(50, 75, true));
		table.setLayout(layout);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.horizontalSpan = 2;
		table.setLayoutData(gridData);

		TableColumn nameColumn = new TableColumn(table, SWT.CENTER);
		nameColumn.setText("Number");
		TableColumn valColumn = new TableColumn(table, SWT.CENTER);
		valColumn.setText("Fixture");
		table.setHeaderVisible(true);
		return tableViewer;
	}

	private void attachCellEditors(final TableViewer viewer, Composite parent) {
		viewer.setCellModifier(new ICellModifier() {
			public boolean canModify(Object element, String property) {
				return true;
			}

			public Object getValue(Object element, String property) {
				if (NUMBER_PROPERTY.equals(property))
					return ((EditableTableItem) element).number;
				else
					return ((EditableTableItem) element).index;
			}

			public void modify(Object element, String property, Object value) {
				TableItem tableItem = (TableItem) element;
				EditableTableItem data = (EditableTableItem) tableItem
						.getData();
				if (NUMBER_PROPERTY.equals(property)) {
					data.number = value.toString();
					try {
						Integer.parseInt(data.number);
					} catch (Exception e) {
						editor.setDirty(false);
						viewer.refresh(data);
						return;
					}
					if (!data.number.isEmpty() && Integer.parseInt(data.number) > 0) {
						if (!nameText.getText().isEmpty()) {
							editor.setDirty(true);
						} else {
							editor.setDirty(false);
						}
					} else {
						editor.setDirty(false);
					}
				} else {
					data.index = (Integer) value;
					if (!nameText.getText().isEmpty()) {
						editor.setDirty(true);
					} else {
						editor.setDirty(false);
					}
				}

				viewer.refresh(data);
			}
		});

		viewer.setCellEditors(new CellEditor[] { new TextCellEditor(parent),
				new ComboBoxCellEditor(parent, VALUE_SET) });

		viewer.setColumnProperties(new String[] { NUMBER_PROPERTY,
				INDEX_PROPERTY });
	}

	public Text getNameText() {
		return nameText;
	}

	public void setNameText(Text nameText) {
		this.nameText = nameText;
	}

	public Button getHasProductionTreeButton() {
		return hasProductionTreeButton;
	}

	public void setHasProductionTreeButton(Button hasProductionTreeButton) {
		this.hasProductionTreeButton = hasProductionTreeButton;
	}

}
