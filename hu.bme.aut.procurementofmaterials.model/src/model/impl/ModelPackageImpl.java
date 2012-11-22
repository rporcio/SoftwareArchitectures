/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.impl;

import model.ComplexFixture;
import model.ComplexFixtureWithNumber;
import model.FinishedPorductWIthNumber;
import model.FinishedProduct;
import model.Fixture;
import model.FixtureWithNumber;
import model.MaterialsModel;
import model.ModelFactory;
import model.ModelPackage;
import model.ProductionTarget;
import model.ProductionTree;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixtureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexFixtureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finishedProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixtureWithNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexFixtureWithNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finishedPorductWIthNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionTreeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixture() {
		return fixtureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixture_ID() {
		return (EAttribute)fixtureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixture_Price() {
		return (EAttribute)fixtureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixture_Name() {
		return (EAttribute)fixtureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixture_AcquisitionTime() {
		return (EAttribute)fixtureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexFixture() {
		return complexFixtureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexFixture_ID() {
		return (EAttribute)complexFixtureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexFixture_Name() {
		return (EAttribute)complexFixtureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexFixture_Fixtures() {
		return (EReference)complexFixtureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinishedProduct() {
		return finishedProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinishedProduct_ID() {
		return (EAttribute)finishedProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinishedProduct_Name() {
		return (EAttribute)finishedProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinishedProduct_Fixtures() {
		return (EReference)finishedProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinishedProduct_ComplexFixtures() {
		return (EReference)finishedProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinishedProduct_ProductionTree() {
		return (EReference)finishedProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinishedProduct_HasProductionTree() {
		return (EAttribute)finishedProductEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductionTarget() {
		return productionTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductionTarget_ID() {
		return (EAttribute)productionTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductionTarget_Name() {
		return (EAttribute)productionTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductionTarget_Deadline() {
		return (EAttribute)productionTargetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionTarget_FinishedProducts() {
		return (EReference)productionTargetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialsModel() {
		return materialsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialsModel_Fixtures() {
		return (EReference)materialsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialsModel_ComplexFixtures() {
		return (EReference)materialsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialsModel_FinishedProducts() {
		return (EReference)materialsModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialsModel_ProductionTargets() {
		return (EReference)materialsModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixtureWithNumber() {
		return fixtureWithNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixtureWithNumber_Numbers() {
		return (EAttribute)fixtureWithNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixtureWithNumber_FixtureID() {
		return (EAttribute)fixtureWithNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexFixtureWithNumber() {
		return complexFixtureWithNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexFixtureWithNumber_Numbers() {
		return (EAttribute)complexFixtureWithNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexFixtureWithNumber_ComplexFixtureID() {
		return (EAttribute)complexFixtureWithNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinishedPorductWIthNumber() {
		return finishedPorductWIthNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinishedPorductWIthNumber_Number() {
		return (EAttribute)finishedPorductWIthNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinishedPorductWIthNumber_FinisshedProductID() {
		return (EAttribute)finishedPorductWIthNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductionTree() {
		return productionTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductionTree_ID() {
		return (EAttribute)productionTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductionTree_Name() {
		return (EAttribute)productionTreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fixtureEClass = createEClass(FIXTURE);
		createEAttribute(fixtureEClass, FIXTURE__ID);
		createEAttribute(fixtureEClass, FIXTURE__PRICE);
		createEAttribute(fixtureEClass, FIXTURE__NAME);
		createEAttribute(fixtureEClass, FIXTURE__ACQUISITION_TIME);

		complexFixtureEClass = createEClass(COMPLEX_FIXTURE);
		createEAttribute(complexFixtureEClass, COMPLEX_FIXTURE__ID);
		createEAttribute(complexFixtureEClass, COMPLEX_FIXTURE__NAME);
		createEReference(complexFixtureEClass, COMPLEX_FIXTURE__FIXTURES);

		finishedProductEClass = createEClass(FINISHED_PRODUCT);
		createEAttribute(finishedProductEClass, FINISHED_PRODUCT__ID);
		createEAttribute(finishedProductEClass, FINISHED_PRODUCT__NAME);
		createEReference(finishedProductEClass, FINISHED_PRODUCT__FIXTURES);
		createEReference(finishedProductEClass, FINISHED_PRODUCT__COMPLEX_FIXTURES);
		createEReference(finishedProductEClass, FINISHED_PRODUCT__PRODUCTION_TREE);
		createEAttribute(finishedProductEClass, FINISHED_PRODUCT__HAS_PRODUCTION_TREE);

		productionTargetEClass = createEClass(PRODUCTION_TARGET);
		createEAttribute(productionTargetEClass, PRODUCTION_TARGET__ID);
		createEAttribute(productionTargetEClass, PRODUCTION_TARGET__NAME);
		createEAttribute(productionTargetEClass, PRODUCTION_TARGET__DEADLINE);
		createEReference(productionTargetEClass, PRODUCTION_TARGET__FINISHED_PRODUCTS);

		materialsModelEClass = createEClass(MATERIALS_MODEL);
		createEReference(materialsModelEClass, MATERIALS_MODEL__FIXTURES);
		createEReference(materialsModelEClass, MATERIALS_MODEL__COMPLEX_FIXTURES);
		createEReference(materialsModelEClass, MATERIALS_MODEL__FINISHED_PRODUCTS);
		createEReference(materialsModelEClass, MATERIALS_MODEL__PRODUCTION_TARGETS);

		fixtureWithNumberEClass = createEClass(FIXTURE_WITH_NUMBER);
		createEAttribute(fixtureWithNumberEClass, FIXTURE_WITH_NUMBER__NUMBERS);
		createEAttribute(fixtureWithNumberEClass, FIXTURE_WITH_NUMBER__FIXTURE_ID);

		complexFixtureWithNumberEClass = createEClass(COMPLEX_FIXTURE_WITH_NUMBER);
		createEAttribute(complexFixtureWithNumberEClass, COMPLEX_FIXTURE_WITH_NUMBER__NUMBERS);
		createEAttribute(complexFixtureWithNumberEClass, COMPLEX_FIXTURE_WITH_NUMBER__COMPLEX_FIXTURE_ID);

		finishedPorductWIthNumberEClass = createEClass(FINISHED_PORDUCT_WITH_NUMBER);
		createEAttribute(finishedPorductWIthNumberEClass, FINISHED_PORDUCT_WITH_NUMBER__NUMBER);
		createEAttribute(finishedPorductWIthNumberEClass, FINISHED_PORDUCT_WITH_NUMBER__FINISSHED_PRODUCT_ID);

		productionTreeEClass = createEClass(PRODUCTION_TREE);
		createEAttribute(productionTreeEClass, PRODUCTION_TREE__ID);
		createEAttribute(productionTreeEClass, PRODUCTION_TREE__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(fixtureEClass, Fixture.class, "Fixture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixture_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Fixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixture_Price(), ecorePackage.getEInt(), "price", null, 0, 1, Fixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixture_Name(), ecorePackage.getEString(), "name", null, 0, 1, Fixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixture_AcquisitionTime(), ecorePackage.getEString(), "acquisitionTime", null, 0, 1, Fixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexFixtureEClass, ComplexFixture.class, "ComplexFixture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexFixture_ID(), ecorePackage.getEString(), "ID", null, 0, 1, ComplexFixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexFixture_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComplexFixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexFixture_Fixtures(), this.getFixtureWithNumber(), null, "fixtures", null, 0, -1, ComplexFixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finishedProductEClass, FinishedProduct.class, "FinishedProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinishedProduct_ID(), ecorePackage.getEString(), "ID", null, 0, 1, FinishedProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinishedProduct_Name(), ecorePackage.getEString(), "name", null, 0, 1, FinishedProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinishedProduct_Fixtures(), this.getFixtureWithNumber(), null, "fixtures", null, 0, -1, FinishedProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinishedProduct_ComplexFixtures(), this.getComplexFixtureWithNumber(), null, "complexFixtures", null, 0, -1, FinishedProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinishedProduct_ProductionTree(), this.getProductionTree(), null, "productionTree", null, 0, 1, FinishedProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinishedProduct_HasProductionTree(), ecorePackage.getEBoolean(), "hasProductionTree", null, 0, 1, FinishedProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productionTargetEClass, ProductionTarget.class, "ProductionTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductionTarget_ID(), ecorePackage.getEString(), "ID", null, 0, 1, ProductionTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductionTarget_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductionTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductionTarget_Deadline(), ecorePackage.getEString(), "deadline", null, 0, 1, ProductionTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductionTarget_FinishedProducts(), this.getFinishedPorductWIthNumber(), null, "finishedProducts", null, 0, -1, ProductionTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialsModelEClass, MaterialsModel.class, "MaterialsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaterialsModel_Fixtures(), this.getFixture(), null, "fixtures", null, 0, -1, MaterialsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaterialsModel_ComplexFixtures(), this.getComplexFixture(), null, "complexFixtures", null, 0, -1, MaterialsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaterialsModel_FinishedProducts(), this.getFinishedProduct(), null, "finishedProducts", null, 0, -1, MaterialsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaterialsModel_ProductionTargets(), this.getProductionTarget(), null, "productionTargets", null, 0, -1, MaterialsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixtureWithNumberEClass, FixtureWithNumber.class, "FixtureWithNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixtureWithNumber_Numbers(), ecorePackage.getEInt(), "numbers", null, 0, 1, FixtureWithNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixtureWithNumber_FixtureID(), ecorePackage.getEString(), "fixtureID", null, 0, 1, FixtureWithNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexFixtureWithNumberEClass, ComplexFixtureWithNumber.class, "ComplexFixtureWithNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexFixtureWithNumber_Numbers(), ecorePackage.getEInt(), "numbers", null, 0, 1, ComplexFixtureWithNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexFixtureWithNumber_ComplexFixtureID(), ecorePackage.getEString(), "complexFixtureID", null, 0, 1, ComplexFixtureWithNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finishedPorductWIthNumberEClass, FinishedPorductWIthNumber.class, "FinishedPorductWIthNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinishedPorductWIthNumber_Number(), ecorePackage.getEInt(), "number", null, 0, 1, FinishedPorductWIthNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinishedPorductWIthNumber_FinisshedProductID(), ecorePackage.getEString(), "finisshedProductID", null, 0, 1, FinishedPorductWIthNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productionTreeEClass, ProductionTree.class, "ProductionTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductionTree_ID(), ecorePackage.getEString(), "ID", null, 0, 1, ProductionTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductionTree_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductionTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
