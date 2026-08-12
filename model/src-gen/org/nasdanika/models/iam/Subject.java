/**
 */
package org.nasdanika.models.iam;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Subjects (who) ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.Subject#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.Subject#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.iam.IamPackage#getSubject()
 * @model abstract="true"
 * @generated
 */
public interface Subject extends ModelElement, Period {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.iam.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.nasdanika.models.iam.IamPackage#getSubject_Roles()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.iam.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see org.nasdanika.models.iam.IamPackage#getSubject_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permission> getPermissions();

} // Subject
