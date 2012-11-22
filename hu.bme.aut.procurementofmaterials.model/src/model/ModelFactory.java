/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixture</em>'.
	 * @generated
	 */
	Fixture createFixture();

	/**
	 * Returns a new object of class '<em>Complex Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Fixture</em>'.
	 * @generated
	 */
	ComplexFixture createComplexFixture();

	/**
	 * Returns a new object of class '<em>Finished Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finished Product</em>'.
	 * @generated
	 */
	FinishedProduct createFinishedProduct();

	/**
	 * Returns a new object of class '<em>Production Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Production Target</em>'.
	 * @generated
	 */
	ProductionTarget createProductionTarget();

	/**
	 * Returns a new object of class '<em>Materials Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Materials Model</em>'.
	 * @generated
	 */
	MaterialsModel createMaterialsModel();

	/**
	 * Returns a new object of class '<em>Fixture With Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixture With Number</em>'.
	 * @generated
	 */
	FixtureWithNumber createFixtureWithNumber();

	/**
	 * Returns a new object of class '<em>Complex Fixture With Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Fixture With Number</em>'.
	 * @generated
	 */
	ComplexFixtureWithNumber createComplexFixtureWithNumber();

	/**
	 * Returns a new object of class '<em>Finished Porduct WIth Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finished Porduct WIth Number</em>'.
	 * @generated
	 */
	FinishedPorductWIthNumber createFinishedPorductWIthNumber();

	/**
	 * Returns a new object of class '<em>Production Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Production Tree</em>'.
	 * @generated
	 */
	ProductionTree createProductionTree();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
