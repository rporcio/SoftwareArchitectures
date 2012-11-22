/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finished Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.FinishedProduct#getID <em>ID</em>}</li>
 *   <li>{@link model.FinishedProduct#getName <em>Name</em>}</li>
 *   <li>{@link model.FinishedProduct#getFixtures <em>Fixtures</em>}</li>
 *   <li>{@link model.FinishedProduct#getComplexFixtures <em>Complex Fixtures</em>}</li>
 *   <li>{@link model.FinishedProduct#getProductionTree <em>Production Tree</em>}</li>
 *   <li>{@link model.FinishedProduct#isHasProductionTree <em>Has Production Tree</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getFinishedProduct()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface FinishedProduct extends CDOObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see model.ModelPackage#getFinishedProduct_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link model.FinishedProduct#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.ModelPackage#getFinishedProduct_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.FinishedProduct#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fixtures</b></em>' containment reference list.
	 * The list contents are of type {@link model.FixtureWithNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixtures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixtures</em>' containment reference list.
	 * @see model.ModelPackage#getFinishedProduct_Fixtures()
	 * @model containment="true"
	 * @generated
	 */
	EList<FixtureWithNumber> getFixtures();

	/**
	 * Returns the value of the '<em><b>Complex Fixtures</b></em>' containment reference list.
	 * The list contents are of type {@link model.ComplexFixtureWithNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Fixtures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Fixtures</em>' containment reference list.
	 * @see model.ModelPackage#getFinishedProduct_ComplexFixtures()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplexFixtureWithNumber> getComplexFixtures();

	/**
	 * Returns the value of the '<em><b>Production Tree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production Tree</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Tree</em>' reference.
	 * @see #setProductionTree(ProductionTree)
	 * @see model.ModelPackage#getFinishedProduct_ProductionTree()
	 * @model
	 * @generated
	 */
	ProductionTree getProductionTree();

	/**
	 * Sets the value of the '{@link model.FinishedProduct#getProductionTree <em>Production Tree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Tree</em>' reference.
	 * @see #getProductionTree()
	 * @generated
	 */
	void setProductionTree(ProductionTree value);

	/**
	 * Returns the value of the '<em><b>Has Production Tree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Production Tree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Production Tree</em>' attribute.
	 * @see #setHasProductionTree(boolean)
	 * @see model.ModelPackage#getFinishedProduct_HasProductionTree()
	 * @model
	 * @generated
	 */
	boolean isHasProductionTree();

	/**
	 * Sets the value of the '{@link model.FinishedProduct#isHasProductionTree <em>Has Production Tree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Production Tree</em>' attribute.
	 * @see #isHasProductionTree()
	 * @generated
	 */
	void setHasProductionTree(boolean value);

} // FinishedProduct
