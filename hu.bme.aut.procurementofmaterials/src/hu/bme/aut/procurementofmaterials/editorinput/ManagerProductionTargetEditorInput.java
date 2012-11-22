package hu.bme.aut.procurementofmaterials.editorinput;

import model.ProductionTarget;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class ManagerProductionTargetEditorInput implements IEditorInput {
	private final ProductionTarget productionTarget;
	private final String ID;

	public ManagerProductionTargetEditorInput(ProductionTarget productionTarget) {
		this.productionTarget = productionTarget;
		ID = productionTarget.getID();
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
		ManagerProductionTargetEditorInput other = (ManagerProductionTargetEditorInput) obj;
		if (!ID.equals(other.getID())) {
			return false;
		}
		return true;
	}

	@Override
	public String getToolTipText() {
		return "Production target editor";
	}

	public String getID() {
		return ID;
	}

	public ProductionTarget getProductionTarget() {
		return productionTarget;
	}

}
