/**
 */
package org.nasdanika.models.iam;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.Evaluator;
import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Control Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Authorization statements ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.AccessControlEntry#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.AccessControlEntry#getSubjects <em>Subjects</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.AccessControlEntry#getExcept <em>Except</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.AccessControlEntry#getSubjectEvaluator <em>Subject Evaluator</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.AccessControlEntry#getActions <em>Actions</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.AccessControlEntry#getActionEvaluator <em>Action Evaluator</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.AccessControlEntry#getTargetEvaluator <em>Target Evaluator</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.AccessControlEntry#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.AccessControlEntry#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.nasdanika.models.iam.AccessControlEntry#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.iam.IamPackage#getAccessControlEntry()
 * @model
 * @generated
 */
public interface AccessControlEntry extends ModelElement, Period {
	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.iam.Effect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see org.nasdanika.models.iam.Effect
	 * @see #setEffect(Effect)
	 * @see org.nasdanika.models.iam.IamPackage#getAccessControlEntry_Effect()
	 * @model unique="false"
	 * @generated
	 */
	Effect getEffect();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.iam.AccessControlEntry#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see org.nasdanika.models.iam.Effect
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Effect value);

	/**
	 * Returns the value of the '<em><b>Subjects</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.iam.Subject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Who the entry applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subjects</em>' reference list.
	 * @see org.nasdanika.models.iam.IamPackage#getAccessControlEntry_Subjects()
	 * @model
	 * @generated
	 */
	EList<Subject> getSubjects();

	/**
	 * Returns the value of the '<em><b>Except</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.iam.Subject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Carve-outs: subjects excluded from the above, e.g. a group minus specific principals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Except</em>' reference list.
	 * @see org.nasdanika.models.iam.IamPackage#getAccessControlEntry_Except()
	 * @model
	 * @generated
	 */
	EList<Subject> getExcept();

	/**
	 * Returns the value of the '<em><b>Subject Evaluator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Computes subjects
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Evaluator</em>' containment reference.
	 * @see #setSubjectEvaluator(Evaluator)
	 * @see org.nasdanika.models.iam.IamPackage#getAccessControlEntry_SubjectEvaluator()
	 * @model containment="true"
	 * @generated
	 */
	Evaluator getSubjectEvaluator();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.iam.AccessControlEntry#getSubjectEvaluator <em>Subject Evaluator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Evaluator</em>' containment reference.
	 * @see #getSubjectEvaluator()
	 * @generated
	 */
	void setSubjectEvaluator(Evaluator value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.iam.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see org.nasdanika.models.iam.IamPackage#getAccessControlEntry_Actions()
	 * @model
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Action Evaluator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Computes actions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Evaluator</em>' containment reference.
	 * @see #setActionEvaluator(Evaluator)
	 * @see org.nasdanika.models.iam.IamPackage#getAccessControlEntry_ActionEvaluator()
	 * @model containment="true"
	 * @generated
	 */
	Evaluator getActionEvaluator();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.iam.AccessControlEntry#getActionEvaluator <em>Action Evaluator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Evaluator</em>' containment reference.
	 * @see #getActionEvaluator()
	 * @generated
	 */
	void setActionEvaluator(Evaluator value);

	/**
	 * Returns the value of the '<em><b>Target Evaluator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Evaluator for descendant elements the entry covers; null means the element itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Evaluator</em>' containment reference.
	 * @see #setTargetEvaluator(Evaluator)
	 * @see org.nasdanika.models.iam.IamPackage#getAccessControlEntry_TargetEvaluator()
	 * @model containment="true"
	 * @generated
	 */
	Evaluator getTargetEvaluator();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.iam.AccessControlEntry#getTargetEvaluator <em>Target Evaluator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Evaluator</em>' containment reference.
	 * @see #getTargetEvaluator()
	 * @generated
	 */
	void setTargetEvaluator(Evaluator value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Structural feature names the entry covers; empty means all.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' attribute list.
	 * @see org.nasdanika.models.iam.IamPackage#getAccessControlEntry_Features()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getFeatures();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Operation names the entry covers; empty means all.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operations</em>' attribute list.
	 * @see org.nasdanika.models.iam.IamPackage#getAccessControlEntry_Operations()
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
	 * Boolean expression evaluator over subject, element, and environment; ABAC and stage-scoped access live here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Evaluator)
	 * @see org.nasdanika.models.iam.IamPackage#getAccessControlEntry_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Evaluator getCondition();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.iam.AccessControlEntry#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Evaluator value);

} // AccessControlEntry
