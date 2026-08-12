/**
 */
package org.nasdanika.models.iam;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An expression-defined set of subjects (ABAC): all principals for which
 * the expression evaluates to true, e.g. principal.department == "Risk".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.SubjectSelector#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.iam.IamPackage#getSubjectSelector()
 * @model
 * @generated
 */
public interface SubjectSelector extends Subject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Boolean expression over subject attributes and properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.nasdanika.models.iam.IamPackage#getSubjectSelector_Expression()
	 * @model unique="false"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.iam.SubjectSelector#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // SubjectSelector
