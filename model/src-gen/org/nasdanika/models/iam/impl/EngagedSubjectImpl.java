/**
 */
package org.nasdanika.models.iam.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.iam.EngagedSubject;
import org.nasdanika.models.iam.IamPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engaged Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.impl.EngagedSubjectImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.impl.EngagedSubjectImpl#isInherited <em>Inherited</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngagedSubjectImpl extends SubjectImpl implements EngagedSubject {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isInherited() <em>Inherited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInherited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INHERITED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngagedSubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IamPackage.Literals.ENGAGED_SUBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return (String)eDynamicGet(IamPackage.ENGAGED_SUBJECT__ROLE, IamPackage.Literals.ENGAGED_SUBJECT__ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		eDynamicSet(IamPackage.ENGAGED_SUBJECT__ROLE, IamPackage.Literals.ENGAGED_SUBJECT__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInherited() {
		return (Boolean)eDynamicGet(IamPackage.ENGAGED_SUBJECT__INHERITED, IamPackage.Literals.ENGAGED_SUBJECT__INHERITED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInherited(boolean newInherited) {
		eDynamicSet(IamPackage.ENGAGED_SUBJECT__INHERITED, IamPackage.Literals.ENGAGED_SUBJECT__INHERITED, newInherited);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IamPackage.ENGAGED_SUBJECT__ROLE:
				return getRole();
			case IamPackage.ENGAGED_SUBJECT__INHERITED:
				return isInherited();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IamPackage.ENGAGED_SUBJECT__ROLE:
				setRole((String)newValue);
				return;
			case IamPackage.ENGAGED_SUBJECT__INHERITED:
				setInherited((Boolean)newValue);
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
			case IamPackage.ENGAGED_SUBJECT__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case IamPackage.ENGAGED_SUBJECT__INHERITED:
				setInherited(INHERITED_EDEFAULT);
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
			case IamPackage.ENGAGED_SUBJECT__ROLE:
				return ROLE_EDEFAULT == null ? getRole() != null : !ROLE_EDEFAULT.equals(getRole());
			case IamPackage.ENGAGED_SUBJECT__INHERITED:
				return isInherited() != INHERITED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //EngagedSubjectImpl
