/**
 */
package org.nasdanika.models.iam;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.Evaluator;
import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Subject-side statement, contained in a subject (typically a Role):
 * what the subject may (or may not) do, on which resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.Permission#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.Permission#getActions <em>Actions</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.Permission#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.Permission#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.Permission#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.Permission#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.iam.IamPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends ModelElement, Period {
	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.iam.Effect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see org.nasdanika.models.iam.Effect
	 * @see #setEffect(Effect)
	 * @see org.nasdanika.models.iam.IamPackage#getPermission_Effect()
	 * @model unique="false"
	 * @generated
	 */
	Effect getEffect();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.iam.Permission#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see org.nasdanika.models.iam.Effect
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Effect value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.iam.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see org.nasdanika.models.iam.IamPackage#getPermission_Actions()
	 * @model
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Selector for the resources the permission covers, absolute or realm-relative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference.
	 * @see #setResources(Evaluator)
	 * @see org.nasdanika.models.iam.IamPackage#getPermission_Resources()
	 * @model containment="true"
	 * @generated
	 */
	Evaluator getResources();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.iam.Permission#getResources <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' containment reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(Evaluator value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' attribute list.
	 * @see org.nasdanika.models.iam.IamPackage#getPermission_Features()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getFeatures();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' attribute list.
	 * @see org.nasdanika.models.iam.IamPackage#getPermission_Operations()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getOperations();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Boolean expression evaluator over subject, element, and environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Evaluator)
	 * @see org.nasdanika.models.iam.IamPackage#getPermission_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Evaluator getCondition();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.iam.Permission#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Evaluator value);

} // Permission
