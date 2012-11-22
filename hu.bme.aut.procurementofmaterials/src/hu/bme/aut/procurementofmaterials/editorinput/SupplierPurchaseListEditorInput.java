package hu.bme.aut.procurementofmaterials.editorinput;

import hu.bme.aut.procurementofmaterials.view.SupplierPurchaseListView.PurchaseList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class SupplierPurchaseListEditorInput implements IEditorInput {
	private final String ID;
	private final PurchaseList purchaseList;
	
	public SupplierPurchaseListEditorInput(PurchaseList purchaseList) {
		this.purchaseList = purchaseList;
		this.ID = purchaseList.getID();
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		return null;
	}

	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return ID;
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Integer.parseInt(ID);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SupplierPurchaseListEditorInput other = (SupplierPurchaseListEditorInput) obj;
		if (!ID.equals(other.getID())) {
			return false;
		}
		return true;
	}

	@Override
	public String getToolTipText() {
		return "Purchase list";
	}

	public String getID() {
		return ID;
	}

	public PurchaseList getPurchaseList() {
		return purchaseList;
	}

}

