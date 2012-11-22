package hu.bme.aut.procurementofmaterials.view;

import hu.bme.aut.procurementofmaterials.Activator;
import hu.bme.aut.procurementofmaterials.IDGenerator;
import hu.bme.aut.procurementofmaterials.editor.SupplierPurchaseListEditor;
import hu.bme.aut.procurementofmaterials.service.CdoServiceManager;

import java.util.ArrayList;
import java.util.List;

import model.ComplexFixture;
import model.ComplexFixtureWithNumber;
import model.FinishedPorductWIthNumber;
import model.FinishedProduct;
import model.Fixture;
import model.FixtureWithNumber;
import model.MaterialsModel;
import model.ProductionTarget;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class SupplierPurchaseListView extends ViewPart {

public static final String ID = "hu.bme.aut.procurementofmaterials.supplierpurchaselistview";
	
	private TableViewer viewer;
	private CDOTransaction transaction;
	private CdoServiceManager serviceManager;
	private List<PurchaseList> purchaseLists;

	public SupplierPurchaseListView() {
		serviceManager = CdoServiceManager.getInstance();
		purchaseLists = new ArrayList<PurchaseList>();
	}

	/**
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */
	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			if (parent instanceof List<?>) {
				@SuppressWarnings("unchecked")
				List<PurchaseList> purchaseLists = (List<PurchaseList>) parent;
				return purchaseLists.toArray();
			}
	        return new Object[0];
		}
	}

	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			if (obj instanceof PurchaseList) {
				PurchaseList purchaseList = (PurchaseList) obj;
				return purchaseList.getFixtureName() + " - " + purchaseList.getDeadline(); 
			}
			return "";
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return Activator.getImageDescriptor("icons/clipboard-list.png").createImage();
		}
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		getSite().setSelectionProvider(viewer);
		getComponents();
		
		
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				PurchaseList purchaseList = (PurchaseList) ((IStructuredSelection) viewer.getSelection()).getFirstElement();
				SupplierPurchaseListEditor.openSupplierPurchaseListEditor(purchaseList);
			}
		});
	}

	private void getComponents() {
		transaction = serviceManager.openTransaction();
		if (0 < transaction.getRootResource().getContents().size()) {
			CDOResource resource = transaction.getResource(serviceManager.getResourcePath());
			MaterialsModel materialsModel = (MaterialsModel) resource.getContents().get(0);
			if (0 != materialsModel.getProductionTargets().size()) {
				producePurchaseLists(materialsModel);
			}
			viewer.setInput(purchaseLists);
		} 
	}

	private void producePurchaseLists(MaterialsModel materialsModel) {
		EList<FinishedProduct> finishedProducts = materialsModel.getFinishedProducts();
		EList<ComplexFixture> complexFixtures = materialsModel.getComplexFixtures();
		EList<Fixture> fixtures = materialsModel.getFixtures();
		for (ProductionTarget productionTarget : materialsModel.getProductionTargets()) {
			for (FinishedPorductWIthNumber finishedPorductWIthNumber : productionTarget.getFinishedProducts()) {
				FinishedProduct fP = getFinishedProduct(finishedPorductWIthNumber.getFinisshedProductID(), finishedProducts);
				for (FixtureWithNumber fixtureWithNumber : fP.getFixtures()) {
					Fixture f = getFixture(fixtureWithNumber.getFixtureID(), fixtures);
					purchaseLists.add(new PurchaseList(f.getName(), f.getID(), productionTarget.getDeadline(), fixtureWithNumber.getNumbers()));
				}
				for (ComplexFixtureWithNumber complexFixtureWithNumber : fP.getComplexFixtures()) {
					ComplexFixture cF = getComplexFixture(complexFixtureWithNumber.getComplexFixtureID(), complexFixtures);
					for (FixtureWithNumber fixtureWithNumber : cF.getFixtures()) {
						Fixture f = getFixture(fixtureWithNumber.getFixtureID(), fixtures);
						purchaseLists.add(new PurchaseList(f.getName(), f.getID(), productionTarget.getDeadline(), fixtureWithNumber.getNumbers()));
					}
				}
			}
		}
	}

	private ComplexFixture getComplexFixture(String complexFixtureID, EList<ComplexFixture> complexFixtures) {
		for (ComplexFixture complexFixture : complexFixtures) {
			if (complexFixture.getID().equals(complexFixtureID)) {
				return complexFixture;
			}
		}
		return null;
	}

	private Fixture getFixture(String fixtureID, EList<Fixture> fixtures) {
		for (Fixture fixture : fixtures) {
			if (fixture.getID().equals(fixtureID)) {
				return fixture;
			}
		}
		return null;
	}

	private FinishedProduct getFinishedProduct(String finisshedProductID, EList<FinishedProduct> finishedProducts) {
		for (FinishedProduct finishedProduct : finishedProducts) {
			if (finishedProduct.getID().equals(finisshedProductID)) {
				return finishedProduct;
			}
		}
		
		return null;
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public void refresh() {
		CDOResource resource = transaction.getResource(serviceManager.getResourcePath());
		MaterialsModel materialsModel = (MaterialsModel) resource.getContents().get(0);
		viewer.setInput(materialsModel.getFixtures());
		viewer.refresh();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		transaction.close();
	}
	
	public class PurchaseList {
		private String ID;
		private String fixtureName;
		private String fixtureID;
		private String deadline;
		private int fixtureNumber;
		
		public PurchaseList(String fixtureName, String fixtureID, String deadline, int fixtureNumber) {
			ID = IDGenerator.generateUniqueID();
			this.fixtureID = fixtureID;
			this.fixtureName = fixtureName;
			this.deadline = deadline;
			this.fixtureNumber = fixtureNumber;
		}
		
		public String getFixtureName() {
			return fixtureName;
		}
		public void setFixtureName(String fixtureName) {
			this.fixtureName = fixtureName;
		}
		public String getFixtureID() {
			return fixtureID;
		}
		public void setFixtureID(String fixtureID) {
			this.fixtureID = fixtureID;
		}
		public String getDeadline() {
			return deadline;
		}
		public void setDeadline(String deadline) {
			this.deadline = deadline;
		}
		public int getFixtureNumber() {
			return fixtureNumber;
		}
		public void setFixtureNumber(int fixtureNumber) {
			this.fixtureNumber = fixtureNumber;
		}

		public String getID() {
			return ID;
		}

		public void setID(String iD) {
			ID = iD;
		}
		
	}
}
