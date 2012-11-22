/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.impl;

import model.ComplexFixtureWithNumber;
import model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Fixture With Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ComplexFixtureWithNumberImpl#getNumbers <em>Numbers</em>}</li>
 *   <li>{@link model.impl.ComplexFixtureWithNumberImpl#getComplexFixtureID <em>Complex Fixture ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexFixtureWithNumberImpl extends CDOObjectImpl implements ComplexFixtureWithNumber {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexFixtureWithNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPLEX_FIXTURE_WITH_NUMBER;
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
	public int getNumbers() {
		return (Integer)eGet(ModelPackage.Literals.COMPLEX_FIXTURE_WITH_NUMBER__NUMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumbers(int newNumbers) {
		eSet(ModelPackage.Literals.COMPLEX_FIXTURE_WITH_NUMBER__NUMBERS, newNumbers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplexFixtureID() {
		return (String)eGet(ModelPackage.Literals.COMPLEX_FIXTURE_WITH_NUMBER__COMPLEX_FIXTURE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexFixtureID(String newComplexFixtureID) {
		eSet(ModelPackage.Literals.COMPLEX_FIXTURE_WITH_NUMBER__COMPLEX_FIXTURE_ID, newComplexFixtureID);
	}

} //ComplexFixtureWithNumberImpl
