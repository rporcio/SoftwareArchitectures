/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.FixtureImpl <em>Fixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FixtureImpl
	 * @see model.impl.ModelPackageImpl#getFixture()
	 * @generated
	 */
	int FIXTURE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Acquisition Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE__ACQUISITION_TIME = 3;

	/**
	 * The number of structural features of the '<em>Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link model.impl.ComplexFixtureImpl <em>Complex Fixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ComplexFixtureImpl
	 * @see model.impl.ModelPackageImpl#getComplexFixture()
	 * @generated
	 */
	int COMPLEX_FIXTURE = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FIXTURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FIXTURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Fixtures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FIXTURE__FIXTURES = 2;

	/**
	 * The number of structural features of the '<em>Complex Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FIXTURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link model.impl.FinishedProductImpl <em>Finished Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FinishedProductImpl
	 * @see model.impl.ModelPackageImpl#getFinishedProduct()
	 * @generated
	 */
	int FINISHED_PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_PRODUCT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_PRODUCT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Fixtures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_PRODUCT__FIXTURES = 2;

	/**
	 * The feature id for the '<em><b>Complex Fixtures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_PRODUCT__COMPLEX_FIXTURES = 3;

	/**
	 * The feature id for the '<em><b>Production Tree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_PRODUCT__PRODUCTION_TREE = 4;

	/**
	 * The feature id for the '<em><b>Has Production Tree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_PRODUCT__HAS_PRODUCTION_TREE = 5;

	/**
	 * The number of structural features of the '<em>Finished Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_PRODUCT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link model.impl.ProductionTargetImpl <em>Production Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ProductionTargetImpl
	 * @see model.impl.ModelPackageImpl#getProductionTarget()
	 * @generated
	 */
	int PRODUCTION_TARGET = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_TARGET__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_TARGET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_TARGET__DEADLINE = 2;

	/**
	 * The feature id for the '<em><b>Finished Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_TARGET__FINISHED_PRODUCTS = 3;

	/**
	 * The number of structural features of the '<em>Production Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_TARGET_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link model.impl.MaterialsModelImpl <em>Materials Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MaterialsModelImpl
	 * @see model.impl.ModelPackageImpl#getMaterialsModel()
	 * @generated
	 */
	int MATERIALS_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Fixtures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIALS_MODEL__FIXTURES = 0;

	/**
	 * The feature id for the '<em><b>Complex Fixtures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIALS_MODEL__COMPLEX_FIXTURES = 1;

	/**
	 * The feature id for the '<em><b>Finished Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIALS_MODEL__FINISHED_PRODUCTS = 2;

	/**
	 * The feature id for the '<em><b>Production Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIALS_MODEL__PRODUCTION_TARGETS = 3;

	/**
	 * The number of structural features of the '<em>Materials Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIALS_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link model.impl.FixtureWithNumberImpl <em>Fixture With Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FixtureWithNumberImpl
	 * @see model.impl.ModelPackageImpl#getFixtureWithNumber()
	 * @generated
	 */
	int FIXTURE_WITH_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_WITH_NUMBER__NUMBERS = 0;

	/**
	 * The feature id for the '<em><b>Fixture ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_WITH_NUMBER__FIXTURE_ID = 1;

	/**
	 * The number of structural features of the '<em>Fixture With Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_WITH_NUMBER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.ComplexFixtureWithNumberImpl <em>Complex Fixture With Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ComplexFixtureWithNumberImpl
	 * @see model.impl.ModelPackageImpl#getComplexFixtureWithNumber()
	 * @generated
	 */
	int COMPLEX_FIXTURE_WITH_NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FIXTURE_WITH_NUMBER__NUMBERS = 0;

	/**
	 * The feature id for the '<em><b>Complex Fixture ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FIXTURE_WITH_NUMBER__COMPLEX_FIXTURE_ID = 1;

	/**
	 * The number of structural features of the '<em>Complex Fixture With Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FIXTURE_WITH_NUMBER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.FinishedPorductWIthNumberImpl <em>Finished Porduct WIth Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FinishedPorductWIthNumberImpl
	 * @see model.impl.ModelPackageImpl#getFinishedPorductWIthNumber()
	 * @generated
	 */
	int FINISHED_PORDUCT_WITH_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_PORDUCT_WITH_NUMBER__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Finisshed Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_PORDUCT_WITH_NUMBER__FINISSHED_PRODUCT_ID = 1;

	/**
	 * The number of structural features of the '<em>Finished Porduct WIth Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISHED_PORDUCT_WITH_NUMBER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.ProductionTreeImpl <em>Production Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ProductionTreeImpl
	 * @see model.impl.ModelPackageImpl#getProductionTree()
	 * @generated
	 */
	int PRODUCTION_TREE = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_TREE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_TREE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Production Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_TREE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link model.Fixture <em>Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixture</em>'.
	 * @see model.Fixture
	 * @generated
	 */
	EClass getFixture();

	/**
	 * Returns the meta object for the attribute '{@link model.Fixture#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see model.Fixture#getID()
	 * @see #getFixture()
	 * @generated
	 */
	EAttribute getFixture_ID();

	/**
	 * Returns the meta object for the attribute '{@link model.Fixture#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see model.Fixture#getPrice()
	 * @see #getFixture()
	 * @generated
	 */
	EAttribute getFixture_Price();

	/**
	 * Returns the meta object for the attribute '{@link model.Fixture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Fixture#getName()
	 * @see #getFixture()
	 * @generated
	 */
	EAttribute getFixture_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.Fixture#getAcquisitionTime <em>Acquisition Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acquisition Time</em>'.
	 * @see model.Fixture#getAcquisitionTime()
	 * @see #getFixture()
	 * @generated
	 */
	EAttribute getFixture_AcquisitionTime();

	/**
	 * Returns the meta object for class '{@link model.ComplexFixture <em>Complex Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Fixture</em>'.
	 * @see model.ComplexFixture
	 * @generated
	 */
	EClass getComplexFixture();

	/**
	 * Returns the meta object for the attribute '{@link model.ComplexFixture#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see model.ComplexFixture#getID()
	 * @see #getComplexFixture()
	 * @generated
	 */
	EAttribute getComplexFixture_ID();

	/**
	 * Returns the meta object for the attribute '{@link model.ComplexFixture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.ComplexFixture#getName()
	 * @see #getComplexFixture()
	 * @generated
	 */
	EAttribute getComplexFixture_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link model.ComplexFixture#getFixtures <em>Fixtures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixtures</em>'.
	 * @see model.ComplexFixture#getFixtures()
	 * @see #getComplexFixture()
	 * @generated
	 */
	EReference getComplexFixture_Fixtures();

	/**
	 * Returns the meta object for class '{@link model.FinishedProduct <em>Finished Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finished Product</em>'.
	 * @see model.FinishedProduct
	 * @generated
	 */
	EClass getFinishedProduct();

	/**
	 * Returns the meta object for the attribute '{@link model.FinishedProduct#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see model.FinishedProduct#getID()
	 * @see #getFinishedProduct()
	 * @generated
	 */
	EAttribute getFinishedProduct_ID();

	/**
	 * Returns the meta object for the attribute '{@link model.FinishedProduct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.FinishedProduct#getName()
	 * @see #getFinishedProduct()
	 * @generated
	 */
	EAttribute getFinishedProduct_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link model.FinishedProduct#getFixtures <em>Fixtures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixtures</em>'.
	 * @see model.FinishedProduct#getFixtures()
	 * @see #getFinishedProduct()
	 * @generated
	 */
	EReference getFinishedProduct_Fixtures();

	/**
	 * Returns the meta object for the containment reference list '{@link model.FinishedProduct#getComplexFixtures <em>Complex Fixtures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Fixtures</em>'.
	 * @see model.FinishedProduct#getComplexFixtures()
	 * @see #getFinishedProduct()
	 * @generated
	 */
	EReference getFinishedProduct_ComplexFixtures();

	/**
	 * Returns the meta object for the reference '{@link model.FinishedProduct#getProductionTree <em>Production Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Production Tree</em>'.
	 * @see model.FinishedProduct#getProductionTree()
	 * @see #getFinishedProduct()
	 * @generated
	 */
	EReference getFinishedProduct_ProductionTree();

	/**
	 * Returns the meta object for the attribute '{@link model.FinishedProduct#isHasProductionTree <em>Has Production Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Production Tree</em>'.
	 * @see model.FinishedProduct#isHasProductionTree()
	 * @see #getFinishedProduct()
	 * @generated
	 */
	EAttribute getFinishedProduct_HasProductionTree();

	/**
	 * Returns the meta object for class '{@link model.ProductionTarget <em>Production Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Target</em>'.
	 * @see model.ProductionTarget
	 * @generated
	 */
	EClass getProductionTarget();

	/**
	 * Returns the meta object for the attribute '{@link model.ProductionTarget#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see model.ProductionTarget#getID()
	 * @see #getProductionTarget()
	 * @generated
	 */
	EAttribute getProductionTarget_ID();

	/**
	 * Returns the meta object for the attribute '{@link model.ProductionTarget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.ProductionTarget#getName()
	 * @see #getProductionTarget()
	 * @generated
	 */
	EAttribute getProductionTarget_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.ProductionTarget#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see model.ProductionTarget#getDeadline()
	 * @see #getProductionTarget()
	 * @generated
	 */
	EAttribute getProductionTarget_Deadline();

	/**
	 * Returns the meta object for the containment reference list '{@link model.ProductionTarget#getFinishedProducts <em>Finished Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Finished Products</em>'.
	 * @see model.ProductionTarget#getFinishedProducts()
	 * @see #getProductionTarget()
	 * @generated
	 */
	EReference getProductionTarget_FinishedProducts();

	/**
	 * Returns the meta object for class '{@link model.MaterialsModel <em>Materials Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Materials Model</em>'.
	 * @see model.MaterialsModel
	 * @generated
	 */
	EClass getMaterialsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link model.MaterialsModel#getFixtures <em>Fixtures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixtures</em>'.
	 * @see model.MaterialsModel#getFixtures()
	 * @see #getMaterialsModel()
	 * @generated
	 */
	EReference getMaterialsModel_Fixtures();

	/**
	 * Returns the meta object for the containment reference list '{@link model.MaterialsModel#getComplexFixtures <em>Complex Fixtures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Fixtures</em>'.
	 * @see model.MaterialsModel#getComplexFixtures()
	 * @see #getMaterialsModel()
	 * @generated
	 */
	EReference getMaterialsModel_ComplexFixtures();

	/**
	 * Returns the meta object for the containment reference list '{@link model.MaterialsModel#getFinishedProducts <em>Finished Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Finished Products</em>'.
	 * @see model.MaterialsModel#getFinishedProducts()
	 * @see #getMaterialsModel()
	 * @generated
	 */
	EReference getMaterialsModel_FinishedProducts();

	/**
	 * Returns the meta object for the containment reference list '{@link model.MaterialsModel#getProductionTargets <em>Production Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Production Targets</em>'.
	 * @see model.MaterialsModel#getProductionTargets()
	 * @see #getMaterialsModel()
	 * @generated
	 */
	EReference getMaterialsModel_ProductionTargets();

	/**
	 * Returns the meta object for class '{@link model.FixtureWithNumber <em>Fixture With Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixture With Number</em>'.
	 * @see model.FixtureWithNumber
	 * @generated
	 */
	EClass getFixtureWithNumber();

	/**
	 * Returns the meta object for the attribute '{@link model.FixtureWithNumber#getNumbers <em>Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbers</em>'.
	 * @see model.FixtureWithNumber#getNumbers()
	 * @see #getFixtureWithNumber()
	 * @generated
	 */
	EAttribute getFixtureWithNumber_Numbers();

	/**
	 * Returns the meta object for the attribute '{@link model.FixtureWithNumber#getFixtureID <em>Fixture ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixture ID</em>'.
	 * @see model.FixtureWithNumber#getFixtureID()
	 * @see #getFixtureWithNumber()
	 * @generated
	 */
	EAttribute getFixtureWithNumber_FixtureID();

	/**
	 * Returns the meta object for class '{@link model.ComplexFixtureWithNumber <em>Complex Fixture With Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Fixture With Number</em>'.
	 * @see model.ComplexFixtureWithNumber
	 * @generated
	 */
	EClass getComplexFixtureWithNumber();

	/**
	 * Returns the meta object for the attribute '{@link model.ComplexFixtureWithNumber#getNumbers <em>Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbers</em>'.
	 * @see model.ComplexFixtureWithNumber#getNumbers()
	 * @see #getComplexFixtureWithNumber()
	 * @generated
	 */
	EAttribute getComplexFixtureWithNumber_Numbers();

	/**
	 * Returns the meta object for the attribute '{@link model.ComplexFixtureWithNumber#getComplexFixtureID <em>Complex Fixture ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complex Fixture ID</em>'.
	 * @see model.ComplexFixtureWithNumber#getComplexFixtureID()
	 * @see #getComplexFixtureWithNumber()
	 * @generated
	 */
	EAttribute getComplexFixtureWithNumber_ComplexFixtureID();

	/**
	 * Returns the meta object for class '{@link model.FinishedPorductWIthNumber <em>Finished Porduct WIth Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finished Porduct WIth Number</em>'.
	 * @see model.FinishedPorductWIthNumber
	 * @generated
	 */
	EClass getFinishedPorductWIthNumber();

	/**
	 * Returns the meta object for the attribute '{@link model.FinishedPorductWIthNumber#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see model.FinishedPorductWIthNumber#getNumber()
	 * @see #getFinishedPorductWIthNumber()
	 * @generated
	 */
	EAttribute getFinishedPorductWIthNumber_Number();

	/**
	 * Returns the meta object for the attribute '{@link model.FinishedPorductWIthNumber#getFinisshedProductID <em>Finisshed Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finisshed Product ID</em>'.
	 * @see model.FinishedPorductWIthNumber#getFinisshedProductID()
	 * @see #getFinishedPorductWIthNumber()
	 * @generated
	 */
	EAttribute getFinishedPorductWIthNumber_FinisshedProductID();

	/**
	 * Returns the meta object for class '{@link model.ProductionTree <em>Production Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Tree</em>'.
	 * @see model.ProductionTree
	 * @generated
	 */
	EClass getProductionTree();

	/**
	 * Returns the meta object for the attribute '{@link model.ProductionTree#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see model.ProductionTree#getID()
	 * @see #getProductionTree()
	 * @generated
	 */
	EAttribute getProductionTree_ID();

	/**
	 * Returns the meta object for the attribute '{@link model.ProductionTree#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.ProductionTree#getName()
	 * @see #getProductionTree()
	 * @generated
	 */
	EAttribute getProductionTree_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.FixtureImpl <em>Fixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FixtureImpl
		 * @see model.impl.ModelPackageImpl#getFixture()
		 * @generated
		 */
		EClass FIXTURE = eINSTANCE.getFixture();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXTURE__ID = eINSTANCE.getFixture_ID();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXTURE__PRICE = eINSTANCE.getFixture_Price();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXTURE__NAME = eINSTANCE.getFixture_Name();

		/**
		 * The meta object literal for the '<em><b>Acquisition Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXTURE__ACQUISITION_TIME = eINSTANCE.getFixture_AcquisitionTime();

		/**
		 * The meta object literal for the '{@link model.impl.ComplexFixtureImpl <em>Complex Fixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ComplexFixtureImpl
		 * @see model.impl.ModelPackageImpl#getComplexFixture()
		 * @generated
		 */
		EClass COMPLEX_FIXTURE = eINSTANCE.getComplexFixture();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_FIXTURE__ID = eINSTANCE.getComplexFixture_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_FIXTURE__NAME = eINSTANCE.getComplexFixture_Name();

		/**
		 * The meta object literal for the '<em><b>Fixtures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_FIXTURE__FIXTURES = eINSTANCE.getComplexFixture_Fixtures();

		/**
		 * The meta object literal for the '{@link model.impl.FinishedProductImpl <em>Finished Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FinishedProductImpl
		 * @see model.impl.ModelPackageImpl#getFinishedProduct()
		 * @generated
		 */
		EClass FINISHED_PRODUCT = eINSTANCE.getFinishedProduct();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINISHED_PRODUCT__ID = eINSTANCE.getFinishedProduct_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINISHED_PRODUCT__NAME = eINSTANCE.getFinishedProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Fixtures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINISHED_PRODUCT__FIXTURES = eINSTANCE.getFinishedProduct_Fixtures();

		/**
		 * The meta object literal for the '<em><b>Complex Fixtures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINISHED_PRODUCT__COMPLEX_FIXTURES = eINSTANCE.getFinishedProduct_ComplexFixtures();

		/**
		 * The meta object literal for the '<em><b>Production Tree</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINISHED_PRODUCT__PRODUCTION_TREE = eINSTANCE.getFinishedProduct_ProductionTree();

		/**
		 * The meta object literal for the '<em><b>Has Production Tree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINISHED_PRODUCT__HAS_PRODUCTION_TREE = eINSTANCE.getFinishedProduct_HasProductionTree();

		/**
		 * The meta object literal for the '{@link model.impl.ProductionTargetImpl <em>Production Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ProductionTargetImpl
		 * @see model.impl.ModelPackageImpl#getProductionTarget()
		 * @generated
		 */
		EClass PRODUCTION_TARGET = eINSTANCE.getProductionTarget();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION_TARGET__ID = eINSTANCE.getProductionTarget_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION_TARGET__NAME = eINSTANCE.getProductionTarget_Name();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION_TARGET__DEADLINE = eINSTANCE.getProductionTarget_Deadline();

		/**
		 * The meta object literal for the '<em><b>Finished Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_TARGET__FINISHED_PRODUCTS = eINSTANCE.getProductionTarget_FinishedProducts();

		/**
		 * The meta object literal for the '{@link model.impl.MaterialsModelImpl <em>Materials Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.MaterialsModelImpl
		 * @see model.impl.ModelPackageImpl#getMaterialsModel()
		 * @generated
		 */
		EClass MATERIALS_MODEL = eINSTANCE.getMaterialsModel();

		/**
		 * The meta object literal for the '<em><b>Fixtures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIALS_MODEL__FIXTURES = eINSTANCE.getMaterialsModel_Fixtures();

		/**
		 * The meta object literal for the '<em><b>Complex Fixtures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIALS_MODEL__COMPLEX_FIXTURES = eINSTANCE.getMaterialsModel_ComplexFixtures();

		/**
		 * The meta object literal for the '<em><b>Finished Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIALS_MODEL__FINISHED_PRODUCTS = eINSTANCE.getMaterialsModel_FinishedProducts();

		/**
		 * The meta object literal for the '<em><b>Production Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIALS_MODEL__PRODUCTION_TARGETS = eINSTANCE.getMaterialsModel_ProductionTargets();

		/**
		 * The meta object literal for the '{@link model.impl.FixtureWithNumberImpl <em>Fixture With Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FixtureWithNumberImpl
		 * @see model.impl.ModelPackageImpl#getFixtureWithNumber()
		 * @generated
		 */
		EClass FIXTURE_WITH_NUMBER = eINSTANCE.getFixtureWithNumber();

		/**
		 * The meta object literal for the '<em><b>Numbers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXTURE_WITH_NUMBER__NUMBERS = eINSTANCE.getFixtureWithNumber_Numbers();

		/**
		 * The meta object literal for the '<em><b>Fixture ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXTURE_WITH_NUMBER__FIXTURE_ID = eINSTANCE.getFixtureWithNumber_FixtureID();

		/**
		 * The meta object literal for the '{@link model.impl.ComplexFixtureWithNumberImpl <em>Complex Fixture With Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ComplexFixtureWithNumberImpl
		 * @see model.impl.ModelPackageImpl#getComplexFixtureWithNumber()
		 * @generated
		 */
		EClass COMPLEX_FIXTURE_WITH_NUMBER = eINSTANCE.getComplexFixtureWithNumber();

		/**
		 * The meta object literal for the '<em><b>Numbers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_FIXTURE_WITH_NUMBER__NUMBERS = eINSTANCE.getComplexFixtureWithNumber_Numbers();

		/**
		 * The meta object literal for the '<em><b>Complex Fixture ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_FIXTURE_WITH_NUMBER__COMPLEX_FIXTURE_ID = eINSTANCE.getComplexFixtureWithNumber_ComplexFixtureID();

		/**
		 * The meta object literal for the '{@link model.impl.FinishedPorductWIthNumberImpl <em>Finished Porduct WIth Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FinishedPorductWIthNumberImpl
		 * @see model.impl.ModelPackageImpl#getFinishedPorductWIthNumber()
		 * @generated
		 */
		EClass FINISHED_PORDUCT_WITH_NUMBER = eINSTANCE.getFinishedPorductWIthNumber();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINISHED_PORDUCT_WITH_NUMBER__NUMBER = eINSTANCE.getFinishedPorductWIthNumber_Number();

		/**
		 * The meta object literal for the '<em><b>Finisshed Product ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINISHED_PORDUCT_WITH_NUMBER__FINISSHED_PRODUCT_ID = eINSTANCE.getFinishedPorductWIthNumber_FinisshedProductID();

		/**
		 * The meta object literal for the '{@link model.impl.ProductionTreeImpl <em>Production Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ProductionTreeImpl
		 * @see model.impl.ModelPackageImpl#getProductionTree()
		 * @generated
		 */
		EClass PRODUCTION_TREE = eINSTANCE.getProductionTree();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION_TREE__ID = eINSTANCE.getProductionTree_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION_TREE__NAME = eINSTANCE.getProductionTree_Name();

	}

} //ModelPackage
