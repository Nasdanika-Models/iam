/**
 */
package org.nasdanika.models.iam;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Controlled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Protected elements ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.AccessControlled#getAccessControl <em>Access Control</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.iam.IamPackage#getAccessControlled()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AccessControlled extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Control</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.iam.AccessControlEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Control</em>' containment reference list.
	 * @see org.nasdanika.models.iam.IamPackage#getAccessControlled_AccessControl()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccessControlEntry> getAccessControl();

} // AccessControlled
