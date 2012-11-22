package hu.bme.aut.procurementofmaterials.editorinput;

import model.FinishedProduct;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class ProducerProductionTreeEditorInput  implements IEditorInput {
	private final FinishedProduct finishedProduct;
	private final String ID;

	public ProducerProductionTreeEditorInput(FinishedProduct finishedProduct) {
		this.finishedProduct = finishedProduct;
		ID = finishedProduct.getID();
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
		ProducerProductionTreeEditorInput other = (ProducerProductionTreeEditorInput) obj;
		if (!ID.equals(other.getID())) {
			return false;
		}
		return true;
	}

	@Override
	public String getToolTipText() {
		return "Finished product editor";
	}

	public String getID() {
		return ID;
	}

	public FinishedProduct getFinishedProduct() {
		return finishedProduct;
	}

}
