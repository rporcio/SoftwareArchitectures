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
 * A representation of the model object '<em><b>Complex Fixture With Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.ComplexFixtureWithNumber#getNumbers <em>Numbers</em>}</li>
 *   <li>{@link model.ComplexFixtureWithNumber#getComplexFixtureID <em>Complex Fixture ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getComplexFixtureWithNumber()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ComplexFixtureWithNumber extends CDOObject {
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
	 * @see model.ModelPackage#getComplexFixtureWithNumber_Numbers()
	 * @model
	 * @generated
	 */
	int getNumbers();

	/**
	 * Sets the value of the '{@link model.ComplexFixtureWithNumber#getNumbers <em>Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numbers</em>' attribute.
	 * @see #getNumbers()
	 * @generated
	 */
	void setNumbers(int value);

	/**
	 * Returns the value of the '<em><b>Complex Fixture ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Fixture ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Fixture ID</em>' attribute.
	 * @see #setComplexFixtureID(String)
	 * @see model.ModelPackage#getComplexFixtureWithNumber_ComplexFixtureID()
	 * @model
	 * @generated
	 */
	String getComplexFixtureID();

	/**
	 * Sets the value of the '{@link model.ComplexFixtureWithNumber#getComplexFixtureID <em>Complex Fixture ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Fixture ID</em>' attribute.
	 * @see #getComplexFixtureID()
	 * @generated
	 */
	void setComplexFixtureID(String value);

} // ComplexFixtureWithNumber
