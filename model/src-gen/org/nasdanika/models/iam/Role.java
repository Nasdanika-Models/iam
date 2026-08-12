/**
 */
package org.nasdanika.models.iam;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An IAM role: a named, assignable bundle of permissions (RBAC). Not to be
 * confused with the role model's roles, which are engagement types on
 * elements (owner, reviewer); see EngagedSubject for the bridge.
 * Role extends Subject, so role hierarchies (a role having roles) and
 * direct permissions come for free.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.models.iam.IamPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Subject {
} // Role
