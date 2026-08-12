/**
 */
package org.nasdanika.models.iam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Principal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An individual identity: a person, a service account, an agent.
 * Authentication of the principal (how it proves it is who it says it is)
 * is the enforcement layer's problem; aliases carry the external
 * identifiers (login, e-mail, OIDC subject) used to match.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.Principal#getAliases <em>Aliases</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.iam.IamPackage#getPrincipal()
 * @model
 * @generated
 */
public interface Principal extends Subject {
	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' attribute list.
	 * @see org.nasdanika.models.iam.IamPackage#getPrincipal_Aliases()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getAliases();

} // Principal
