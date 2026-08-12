/**
 */
package org.nasdanika.models.iam.impl;

import java.time.Duration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.iam.IamPackage;
import org.nasdanika.models.iam.Permission;
import org.nasdanika.models.iam.Role;
import org.nasdanika.models.iam.Subject;

import org.nasdanika.models.nxcore.NxcorePackage;
import org.nasdanika.models.nxcore.Period;
import org.nasdanika.models.nxcore.Temporal;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.impl.SubjectImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.SubjectImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.SubjectImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.SubjectImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.SubjectImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubjectImpl extends ModelElementImpl implements Subject {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IamPackage.Literals.SUBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(IamPackage.SUBJECT__DURATION, NxcorePackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(IamPackage.SUBJECT__DURATION, NxcorePackage.Literals.PERIOD__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(IamPackage.SUBJECT__START, NxcorePackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, IamPackage.SUBJECT__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(IamPackage.SUBJECT__START, NxcorePackage.Literals.PERIOD__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(IamPackage.SUBJECT__END, NxcorePackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, IamPackage.SUBJECT__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(IamPackage.SUBJECT__END, NxcorePackage.Literals.PERIOD__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(IamPackage.SUBJECT__ROLES, IamPackage.Literals.SUBJECT__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Permission> getPermissions() {
		return (EList<Permission>)eDynamicGet(IamPackage.SUBJECT__PERMISSIONS, IamPackage.Literals.SUBJECT__PERMISSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IamPackage.SUBJECT__START:
				return basicSetStart(null, msgs);
			case IamPackage.SUBJECT__END:
				return basicSetEnd(null, msgs);
			case IamPackage.SUBJECT__PERMISSIONS:
				return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
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
			case IamPackage.SUBJECT__DURATION:
				return getDuration();
			case IamPackage.SUBJECT__START:
				return getStart();
			case IamPackage.SUBJECT__END:
				return getEnd();
			case IamPackage.SUBJECT__ROLES:
				return getRoles();
			case IamPackage.SUBJECT__PERMISSIONS:
				return getPermissions();
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
			case IamPackage.SUBJECT__DURATION:
				setDuration((Duration)newValue);
				return;
			case IamPackage.SUBJECT__START:
				setStart((Temporal)newValue);
				return;
			case IamPackage.SUBJECT__END:
				setEnd((Temporal)newValue);
				return;
			case IamPackage.SUBJECT__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case IamPackage.SUBJECT__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends Permission>)newValue);
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
			case IamPackage.SUBJECT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case IamPackage.SUBJECT__START:
				setStart((Temporal)null);
				return;
			case IamPackage.SUBJECT__END:
				setEnd((Temporal)null);
				return;
			case IamPackage.SUBJECT__ROLES:
				getRoles().clear();
				return;
			case IamPackage.SUBJECT__PERMISSIONS:
				getPermissions().clear();
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
			case IamPackage.SUBJECT__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case IamPackage.SUBJECT__START:
				return getStart() != null;
			case IamPackage.SUBJECT__END:
				return getEnd() != null;
			case IamPackage.SUBJECT__ROLES:
				return !getRoles().isEmpty();
			case IamPackage.SUBJECT__PERMISSIONS:
				return !getPermissions().isEmpty();
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
		if (baseClass == Period.class) {
			switch (derivedFeatureID) {
				case IamPackage.SUBJECT__DURATION: return NxcorePackage.PERIOD__DURATION;
				case IamPackage.SUBJECT__START: return NxcorePackage.PERIOD__START;
				case IamPackage.SUBJECT__END: return NxcorePackage.PERIOD__END;
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
		if (baseClass == Period.class) {
			switch (baseFeatureID) {
				case NxcorePackage.PERIOD__DURATION: return IamPackage.SUBJECT__DURATION;
				case NxcorePackage.PERIOD__START: return IamPackage.SUBJECT__START;
				case NxcorePackage.PERIOD__END: return IamPackage.SUBJECT__END;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SubjectImpl
