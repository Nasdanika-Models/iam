/**
 */
package org.nasdanika.models.iam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A named set of subjects: an organizational unit, a team, a subscription
 * tier. Groups may contain groups. In the sealed-delivery extension a
 * group is the unit of key distribution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.iam.Group#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.iam.IamPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Subject {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.iam.Subject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see org.nasdanika.models.iam.IamPackage#getGroup_Members()
	 * @model
	 * @generated
	 */
	EList<Subject> getMembers();

} // Group
