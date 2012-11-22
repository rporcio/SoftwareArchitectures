/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.impl;

import model.FinishedPorductWIthNumber;
import model.ModelPackage;
import model.ProductionTarget;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Production Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ProductionTargetImpl#getID <em>ID</em>}</li>
 *   <li>{@link model.impl.ProductionTargetImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.ProductionTargetImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link model.impl.ProductionTargetImpl#getFinishedProducts <em>Finished Products</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductionTargetImpl extends CDOObjectImpl implements ProductionTarget {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductionTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PRODUCTION_TARGET;
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
	public String getID() {
		return (String)eGet(ModelPackage.Literals.PRODUCTION_TARGET__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(ModelPackage.Literals.PRODUCTION_TARGET__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ModelPackage.Literals.PRODUCTION_TARGET__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ModelPackage.Literals.PRODUCTION_TARGET__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeadline() {
		return (String)eGet(ModelPackage.Literals.PRODUCTION_TARGET__DEADLINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(String newDeadline) {
		eSet(ModelPackage.Literals.PRODUCTION_TARGET__DEADLINE, newDeadline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FinishedPorductWIthNumber> getFinishedProducts() {
		return (EList<FinishedPorductWIthNumber>)eGet(ModelPackage.Literals.PRODUCTION_TARGET__FINISHED_PRODUCTS, true);
	}

} //ProductionTargetImpl
