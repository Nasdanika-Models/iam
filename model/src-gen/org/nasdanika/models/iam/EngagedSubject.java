/**
 */
package org.nasdanika.models.iam;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engaged Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A relationship-defined subject (ReBAC): whoever is engaged with the
 * protected element in the given role-model role, e.g. "owner",
 * "reviewer". Bridges IAM to the role model: ownership data lives there,
 * grants derived from it live here.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.EngagedSubject#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.EngagedSubject#isInherited <em>Inherited</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.iam.IamPackage#getEngagedSubject()
 * @model
 * @generated
 */
public interface EngagedSubject extends Subject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Name or URI of the role in the role model. Becomes a typed reference once the role model nsURI is verified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.nasdanika.models.iam.IamPackage#getEngagedSubject_Role()
	 * @model unique="false"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.iam.EngagedSubject#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Inherited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  If true, engagements on ancestor elements also match (the owner of a catalog is treated as engaged with its entries).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited</em>' attribute.
	 * @see #setInherited(boolean)
	 * @see org.nasdanika.models.iam.IamPackage#getEngagedSubject_Inherited()
	 * @model unique="false"
	 * @generated
	 */
	boolean isInherited();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.iam.EngagedSubject#isInherited <em>Inherited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherited</em>' attribute.
	 * @see #isInherited()
	 * @generated
	 */
	void setInherited(boolean value);

} // EngagedSubject
