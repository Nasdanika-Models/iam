/**
 */
package org.nasdanika.models.iam.impl;

import java.time.Duration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.iam.Action;
import org.nasdanika.models.iam.Effect;
import org.nasdanika.models.iam.IamPackage;
import org.nasdanika.models.iam.Permission;

import org.nasdanika.models.nxcore.Evaluator;
import org.nasdanika.models.nxcore.NxcorePackage;
import org.nasdanika.models.nxcore.Period;
import org.nasdanika.models.nxcore.Temporal;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.impl.PermissionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.PermissionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.PermissionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.PermissionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.PermissionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.PermissionImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.PermissionImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.PermissionImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.PermissionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionImpl extends ModelElementImpl implements Permission {
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
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final Effect EFFECT_EDEFAULT = Effect.ALLOW;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IamPackage.Literals.PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(IamPackage.PERMISSION__DURATION, NxcorePackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(IamPackage.PERMISSION__DURATION, NxcorePackage.Literals.PERIOD__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(IamPackage.PERMISSION__START, NxcorePackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, IamPackage.PERMISSION__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(IamPackage.PERMISSION__START, NxcorePackage.Literals.PERIOD__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(IamPackage.PERMISSION__END, NxcorePackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, IamPackage.PERMISSION__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(IamPackage.PERMISSION__END, NxcorePackage.Literals.PERIOD__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Effect getEffect() {
		return (Effect)eDynamicGet(IamPackage.PERMISSION__EFFECT, IamPackage.Literals.PERMISSION__EFFECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(Effect newEffect) {
		eDynamicSet(IamPackage.PERMISSION__EFFECT, IamPackage.Literals.PERMISSION__EFFECT, newEffect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Action> getActions() {
		return (EList<Action>)eDynamicGet(IamPackage.PERMISSION__ACTIONS, IamPackage.Literals.PERMISSION__ACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evaluator getResources() {
		return (Evaluator)eDynamicGet(IamPackage.PERMISSION__RESOURCES, IamPackage.Literals.PERMISSION__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResources(Evaluator newResources, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResources, IamPackage.PERMISSION__RESOURCES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResources(Evaluator newResources) {
		eDynamicSet(IamPackage.PERMISSION__RESOURCES, IamPackage.Literals.PERMISSION__RESOURCES, newResources);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getFeatures() {
		return (EList<String>)eDynamicGet(IamPackage.PERMISSION__FEATURES, IamPackage.Literals.PERMISSION__FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getOperations() {
		return (EList<String>)eDynamicGet(IamPackage.PERMISSION__OPERATIONS, IamPackage.Literals.PERMISSION__OPERATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evaluator getCondition() {
		return (Evaluator)eDynamicGet(IamPackage.PERMISSION__CONDITION, IamPackage.Literals.PERMISSION__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Evaluator newCondition, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCondition, IamPackage.PERMISSION__CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Evaluator newCondition) {
		eDynamicSet(IamPackage.PERMISSION__CONDITION, IamPackage.Literals.PERMISSION__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IamPackage.PERMISSION__START:
				return basicSetStart(null, msgs);
			case IamPackage.PERMISSION__END:
				return basicSetEnd(null, msgs);
			case IamPackage.PERMISSION__RESOURCES:
				return basicSetResources(null, msgs);
			case IamPackage.PERMISSION__CONDITION:
				return basicSetCondition(null, msgs);
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
			case IamPackage.PERMISSION__DURATION:
				return getDuration();
			case IamPackage.PERMISSION__START:
				return getStart();
			case IamPackage.PERMISSION__END:
				return getEnd();
			case IamPackage.PERMISSION__EFFECT:
				return getEffect();
			case IamPackage.PERMISSION__ACTIONS:
				return getActions();
			case IamPackage.PERMISSION__RESOURCES:
				return getResources();
			case IamPackage.PERMISSION__FEATURES:
				return getFeatures();
			case IamPackage.PERMISSION__OPERATIONS:
				return getOperations();
			case IamPackage.PERMISSION__CONDITION:
				return getCondition();
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
			case IamPackage.PERMISSION__DURATION:
				setDuration((Duration)newValue);
				return;
			case IamPackage.PERMISSION__START:
				setStart((Temporal)newValue);
				return;
			case IamPackage.PERMISSION__END:
				setEnd((Temporal)newValue);
				return;
			case IamPackage.PERMISSION__EFFECT:
				setEffect((Effect)newValue);
				return;
			case IamPackage.PERMISSION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case IamPackage.PERMISSION__RESOURCES:
				setResources((Evaluator)newValue);
				return;
			case IamPackage.PERMISSION__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends String>)newValue);
				return;
			case IamPackage.PERMISSION__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends String>)newValue);
				return;
			case IamPackage.PERMISSION__CONDITION:
				setCondition((Evaluator)newValue);
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
			case IamPackage.PERMISSION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case IamPackage.PERMISSION__START:
				setStart((Temporal)null);
				return;
			case IamPackage.PERMISSION__END:
				setEnd((Temporal)null);
				return;
			case IamPackage.PERMISSION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case IamPackage.PERMISSION__ACTIONS:
				getActions().clear();
				return;
			case IamPackage.PERMISSION__RESOURCES:
				setResources((Evaluator)null);
				return;
			case IamPackage.PERMISSION__FEATURES:
				getFeatures().clear();
				return;
			case IamPackage.PERMISSION__OPERATIONS:
				getOperations().clear();
				return;
			case IamPackage.PERMISSION__CONDITION:
				setCondition((Evaluator)null);
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
			case IamPackage.PERMISSION__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case IamPackage.PERMISSION__START:
				return getStart() != null;
			case IamPackage.PERMISSION__END:
				return getEnd() != null;
			case IamPackage.PERMISSION__EFFECT:
				return getEffect() != EFFECT_EDEFAULT;
			case IamPackage.PERMISSION__ACTIONS:
				return !getActions().isEmpty();
			case IamPackage.PERMISSION__RESOURCES:
				return getResources() != null;
			case IamPackage.PERMISSION__FEATURES:
				return !getFeatures().isEmpty();
			case IamPackage.PERMISSION__OPERATIONS:
				return !getOperations().isEmpty();
			case IamPackage.PERMISSION__CONDITION:
				return getCondition() != null;
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
				case IamPackage.PERMISSION__DURATION: return NxcorePackage.PERIOD__DURATION;
				case IamPackage.PERMISSION__START: return NxcorePackage.PERIOD__START;
				case IamPackage.PERMISSION__END: return NxcorePackage.PERIOD__END;
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
				case NxcorePackage.PERIOD__DURATION: return IamPackage.PERMISSION__DURATION;
				case NxcorePackage.PERIOD__START: return IamPackage.PERMISSION__START;
				case NxcorePackage.PERIOD__END: return IamPackage.PERMISSION__END;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PermissionImpl
