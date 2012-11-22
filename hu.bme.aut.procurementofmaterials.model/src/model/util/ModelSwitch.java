/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.util;

import model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.FIXTURE: {
				Fixture fixture = (Fixture)theEObject;
				T result = caseFixture(fixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPLEX_FIXTURE: {
				ComplexFixture complexFixture = (ComplexFixture)theEObject;
				T result = caseComplexFixture(complexFixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FINISHED_PRODUCT: {
				FinishedProduct finishedProduct = (FinishedProduct)theEObject;
				T result = caseFinishedProduct(finishedProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRODUCTION_TARGET: {
				ProductionTarget productionTarget = (ProductionTarget)theEObject;
				T result = caseProductionTarget(productionTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MATERIALS_MODEL: {
				MaterialsModel materialsModel = (MaterialsModel)theEObject;
				T result = caseMaterialsModel(materialsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FIXTURE_WITH_NUMBER: {
				FixtureWithNumber fixtureWithNumber = (FixtureWithNumber)theEObject;
				T result = caseFixtureWithNumber(fixtureWithNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPLEX_FIXTURE_WITH_NUMBER: {
				ComplexFixtureWithNumber complexFixtureWithNumber = (ComplexFixtureWithNumber)theEObject;
				T result = caseComplexFixtureWithNumber(complexFixtureWithNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FINISHED_PORDUCT_WITH_NUMBER: {
				FinishedPorductWIthNumber finishedPorductWIthNumber = (FinishedPorductWIthNumber)theEObject;
				T result = caseFinishedPorductWIthNumber(finishedPorductWIthNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRODUCTION_TREE: {
				ProductionTree productionTree = (ProductionTree)theEObject;
				T result = caseProductionTree(productionTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixture(Fixture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Fixture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexFixture(ComplexFixture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finished Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finished Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinishedProduct(FinishedProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Production Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Production Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductionTarget(ProductionTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Materials Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Materials Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialsModel(MaterialsModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixture With Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixture With Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixtureWithNumber(FixtureWithNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Fixture With Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Fixture With Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexFixtureWithNumber(ComplexFixtureWithNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finished Porduct WIth Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finished Porduct WIth Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinishedPorductWIthNumber(FinishedPorductWIthNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Production Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Production Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductionTree(ProductionTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
