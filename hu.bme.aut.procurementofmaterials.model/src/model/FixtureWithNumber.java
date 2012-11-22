/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixture With Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.FixtureWithNumber#getNumbers <em>Numbers</em>}</li>
 *   <li>{@link model.FixtureWithNumber#getFixtureID <em>Fixture ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getFixtureWithNumber()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface FixtureWithNumber extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numbers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numbers</em>' attribute.
	 * @see #setNumbers(int)
	 * @see model.ModelPackage#getFixtureWithNumber_Numbers()
	 * @model
	 * @generated
	 */
	int getNumbers();

	/**
	 * Sets the value of the '{@link model.FixtureWithNumber#getNumbers <em>Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numbers</em>' attribute.
	 * @see #getNumbers()
	 * @generated
	 */
	void setNumbers(int value);

	/**
	 * Returns the value of the '<em><b>Fixture ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixture ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixture ID</em>' attribute.
	 * @see #setFixtureID(String)
	 * @see model.ModelPackage#getFixtureWithNumber_FixtureID()
	 * @model
	 * @generated
	 */
	String getFixtureID();

	/**
	 * Sets the value of the '{@link model.FixtureWithNumber#getFixtureID <em>Fixture ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixture ID</em>' attribute.
	 * @see #getFixtureID()
	 * @generated
	 */
	void setFixtureID(String value);

} // FixtureWithNumber
