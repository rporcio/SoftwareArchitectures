/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.impl;

import model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://model/1.0"); 
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.FIXTURE: return (EObject)createFixture();
			case ModelPackage.COMPLEX_FIXTURE: return (EObject)createComplexFixture();
			case ModelPackage.FINISHED_PRODUCT: return (EObject)createFinishedProduct();
			case ModelPackage.PRODUCTION_TARGET: return (EObject)createProductionTarget();
			case ModelPackage.MATERIALS_MODEL: return (EObject)createMaterialsModel();
			case ModelPackage.FIXTURE_WITH_NUMBER: return (EObject)createFixtureWithNumber();
			case ModelPackage.COMPLEX_FIXTURE_WITH_NUMBER: return (EObject)createComplexFixtureWithNumber();
			case ModelPackage.FINISHED_PORDUCT_WITH_NUMBER: return (EObject)createFinishedPorductWIthNumber();
			case ModelPackage.PRODUCTION_TREE: return (EObject)createProductionTree();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fixture createFixture() {
		FixtureImpl fixture = new FixtureImpl();
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexFixture createComplexFixture() {
		ComplexFixtureImpl complexFixture = new ComplexFixtureImpl();
		return complexFixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinishedProduct createFinishedProduct() {
		FinishedProductImpl finishedProduct = new FinishedProductImpl();
		return finishedProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionTarget createProductionTarget() {
		ProductionTargetImpl productionTarget = new ProductionTargetImpl();
		return productionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialsModel createMaterialsModel() {
		MaterialsModelImpl materialsModel = new MaterialsModelImpl();
		return materialsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixtureWithNumber createFixtureWithNumber() {
		FixtureWithNumberImpl fixtureWithNumber = new FixtureWithNumberImpl();
		return fixtureWithNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexFixtureWithNumber createComplexFixtureWithNumber() {
		ComplexFixtureWithNumberImpl complexFixtureWithNumber = new ComplexFixtureWithNumberImpl();
		return complexFixtureWithNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinishedPorductWIthNumber createFinishedPorductWIthNumber() {
		FinishedPorductWIthNumberImpl finishedPorductWIthNumber = new FinishedPorductWIthNumberImpl();
		return finishedPorductWIthNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionTree createProductionTree() {
		ProductionTreeImpl productionTree = new ProductionTreeImpl();
		return productionTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
