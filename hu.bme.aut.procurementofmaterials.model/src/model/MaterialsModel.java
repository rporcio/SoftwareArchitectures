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
 * A representation of the model object '<em><b>Materials Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.MaterialsModel#getFixtures <em>Fixtures</em>}</li>
 *   <li>{@link model.MaterialsModel#getComplexFixtures <em>Complex Fixtures</em>}</li>
 *   <li>{@link model.MaterialsModel#getFinishedProducts <em>Finished Products</em>}</li>
 *   <li>{@link model.MaterialsModel#getProductionTargets <em>Production Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getMaterialsModel()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface MaterialsModel extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Fixtures</b></em>' containment reference list.
	 * The list contents are of type {@link model.Fixture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixtures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixtures</em>' containment reference list.
	 * @see model.ModelPackage#getMaterialsModel_Fixtures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fixture> getFixtures();

	/**
	 * Returns the value of the '<em><b>Complex Fixtures</b></em>' containment reference list.
	 * The list contents are of type {@link model.ComplexFixture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Fixtures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Fixtures</em>' containment reference list.
	 * @see model.ModelPackage#getMaterialsModel_ComplexFixtures()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplexFixture> getComplexFixtures();

	/**
	 * Returns the value of the '<em><b>Finished Products</b></em>' containment reference list.
	 * The list contents are of type {@link model.FinishedProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finished Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished Products</em>' containment reference list.
	 * @see model.ModelPackage#getMaterialsModel_FinishedProducts()
	 * @model containment="true"
	 * @generated
	 */
	EList<FinishedProduct> getFinishedProducts();

	/**
	 * Returns the value of the '<em><b>Production Targets</b></em>' containment reference list.
	 * The list contents are of type {@link model.ProductionTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Targets</em>' containment reference list.
	 * @see model.ModelPackage#getMaterialsModel_ProductionTargets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductionTarget> getProductionTargets();

} // MaterialsModel
