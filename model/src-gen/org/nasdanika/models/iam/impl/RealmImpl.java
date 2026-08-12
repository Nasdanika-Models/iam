/**
 */
package org.nasdanika.models.iam.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.iam.AccessControlEntry;
import org.nasdanika.models.iam.AccessControlled;
import org.nasdanika.models.iam.Action;
import org.nasdanika.models.iam.IamPackage;
import org.nasdanika.models.iam.Realm;
import org.nasdanika.models.iam.Subject;

import org.nasdanika.models.nxcore.impl.NamedPeriodImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.impl.RealmImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.RealmImpl#getRealms <em>Realms</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.RealmImpl#getSubjects <em>Subjects</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.RealmImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealmImpl extends NamedPeriodImpl implements Realm {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IamPackage.Literals.REALM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AccessControlEntry> getAccessControl() {
		return (EList<AccessControlEntry>)eDynamicGet(IamPackage.REALM__ACCESS_CONTROL, IamPackage.Literals.ACCESS_CONTROLLED__ACCESS_CONTROL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Realm> getRealms() {
		return (EList<Realm>)eDynamicGet(IamPackage.REALM__REALMS, IamPackage.Literals.REALM__REALMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Subject> getSubjects() {
		return (EList<Subject>)eDynamicGet(IamPackage.REALM__SUBJECTS, IamPackage.Literals.REALM__SUBJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Action> getActions() {
		return (EList<Action>)eDynamicGet(IamPackage.REALM__ACTIONS, IamPackage.Literals.REALM__ACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IamPackage.REALM__ACCESS_CONTROL:
				return ((InternalEList<?>)getAccessControl()).basicRemove(otherEnd, msgs);
			case IamPackage.REALM__REALMS:
				return ((InternalEList<?>)getRealms()).basicRemove(otherEnd, msgs);
			case IamPackage.REALM__SUBJECTS:
				return ((InternalEList<?>)getSubjects()).basicRemove(otherEnd, msgs);
			case IamPackage.REALM__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IamPackage.REALM__ACCESS_CONTROL:
				return getAccessControl();
			case IamPackage.REALM__REALMS:
				return getRealms();
			case IamPackage.REALM__SUBJECTS:
				return getSubjects();
			case IamPackage.REALM__ACTIONS:
				return getActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IamPackage.REALM__ACCESS_CONTROL:
				getAccessControl().clear();
				getAccessControl().addAll((Collection<? extends AccessControlEntry>)newValue);
				return;
			case IamPackage.REALM__REALMS:
				getRealms().clear();
				getRealms().addAll((Collection<? extends Realm>)newValue);
				return;
			case IamPackage.REALM__SUBJECTS:
				getSubjects().clear();
				getSubjects().addAll((Collection<? extends Subject>)newValue);
				return;
			case IamPackage.REALM__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IamPackage.REALM__ACCESS_CONTROL:
				getAccessControl().clear();
				return;
			case IamPackage.REALM__REALMS:
				getRealms().clear();
				return;
			case IamPackage.REALM__SUBJECTS:
				getSubjects().clear();
				return;
			case IamPackage.REALM__ACTIONS:
				getActions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IamPackage.REALM__ACCESS_CONTROL:
				return !getAccessControl().isEmpty();
			case IamPackage.REALM__REALMS:
				return !getRealms().isEmpty();
			case IamPackage.REALM__SUBJECTS:
				return !getSubjects().isEmpty();
			case IamPackage.REALM__ACTIONS:
				return !getActions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AccessControlled.class) {
			switch (derivedFeatureID) {
				case IamPackage.REALM__ACCESS_CONTROL: return IamPackage.ACCESS_CONTROLLED__ACCESS_CONTROL;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AccessControlled.class) {
			switch (baseFeatureID) {
				case IamPackage.ACCESS_CONTROLLED__ACCESS_CONTROL: return IamPackage.REALM__ACCESS_CONTROL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RealmImpl
