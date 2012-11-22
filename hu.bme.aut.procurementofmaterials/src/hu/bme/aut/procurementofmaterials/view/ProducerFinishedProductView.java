package hu.bme.aut.procurementofmaterials.view;

import hu.bme.aut.procurementofmaterials.Activator;
import hu.bme.aut.procurementofmaterials.IDGenerator;
import hu.bme.aut.procurementofmaterials.editor.ProducerFinishedProductEditor;
import hu.bme.aut.procurementofmaterials.editor.ProducerProductionTreeEditor;
import hu.bme.aut.procurementofmaterials.service.CdoServiceManager;
import model.FinishedProduct;
import model.MaterialsModel;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class ProducerFinishedProductView extends ViewPart {

	public static final String ID = "hu.bme.aut.procurementofmaterials.producerfinishedporductsview";

	private TreeViewer viewer;
	private CDOTransaction transaction;
	private CdoServiceManager serviceManager;

	public ProducerFinishedProductView() {
		serviceManager = CdoServiceManager.getInstance();
	}

	/**
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */
	class ViewContentProvider implements ITreeContentProvider {

		  @Override
		  public void dispose() {
		  }

		  @Override
		  public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		  }

		  @Override
		  public Object[] getElements(Object inputElement) {
		    if (inputElement instanceof EList<?>) {
				@SuppressWarnings("unchecked")
				EList<FinishedProduct> finishedProducts = (EList<FinishedProduct>) inputElement;
				return finishedProducts.toArray();
			}
	        return new Object[0];
		  }

		  @Override
		  public Object[] getChildren(Object parentElement) {
		    if (parentElement instanceof FinishedProduct) {
		    	FinishedProduct product = (FinishedProduct) parentElement;
		    	return new Object[] {new ProductionTree(product)};
		    }
		    return null;
		  }

		  @Override
		  public Object getParent(Object element) {
		    return null;
		  }

		  @Override
		  public boolean hasChildren(Object element) {
		    if (element instanceof FinishedProduct) {
		    	FinishedProduct product = (FinishedProduct) element;
		    	return product.isHasProductionTree();
		    }
		    return false;
		  }

		} 

	class ViewLabelProvider extends LabelProvider {
		@Override
		public String getText(Object element) {
			if (element instanceof FinishedProduct) {
				FinishedProduct finishedProduct = (FinishedProduct) element;
				return finishedProduct.getName();
			} else if (element instanceof ProductionTree) {
				ProductionTree productionTree = (ProductionTree) element;
				return productionTree.getName();
			}
			return "";
		}

		@Override
		public Image getImage(Object element) {
			if (element instanceof FinishedProduct) {
				return Activator.getImageDescriptor("icons/stamp.png").createImage();
			}
			return Activator.getImageDescriptor("icons/document-tree.png").createImage();
		}
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		getSite().setSelectionProvider(viewer);
		getComponents();
		
		
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				Object element = ((IStructuredSelection) viewer.getSelection()).getFirstElement();
				if (element instanceof FinishedProduct) {
					FinishedProduct finishedProduct = (FinishedProduct) element;
					ProducerFinishedProductEditor.openFinishedProductEditor(finishedProduct);
				} else if (element instanceof ProductionTree){
					ProductionTree tree = (ProductionTree) element;
					ProducerProductionTreeEditor.openFinishedProductEditor(tree.getFinishedProduct());
				}
			}
		});
	}

	private void getComponents() {
		transaction = serviceManager.openTransaction();
		if (0 < transaction.getRootResource().getContents().size()) {
			CDOResource resource = transaction.getResource(serviceManager.getResourcePath());
			MaterialsModel materialsModel = (MaterialsModel) resource.getContents().get(0);
			viewer.setInput(materialsModel.getFinishedProducts());
		} 
	}
	
	public class ProductionTree {
		private String ID;
		private String name;
		private FinishedProduct finishedProduct;
		
		public ProductionTree(FinishedProduct finishedProduct) {
			this.finishedProduct = finishedProduct;
			ID = IDGenerator.generateUniqueID();
			name = finishedProduct.getName() + " production tree";
		}

		public String getID() {
			return ID;
		}

		public void setID(String iD) {
			ID = iD;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public FinishedProduct getFinishedProduct() {
			return finishedProduct;
		}

		public void setFinishedProduct(FinishedProduct finishedProduct) {
			this.finishedProduct = finishedProduct;
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
		viewer.setInput(materialsModel.getFinishedProducts());
	}
	
	@Override
	public void dispose() {
		super.dispose();
		transaction.close();
	}
}