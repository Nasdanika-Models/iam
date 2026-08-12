/**
 */
package org.nasdanika.models.iam;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.NamedPeriod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Realms ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.Realm#getRealms <em>Realms</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.Realm#getSubjects <em>Subjects</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.Realm#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.iam.IamPackage#getRealm()
 * @model
 * @generated
 */
public interface Realm extends NamedPeriod, AccessControlled {
	/**
	 * Returns the value of the '<em><b>Realms</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.iam.Realm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realms</em>' containment reference list.
	 * @see org.nasdanika.models.iam.IamPackage#getRealm_Realms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Realm> getRealms();

	/**
	 * Returns the value of the '<em><b>Subjects</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.iam.Subject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjects</em>' containment reference list.
	 * @see org.nasdanika.models.iam.IamPackage#getRealm_Subjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subject> getSubjects();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.iam.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.nasdanika.models.iam.IamPackage#getRealm_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Realm
