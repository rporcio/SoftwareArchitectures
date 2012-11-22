/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.impl;

import model.FinishedPorductWIthNumber;
import model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finished Porduct WIth Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.FinishedPorductWIthNumberImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link model.impl.FinishedPorductWIthNumberImpl#getFinisshedProductID <em>Finisshed Product ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FinishedPorductWIthNumberImpl extends CDOObjectImpl implements FinishedPorductWIthNumber {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinishedPorductWIthNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FINISHED_PORDUCT_WITH_NUMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return (Integer)eGet(ModelPackage.Literals.FINISHED_PORDUCT_WITH_NUMBER__NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		eSet(ModelPackage.Literals.FINISHED_PORDUCT_WITH_NUMBER__NUMBER, newNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinisshedProductID() {
		return (String)eGet(ModelPackage.Literals.FINISHED_PORDUCT_WITH_NUMBER__FINISSHED_PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinisshedProductID(String newFinisshedProductID) {
		eSet(ModelPackage.Literals.FINISHED_PORDUCT_WITH_NUMBER__FINISSHED_PRODUCT_ID, newFinisshedProductID);
	}

} //FinishedPorductWIthNumberImpl
