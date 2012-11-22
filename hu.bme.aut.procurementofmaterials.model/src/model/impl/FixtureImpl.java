/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.impl;

import model.Fixture;
import model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.FixtureImpl#getID <em>ID</em>}</li>
 *   <li>{@link model.impl.FixtureImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link model.impl.FixtureImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.FixtureImpl#getAcquisitionTime <em>Acquisition Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixtureImpl extends CDOObjectImpl implements Fixture {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixtureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FIXTURE;
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
		return (String)eGet(ModelPackage.Literals.FIXTURE__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(ModelPackage.Literals.FIXTURE__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return (Integer)eGet(ModelPackage.Literals.FIXTURE__PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		eSet(ModelPackage.Literals.FIXTURE__PRICE, newPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ModelPackage.Literals.FIXTURE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ModelPackage.Literals.FIXTURE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcquisitionTime() {
		return (String)eGet(ModelPackage.Literals.FIXTURE__ACQUISITION_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcquisitionTime(String newAcquisitionTime) {
		eSet(ModelPackage.Literals.FIXTURE__ACQUISITION_TIME, newAcquisitionTime);
	}

} //FixtureImpl
