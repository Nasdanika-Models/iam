/**
 */
package org.nasdanika.models.iam.impl;

import java.time.Duration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.iam.AccessControlEntry;
import org.nasdanika.models.iam.Action;
import org.nasdanika.models.iam.Effect;
import org.nasdanika.models.iam.IamPackage;
import org.nasdanika.models.iam.Subject;

import org.nasdanika.models.nxcore.Evaluator;
import org.nasdanika.models.nxcore.NxcorePackage;
import org.nasdanika.models.nxcore.Period;
import org.nasdanika.models.nxcore.Temporal;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Control Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.impl.AccessControlEntryImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.AccessControlEntryImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.AccessControlEntryImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.AccessControlEntryImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.AccessControlEntryImpl#getSubjects <em>Subjects</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.AccessControlEntryImpl#getExcept <em>Except</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.AccessControlEntryImpl#getSubjectEvaluator <em>Subject Evaluator</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.AccessControlEntryImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.AccessControlEntryImpl#getActionEvaluator <em>Action Evaluator</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.AccessControlEntryImpl#getTargetEvaluator <em>Target Evaluator</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.AccessControlEntryImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.AccessControlEntryImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.AccessControlEntryImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessControlEntryImpl extends ModelElementImpl implements AccessControlEntry {
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
	protected AccessControlEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IamPackage.Literals.ACCESS_CONTROL_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(IamPackage.ACCESS_CONTROL_ENTRY__DURATION, NxcorePackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(IamPackage.ACCESS_CONTROL_ENTRY__DURATION, NxcorePackage.Literals.PERIOD__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(IamPackage.ACCESS_CONTROL_ENTRY__START, NxcorePackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, IamPackage.ACCESS_CONTROL_ENTRY__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(IamPackage.ACCESS_CONTROL_ENTRY__START, NxcorePackage.Literals.PERIOD__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(IamPackage.ACCESS_CONTROL_ENTRY__END, NxcorePackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, IamPackage.ACCESS_CONTROL_ENTRY__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(IamPackage.ACCESS_CONTROL_ENTRY__END, NxcorePackage.Literals.PERIOD__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Effect getEffect() {
		return (Effect)eDynamicGet(IamPackage.ACCESS_CONTROL_ENTRY__EFFECT, IamPackage.Literals.ACCESS_CONTROL_ENTRY__EFFECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffect(Effect newEffect) {
		eDynamicSet(IamPackage.ACCESS_CONTROL_ENTRY__EFFECT, IamPackage.Literals.ACCESS_CONTROL_ENTRY__EFFECT, newEffect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Subject> getSubjects() {
		return (EList<Subject>)eDynamicGet(IamPackage.ACCESS_CONTROL_ENTRY__SUBJECTS, IamPackage.Literals.ACCESS_CONTROL_ENTRY__SUBJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Subject> getExcept() {
		return (EList<Subject>)eDynamicGet(IamPackage.ACCESS_CONTROL_ENTRY__EXCEPT, IamPackage.Literals.ACCESS_CONTROL_ENTRY__EXCEPT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evaluator getSubjectEvaluator() {
		return (Evaluator)eDynamicGet(IamPackage.ACCESS_CONTROL_ENTRY__SUBJECT_EVALUATOR, IamPackage.Literals.ACCESS_CONTROL_ENTRY__SUBJECT_EVALUATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectEvaluator(Evaluator newSubjectEvaluator, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSubjectEvaluator, IamPackage.ACCESS_CONTROL_ENTRY__SUBJECT_EVALUATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectEvaluator(Evaluator newSubjectEvaluator) {
		eDynamicSet(IamPackage.ACCESS_CONTROL_ENTRY__SUBJECT_EVALUATOR, IamPackage.Literals.ACCESS_CONTROL_ENTRY__SUBJECT_EVALUATOR, newSubjectEvaluator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Action> getActions() {
		return (EList<Action>)eDynamicGet(IamPackage.ACCESS_CONTROL_ENTRY__ACTIONS, IamPackage.Literals.ACCESS_CONTROL_ENTRY__ACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evaluator getActionEvaluator() {
		return (Evaluator)eDynamicGet(IamPackage.ACCESS_CONTROL_ENTRY__ACTION_EVALUATOR, IamPackage.Literals.ACCESS_CONTROL_ENTRY__ACTION_EVALUATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionEvaluator(Evaluator newActionEvaluator, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newActionEvaluator, IamPackage.ACCESS_CONTROL_ENTRY__ACTION_EVALUATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionEvaluator(Evaluator newActionEvaluator) {
		eDynamicSet(IamPackage.ACCESS_CONTROL_ENTRY__ACTION_EVALUATOR, IamPackage.Literals.ACCESS_CONTROL_ENTRY__ACTION_EVALUATOR, newActionEvaluator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evaluator getTargetEvaluator() {
		return (Evaluator)eDynamicGet(IamPackage.ACCESS_CONTROL_ENTRY__TARGET_EVALUATOR, IamPackage.Literals.ACCESS_CONTROL_ENTRY__TARGET_EVALUATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetEvaluator(Evaluator newTargetEvaluator, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTargetEvaluator, IamPackage.ACCESS_CONTROL_ENTRY__TARGET_EVALUATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetEvaluator(Evaluator newTargetEvaluator) {
		eDynamicSet(IamPackage.ACCESS_CONTROL_ENTRY__TARGET_EVALUATOR, IamPackage.Literals.ACCESS_CONTROL_ENTRY__TARGET_EVALUATOR, newTargetEvaluator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getFeatures() {
		return (EList<String>)eDynamicGet(IamPackage.ACCESS_CONTROL_ENTRY__FEATURES, IamPackage.Literals.ACCESS_CONTROL_ENTRY__FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getOperations() {
		return (EList<String>)eDynamicGet(IamPackage.ACCESS_CONTROL_ENTRY__OPERATIONS, IamPackage.Literals.ACCESS_CONTROL_ENTRY__OPERATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evaluator getCondition() {
		return (Evaluator)eDynamicGet(IamPackage.ACCESS_CONTROL_ENTRY__CONDITION, IamPackage.Literals.ACCESS_CONTROL_ENTRY__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Evaluator newCondition, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCondition, IamPackage.ACCESS_CONTROL_ENTRY__CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Evaluator newCondition) {
		eDynamicSet(IamPackage.ACCESS_CONTROL_ENTRY__CONDITION, IamPackage.Literals.ACCESS_CONTROL_ENTRY__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IamPackage.ACCESS_CONTROL_ENTRY__START:
				return basicSetStart(null, msgs);
			case IamPackage.ACCESS_CONTROL_ENTRY__END:
				return basicSetEnd(null, msgs);
			case IamPackage.ACCESS_CONTROL_ENTRY__SUBJECT_EVALUATOR:
				return basicSetSubjectEvaluator(null, msgs);
			case IamPackage.ACCESS_CONTROL_ENTRY__ACTION_EVALUATOR:
				return basicSetActionEvaluator(null, msgs);
			case IamPackage.ACCESS_CONTROL_ENTRY__TARGET_EVALUATOR:
				return basicSetTargetEvaluator(null, msgs);
			case IamPackage.ACCESS_CONTROL_ENTRY__CONDITION:
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
			case IamPackage.ACCESS_CONTROL_ENTRY__DURATION:
				return getDuration();
			case IamPackage.ACCESS_CONTROL_ENTRY__START:
				return getStart();
			case IamPackage.ACCESS_CONTROL_ENTRY__END:
				return getEnd();
			case IamPackage.ACCESS_CONTROL_ENTRY__EFFECT:
				return getEffect();
			case IamPackage.ACCESS_CONTROL_ENTRY__SUBJECTS:
				return getSubjects();
			case IamPackage.ACCESS_CONTROL_ENTRY__EXCEPT:
				return getExcept();
			case IamPackage.ACCESS_CONTROL_ENTRY__SUBJECT_EVALUATOR:
				return getSubjectEvaluator();
			case IamPackage.ACCESS_CONTROL_ENTRY__ACTIONS:
				return getActions();
			case IamPackage.ACCESS_CONTROL_ENTRY__ACTION_EVALUATOR:
				return getActionEvaluator();
			case IamPackage.ACCESS_CONTROL_ENTRY__TARGET_EVALUATOR:
				return getTargetEvaluator();
			case IamPackage.ACCESS_CONTROL_ENTRY__FEATURES:
				return getFeatures();
			case IamPackage.ACCESS_CONTROL_ENTRY__OPERATIONS:
				return getOperations();
			case IamPackage.ACCESS_CONTROL_ENTRY__CONDITION:
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
			case IamPackage.ACCESS_CONTROL_ENTRY__DURATION:
				setDuration((Duration)newValue);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__START:
				setStart((Temporal)newValue);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__END:
				setEnd((Temporal)newValue);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__EFFECT:
				setEffect((Effect)newValue);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__SUBJECTS:
				getSubjects().clear();
				getSubjects().addAll((Collection<? extends Subject>)newValue);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__EXCEPT:
				getExcept().clear();
				getExcept().addAll((Collection<? extends Subject>)newValue);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__SUBJECT_EVALUATOR:
				setSubjectEvaluator((Evaluator)newValue);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__ACTION_EVALUATOR:
				setActionEvaluator((Evaluator)newValue);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__TARGET_EVALUATOR:
				setTargetEvaluator((Evaluator)newValue);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends String>)newValue);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends String>)newValue);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__CONDITION:
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
			case IamPackage.ACCESS_CONTROL_ENTRY__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__START:
				setStart((Temporal)null);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__END:
				setEnd((Temporal)null);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__SUBJECTS:
				getSubjects().clear();
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__EXCEPT:
				getExcept().clear();
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__SUBJECT_EVALUATOR:
				setSubjectEvaluator((Evaluator)null);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__ACTIONS:
				getActions().clear();
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__ACTION_EVALUATOR:
				setActionEvaluator((Evaluator)null);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__TARGET_EVALUATOR:
				setTargetEvaluator((Evaluator)null);
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__FEATURES:
				getFeatures().clear();
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__OPERATIONS:
				getOperations().clear();
				return;
			case IamPackage.ACCESS_CONTROL_ENTRY__CONDITION:
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
			case IamPackage.ACCESS_CONTROL_ENTRY__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case IamPackage.ACCESS_CONTROL_ENTRY__START:
				return getStart() != null;
			case IamPackage.ACCESS_CONTROL_ENTRY__END:
				return getEnd() != null;
			case IamPackage.ACCESS_CONTROL_ENTRY__EFFECT:
				return getEffect() != EFFECT_EDEFAULT;
			case IamPackage.ACCESS_CONTROL_ENTRY__SUBJECTS:
				return !getSubjects().isEmpty();
			case IamPackage.ACCESS_CONTROL_ENTRY__EXCEPT:
				return !getExcept().isEmpty();
			case IamPackage.ACCESS_CONTROL_ENTRY__SUBJECT_EVALUATOR:
				return getSubjectEvaluator() != null;
			case IamPackage.ACCESS_CONTROL_ENTRY__ACTIONS:
				return !getActions().isEmpty();
			case IamPackage.ACCESS_CONTROL_ENTRY__ACTION_EVALUATOR:
				return getActionEvaluator() != null;
			case IamPackage.ACCESS_CONTROL_ENTRY__TARGET_EVALUATOR:
				return getTargetEvaluator() != null;
			case IamPackage.ACCESS_CONTROL_ENTRY__FEATURES:
				return !getFeatures().isEmpty();
			case IamPackage.ACCESS_CONTROL_ENTRY__OPERATIONS:
				return !getOperations().isEmpty();
			case IamPackage.ACCESS_CONTROL_ENTRY__CONDITION:
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
				case IamPackage.ACCESS_CONTROL_ENTRY__DURATION: return NxcorePackage.PERIOD__DURATION;
				case IamPackage.ACCESS_CONTROL_ENTRY__START: return NxcorePackage.PERIOD__START;
				case IamPackage.ACCESS_CONTROL_ENTRY__END: return NxcorePackage.PERIOD__END;
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
				case NxcorePackage.PERIOD__DURATION: return IamPackage.ACCESS_CONTROL_ENTRY__DURATION;
				case NxcorePackage.PERIOD__START: return IamPackage.ACCESS_CONTROL_ENTRY__START;
				case NxcorePackage.PERIOD__END: return IamPackage.ACCESS_CONTROL_ENTRY__END;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AccessControlEntryImpl
