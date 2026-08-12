/**
 */
package org.nasdanika.models.iam;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Actions ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.Action#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.iam.IamPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends ModelElement, Period {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.iam.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.iam.IamPackage#getAction_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getChildren();

} // Action
