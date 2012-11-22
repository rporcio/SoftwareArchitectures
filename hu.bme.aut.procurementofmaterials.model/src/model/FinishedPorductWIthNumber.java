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
 * A representation of the model object '<em><b>Finished Porduct WIth Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.FinishedPorductWIthNumber#getNumber <em>Number</em>}</li>
 *   <li>{@link model.FinishedPorductWIthNumber#getFinisshedProductID <em>Finisshed Product ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getFinishedPorductWIthNumber()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface FinishedPorductWIthNumber extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see model.ModelPackage#getFinishedPorductWIthNumber_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link model.FinishedPorductWIthNumber#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Finisshed Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finisshed Product ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finisshed Product ID</em>' attribute.
	 * @see #setFinisshedProductID(String)
	 * @see model.ModelPackage#getFinishedPorductWIthNumber_FinisshedProductID()
	 * @model
	 * @generated
	 */
	String getFinisshedProductID();

	/**
	 * Sets the value of the '{@link model.FinishedPorductWIthNumber#getFinisshedProductID <em>Finisshed Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finisshed Product ID</em>' attribute.
	 * @see #getFinisshedProductID()
	 * @generated
	 */
	void setFinisshedProductID(String value);

} // FinishedPorductWIthNumber
