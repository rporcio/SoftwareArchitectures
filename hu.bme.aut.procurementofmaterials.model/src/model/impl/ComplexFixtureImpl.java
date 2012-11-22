/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.impl;

import model.ComplexFixture;
import model.FixtureWithNumber;
import model.ModelPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Fixture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ComplexFixtureImpl#getID <em>ID</em>}</li>
 *   <li>{@link model.impl.ComplexFixtureImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.ComplexFixtureImpl#getFixtures <em>Fixtures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexFixtureImpl extends CDOObjectImpl implements ComplexFixture {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexFixtureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPLEX_FIXTURE;
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
		return (String)eGet(ModelPackage.Literals.COMPLEX_FIXTURE__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(ModelPackage.Literals.COMPLEX_FIXTURE__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ModelPackage.Literals.COMPLEX_FIXTURE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ModelPackage.Literals.COMPLEX_FIXTURE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FixtureWithNumber> getFixtures() {
		return (EList<FixtureWithNumber>)eGet(ModelPackage.Literals.COMPLEX_FIXTURE__FIXTURES, true);
	}

} //ComplexFixtureImpl
