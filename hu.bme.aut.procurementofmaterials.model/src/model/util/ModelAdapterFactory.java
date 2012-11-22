/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.util;

import model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseFixture(Fixture object) {
				return createFixtureAdapter();
			}
			@Override
			public Adapter caseComplexFixture(ComplexFixture object) {
				return createComplexFixtureAdapter();
			}
			@Override
			public Adapter caseFinishedProduct(FinishedProduct object) {
				return createFinishedProductAdapter();
			}
			@Override
			public Adapter caseProductionTarget(ProductionTarget object) {
				return createProductionTargetAdapter();
			}
			@Override
			public Adapter caseMaterialsModel(MaterialsModel object) {
				return createMaterialsModelAdapter();
			}
			@Override
			public Adapter caseFixtureWithNumber(FixtureWithNumber object) {
				return createFixtureWithNumberAdapter();
			}
			@Override
			public Adapter caseComplexFixtureWithNumber(ComplexFixtureWithNumber object) {
				return createComplexFixtureWithNumberAdapter();
			}
			@Override
			public Adapter caseFinishedPorductWIthNumber(FinishedPorductWIthNumber object) {
				return createFinishedPorductWIthNumberAdapter();
			}
			@Override
			public Adapter caseProductionTree(ProductionTree object) {
				return createProductionTreeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link model.Fixture <em>Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Fixture
	 * @generated
	 */
	public Adapter createFixtureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ComplexFixture <em>Complex Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ComplexFixture
	 * @generated
	 */
	public Adapter createComplexFixtureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.FinishedProduct <em>Finished Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.FinishedProduct
	 * @generated
	 */
	public Adapter createFinishedProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ProductionTarget <em>Production Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ProductionTarget
	 * @generated
	 */
	public Adapter createProductionTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.MaterialsModel <em>Materials Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.MaterialsModel
	 * @generated
	 */
	public Adapter createMaterialsModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.FixtureWithNumber <em>Fixture With Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.FixtureWithNumber
	 * @generated
	 */
	public Adapter createFixtureWithNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ComplexFixtureWithNumber <em>Complex Fixture With Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ComplexFixtureWithNumber
	 * @generated
	 */
	public Adapter createComplexFixtureWithNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.FinishedPorductWIthNumber <em>Finished Porduct WIth Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.FinishedPorductWIthNumber
	 * @generated
	 */
	public Adapter createFinishedPorductWIthNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ProductionTree <em>Production Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ProductionTree
	 * @generated
	 */
	public Adapter createProductionTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
