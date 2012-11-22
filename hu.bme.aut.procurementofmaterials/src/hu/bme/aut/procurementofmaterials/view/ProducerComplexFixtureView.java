package hu.bme.aut.procurementofmaterials.view;

import hu.bme.aut.procurementofmaterials.Activator;
import hu.bme.aut.procurementofmaterials.editor.ProducerComplexFixtureEditor;
import hu.bme.aut.procurementofmaterials.service.CdoServiceManager;
import model.ComplexFixture;
import model.MaterialsModel;

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

public class ProducerComplexFixtureView extends ViewPart {
	
	public static final String ID = "hu.bme.aut.procurementofmaterials.producercomplexfixtureview";

	private TableViewer viewer;
	private CDOTransaction transaction;
	private CdoServiceManager serviceManager;

	public ProducerComplexFixtureView() {
		serviceManager = CdoServiceManager.getInstance();
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
			if (parent instanceof EList<?>) {
				@SuppressWarnings("unchecked")
				EList<ComplexFixture> fixtures = (EList<ComplexFixture>) parent;
				return fixtures.toArray();
			}
	        return new Object[0];
		}
	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			if (obj instanceof ComplexFixture) {
				ComplexFixture fixture = (ComplexFixture) obj;
				return fixture.getName();
			}
			return "";
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return Activator.getImageDescriptor("icons/gear.png").createImage();
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
				ComplexFixture fixture = (ComplexFixture) ((IStructuredSelection) viewer.getSelection()).getFirstElement();
				ProducerComplexFixtureEditor.openProducerEditor(fixture);
			}
		});
	}

	private void getComponents() {
		transaction = serviceManager.openTransaction();
		if (0 < transaction.getRootResource().getContents().size()) {
			CDOResource resource = transaction.getResource(serviceManager.getResourcePath());
			MaterialsModel materialsModel = (MaterialsModel) resource.getContents().get(0);
			viewer.setInput(materialsModel.getComplexFixtures());
		} 
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
		viewer.setInput(materialsModel.getComplexFixtures());
	}
	
	@Override
	public void dispose() {
		super.dispose();
		transaction.close();
	}
}