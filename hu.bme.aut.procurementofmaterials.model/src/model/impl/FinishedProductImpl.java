/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.impl;

import model.ComplexFixtureWithNumber;
import model.FinishedProduct;
import model.FixtureWithNumber;
import model.ModelPackage;
import model.ProductionTree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finished Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.FinishedProductImpl#getID <em>ID</em>}</li>
 *   <li>{@link model.impl.FinishedProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.FinishedProductImpl#getFixtures <em>Fixtures</em>}</li>
 *   <li>{@link model.impl.FinishedProductImpl#getComplexFixtures <em>Complex Fixtures</em>}</li>
 *   <li>{@link model.impl.FinishedProductImpl#getProductionTree <em>Production Tree</em>}</li>
 *   <li>{@link model.impl.FinishedProductImpl#isHasProductionTree <em>Has Production Tree</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FinishedProductImpl extends CDOObjectImpl implements FinishedProduct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinishedProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FINISHED_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return (String)eGet(ModelPackage.Literals.FINISHED_PRODUCT__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(ModelPackage.Literals.FINISHED_PRODUCT__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ModelPackage.Literals.FINISHED_PRODUCT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ModelPackage.Literals.FINISHED_PRODUCT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FixtureWithNumber> getFixtures() {
		return (EList<FixtureWithNumber>)eGet(ModelPackage.Literals.FINISHED_PRODUCT__FIXTURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ComplexFixtureWithNumber> getComplexFixtures() {
		return (EList<ComplexFixtureWithNumber>)eGet(ModelPackage.Literals.FINISHED_PRODUCT__COMPLEX_FIXTURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionTree getProductionTree() {
		return (ProductionTree)eGet(ModelPackage.Literals.FINISHED_PRODUCT__PRODUCTION_TREE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductionTree(ProductionTree newProductionTree) {
		eSet(ModelPackage.Literals.FINISHED_PRODUCT__PRODUCTION_TREE, newProductionTree);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasProductionTree() {
		return (Boolean)eGet(ModelPackage.Literals.FINISHED_PRODUCT__HAS_PRODUCTION_TREE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasProductionTree(boolean newHasProductionTree) {
		eSet(ModelPackage.Literals.FINISHED_PRODUCT__HAS_PRODUCTION_TREE, newHasProductionTree);
	}

} //FinishedProductImpl
