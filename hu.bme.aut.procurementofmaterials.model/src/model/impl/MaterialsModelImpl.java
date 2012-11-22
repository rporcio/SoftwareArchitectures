/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package model.impl;

import model.ComplexFixture;
import model.FinishedProduct;
import model.Fixture;
import model.MaterialsModel;
import model.ModelPackage;
import model.ProductionTarget;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Materials Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.MaterialsModelImpl#getFixtures <em>Fixtures</em>}</li>
 *   <li>{@link model.impl.MaterialsModelImpl#getComplexFixtures <em>Complex Fixtures</em>}</li>
 *   <li>{@link model.impl.MaterialsModelImpl#getFinishedProducts <em>Finished Products</em>}</li>
 *   <li>{@link model.impl.MaterialsModelImpl#getProductionTargets <em>Production Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaterialsModelImpl extends CDOObjectImpl implements MaterialsModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialsModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MATERIALS_MODEL;
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
	@SuppressWarnings("unchecked")
	public EList<Fixture> getFixtures() {
		return (EList<Fixture>)eGet(ModelPackage.Literals.MATERIALS_MODEL__FIXTURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ComplexFixture> getComplexFixtures() {
		return (EList<ComplexFixture>)eGet(ModelPackage.Literals.MATERIALS_MODEL__COMPLEX_FIXTURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FinishedProduct> getFinishedProducts() {
		return (EList<FinishedProduct>)eGet(ModelPackage.Literals.MATERIALS_MODEL__FINISHED_PRODUCTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProductionTarget> getProductionTargets() {
		return (EList<ProductionTarget>)eGet(ModelPackage.Literals.MATERIALS_MODEL__PRODUCTION_TARGETS, true);
	}

} //MaterialsModelImpl
