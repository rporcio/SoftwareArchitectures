package hu.bme.aut.procurementofmaterials;

import hu.bme.aut.procurementofmaterials.authenticator.UserAuthenticator;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.setFixed(true);
		
		if (0 == UserAuthenticator.getInstance().getUserType()) {
			String editorArea = layout.getEditorArea();
			IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.25f, editorArea);
			topLeft.addView("hu.bme.aut.procurementofmaterials.managerproductiontargetview");
		} else if (1 == UserAuthenticator.getInstance().getUserType()) {
			String editorArea = layout.getEditorArea();
			IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.25f, editorArea);
			topLeft.addView("hu.bme.aut.procurementofmaterials.producerfinishedporductsview");

			IFolderLayout bottomLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, 0.50f, "topLeft");
			bottomLeft.addView("hu.bme.aut.procurementofmaterials.producercomplexfixtureview");
		} else if (2 == UserAuthenticator.getInstance().getUserType()) {
			String editorArea = layout.getEditorArea();
			IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.25f, editorArea);
			topLeft.addView("hu.bme.aut.procurementofmaterials.supplierpurchaselistview");

			IFolderLayout bottomLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, 0.50f, "topLeft");
			bottomLeft.addView("hu.bme.aut.procurementofmaterials.supplierfixturesview");
		}
	}

}
