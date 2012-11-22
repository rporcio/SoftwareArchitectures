/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.impl;

import model.FixtureWithNumber;
import model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixture With Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.FixtureWithNumberImpl#getNumbers <em>Numbers</em>}</li>
 *   <li>{@link model.impl.FixtureWithNumberImpl#getFixtureID <em>Fixture ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixtureWithNumberImpl extends CDOObjectImpl implements FixtureWithNumber {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixtureWithNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FIXTURE_WITH_NUMBER;
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
		return (Integer)eGet(ModelPackage.Literals.FIXTURE_WITH_NUMBER__NUMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumbers(int newNumbers) {
		eSet(ModelPackage.Literals.FIXTURE_WITH_NUMBER__NUMBERS, newNumbers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFixtureID() {
		return (String)eGet(ModelPackage.Literals.FIXTURE_WITH_NUMBER__FIXTURE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixtureID(String newFixtureID) {
		eSet(ModelPackage.Literals.FIXTURE_WITH_NUMBER__FIXTURE_ID, newFixtureID);
	}

} //FixtureWithNumberImpl
