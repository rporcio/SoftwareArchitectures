package hu.bme.aut.procurementofmaterials.editorinput;

import model.ComplexFixture;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;


public class ProducerComplexFixtureEditorInput implements IEditorInput {

	private final ComplexFixture complexFixture;
	private final String ID;

	public ProducerComplexFixtureEditorInput(ComplexFixture complexFixture) {
		this.complexFixture = complexFixture;
		ID = complexFixture.getID();
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
		ProducerComplexFixtureEditorInput other = (ProducerComplexFixtureEditorInput) obj;
		if (!ID.equals(other.getID())) {
			return false;
		}
		return true;
	}

	@Override
	public String getToolTipText() {
		return "Complex fixture editor";
	}

	public String getID() {
		return ID;
	}

	public ComplexFixture getComplexFixture() {
		return complexFixture;
	}

}
