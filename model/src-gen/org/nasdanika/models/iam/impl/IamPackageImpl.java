/**
 */
package org.nasdanika.models.iam.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.iam.AccessControlEntry;
import org.nasdanika.models.iam.AccessControlled;
import org.nasdanika.models.iam.Action;
import org.nasdanika.models.iam.Content;
import org.nasdanika.models.iam.Effect;
import org.nasdanika.models.iam.EngagedSubject;
import org.nasdanika.models.iam.Group;
import org.nasdanika.models.iam.IamFactory;
import org.nasdanika.models.iam.IamPackage;
import org.nasdanika.models.iam.Permission;
import org.nasdanika.models.iam.Principal;
import org.nasdanika.models.iam.Realm;
import org.nasdanika.models.iam.Role;
import org.nasdanika.models.iam.Section;
import org.nasdanika.models.iam.Subject;
import org.nasdanika.models.iam.SubjectSelector;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.role.RolePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IamPackageImpl extends EPackageImpl implements IamPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass principalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engagedSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum effectEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.iam.IamPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IamPackageImpl() {
		super(eNS_URI, IamFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IamPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IamPackage init() {
		if (isInited) return (IamPackage)EPackage.Registry.INSTANCE.getEPackage(IamPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIamPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IamPackageImpl theIamPackage = registeredIamPackage instanceof IamPackageImpl ? (IamPackageImpl)registeredIamPackage : new IamPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NxcorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		RolePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIamPackage.createPackageContents();

		// Initialize created meta-data
		theIamPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIamPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IamPackage.eNS_URI, theIamPackage);
		return theIamPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_Children() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubject() {
		return subjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubject_Roles() {
		return (EReference)subjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubject_Permissions() {
		return (EReference)subjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrincipal() {
		return principalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrincipal_Aliases() {
		return (EAttribute)principalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Members() {
		return (EReference)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubjectSelector() {
		return subjectSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubjectSelector_Expression() {
		return (EAttribute)subjectSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEngagedSubject() {
		return engagedSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEngagedSubject_Role() {
		return (EAttribute)engagedSubjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEngagedSubject_Inherited() {
		return (EAttribute)engagedSubjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRealm() {
		return realmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRealm_Realms() {
		return (EReference)realmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRealm_Subjects() {
		return (EReference)realmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRealm_Actions() {
		return (EReference)realmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessControlEntry() {
		return accessControlEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessControlEntry_Effect() {
		return (EAttribute)accessControlEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlEntry_Subjects() {
		return (EReference)accessControlEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlEntry_Except() {
		return (EReference)accessControlEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlEntry_SubjectEvaluator() {
		return (EReference)accessControlEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlEntry_Actions() {
		return (EReference)accessControlEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlEntry_ActionEvaluator() {
		return (EReference)accessControlEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlEntry_TargetEvaluator() {
		return (EReference)accessControlEntryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessControlEntry_Features() {
		return (EAttribute)accessControlEntryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessControlEntry_Operations() {
		return (EAttribute)accessControlEntryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlEntry_Condition() {
		return (EReference)accessControlEntryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_Effect() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermission_Actions() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermission_Resources() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_Features() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_Operations() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermission_Condition() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessControlled() {
		return accessControlledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlled_AccessControl() {
		return (EReference)accessControlledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEffect() {
		return effectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IamFactory getIamFactory() {
		return (IamFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__CHILDREN);

		subjectEClass = createEClass(SUBJECT);
		createEReference(subjectEClass, SUBJECT__ROLES);
		createEReference(subjectEClass, SUBJECT__PERMISSIONS);

		principalEClass = createEClass(PRINCIPAL);
		createEAttribute(principalEClass, PRINCIPAL__ALIASES);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__MEMBERS);

		roleEClass = createEClass(ROLE);

		subjectSelectorEClass = createEClass(SUBJECT_SELECTOR);
		createEAttribute(subjectSelectorEClass, SUBJECT_SELECTOR__EXPRESSION);

		engagedSubjectEClass = createEClass(ENGAGED_SUBJECT);
		createEAttribute(engagedSubjectEClass, ENGAGED_SUBJECT__ROLE);
		createEAttribute(engagedSubjectEClass, ENGAGED_SUBJECT__INHERITED);

		realmEClass = createEClass(REALM);
		createEReference(realmEClass, REALM__REALMS);
		createEReference(realmEClass, REALM__SUBJECTS);
		createEReference(realmEClass, REALM__ACTIONS);

		accessControlEntryEClass = createEClass(ACCESS_CONTROL_ENTRY);
		createEAttribute(accessControlEntryEClass, ACCESS_CONTROL_ENTRY__EFFECT);
		createEReference(accessControlEntryEClass, ACCESS_CONTROL_ENTRY__SUBJECTS);
		createEReference(accessControlEntryEClass, ACCESS_CONTROL_ENTRY__EXCEPT);
		createEReference(accessControlEntryEClass, ACCESS_CONTROL_ENTRY__SUBJECT_EVALUATOR);
		createEReference(accessControlEntryEClass, ACCESS_CONTROL_ENTRY__ACTIONS);
		createEReference(accessControlEntryEClass, ACCESS_CONTROL_ENTRY__ACTION_EVALUATOR);
		createEReference(accessControlEntryEClass, ACCESS_CONTROL_ENTRY__TARGET_EVALUATOR);
		createEAttribute(accessControlEntryEClass, ACCESS_CONTROL_ENTRY__FEATURES);
		createEAttribute(accessControlEntryEClass, ACCESS_CONTROL_ENTRY__OPERATIONS);
		createEReference(accessControlEntryEClass, ACCESS_CONTROL_ENTRY__CONDITION);

		permissionEClass = createEClass(PERMISSION);
		createEAttribute(permissionEClass, PERMISSION__EFFECT);
		createEReference(permissionEClass, PERMISSION__ACTIONS);
		createEReference(permissionEClass, PERMISSION__RESOURCES);
		createEAttribute(permissionEClass, PERMISSION__FEATURES);
		createEAttribute(permissionEClass, PERMISSION__OPERATIONS);
		createEReference(permissionEClass, PERMISSION__CONDITION);

		accessControlledEClass = createEClass(ACCESS_CONTROLLED);
		createEReference(accessControlledEClass, ACCESS_CONTROLLED__ACCESS_CONTROL);

		contentEClass = createEClass(CONTENT);

		sectionEClass = createEClass(SECTION);

		// Create enums
		effectEEnum = createEEnum(EFFECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NxcorePackage theNxcorePackage = (NxcorePackage)EPackage.Registry.INSTANCE.getEPackage(NxcorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		RolePackage theRolePackage = (RolePackage)EPackage.Registry.INSTANCE.getEPackage(RolePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		actionEClass.getESuperTypes().add(theNxcorePackage.getPeriod());
		subjectEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		subjectEClass.getESuperTypes().add(theNxcorePackage.getPeriod());
		principalEClass.getESuperTypes().add(this.getSubject());
		groupEClass.getESuperTypes().add(this.getSubject());
		roleEClass.getESuperTypes().add(this.getSubject());
		subjectSelectorEClass.getESuperTypes().add(this.getSubject());
		engagedSubjectEClass.getESuperTypes().add(this.getSubject());
		realmEClass.getESuperTypes().add(theNxcorePackage.getNamedPeriod());
		realmEClass.getESuperTypes().add(this.getAccessControlled());
		accessControlEntryEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		accessControlEntryEClass.getESuperTypes().add(theNxcorePackage.getPeriod());
		permissionEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		permissionEClass.getESuperTypes().add(theNxcorePackage.getPeriod());
		contentEClass.getESuperTypes().add(theRolePackage.getContent());
		contentEClass.getESuperTypes().add(this.getAccessControlled());
		sectionEClass.getESuperTypes().add(theRolePackage.getSection());
		sectionEClass.getESuperTypes().add(this.getAccessControlled());

		// Initialize classes, features, and operations; add parameters
		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Children(), this.getAction(), null, "children", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subjectEClass, Subject.class, "Subject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubject_Roles(), this.getRole(), null, "roles", null, 0, -1, Subject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubject_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, Subject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(principalEClass, Principal.class, "Principal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrincipal_Aliases(), theEcorePackage.getEString(), "aliases", null, 0, -1, Principal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Members(), this.getSubject(), null, "members", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subjectSelectorEClass, SubjectSelector.class, "SubjectSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubjectSelector_Expression(), theEcorePackage.getEString(), "expression", null, 0, 1, SubjectSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engagedSubjectEClass, EngagedSubject.class, "EngagedSubject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEngagedSubject_Role(), theEcorePackage.getEString(), "role", null, 0, 1, EngagedSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngagedSubject_Inherited(), theEcorePackage.getEBoolean(), "inherited", null, 0, 1, EngagedSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realmEClass, Realm.class, "Realm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealm_Realms(), this.getRealm(), null, "realms", null, 0, -1, Realm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealm_Subjects(), this.getSubject(), null, "subjects", null, 0, -1, Realm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRealm_Actions(), this.getAction(), null, "actions", null, 0, -1, Realm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessControlEntryEClass, AccessControlEntry.class, "AccessControlEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessControlEntry_Effect(), this.getEffect(), "effect", null, 0, 1, AccessControlEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlEntry_Subjects(), this.getSubject(), null, "subjects", null, 0, -1, AccessControlEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlEntry_Except(), this.getSubject(), null, "except", null, 0, -1, AccessControlEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlEntry_SubjectEvaluator(), theNxcorePackage.getEvaluator(), null, "subjectEvaluator", null, 0, 1, AccessControlEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlEntry_Actions(), this.getAction(), null, "actions", null, 0, -1, AccessControlEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlEntry_ActionEvaluator(), theNxcorePackage.getEvaluator(), null, "actionEvaluator", null, 0, 1, AccessControlEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlEntry_TargetEvaluator(), theNxcorePackage.getEvaluator(), null, "targetEvaluator", null, 0, 1, AccessControlEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessControlEntry_Features(), theEcorePackage.getEString(), "features", null, 0, -1, AccessControlEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessControlEntry_Operations(), theEcorePackage.getEString(), "operations", null, 0, -1, AccessControlEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlEntry_Condition(), theNxcorePackage.getEvaluator(), null, "condition", null, 0, 1, AccessControlEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermission_Effect(), this.getEffect(), "effect", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_Actions(), this.getAction(), null, "actions", null, 0, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_Resources(), theNxcorePackage.getEvaluator(), null, "resources", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_Features(), theEcorePackage.getEString(), "features", null, 0, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_Operations(), theEcorePackage.getEString(), "operations", null, 0, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_Condition(), theNxcorePackage.getEvaluator(), null, "condition", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessControlledEClass, AccessControlled.class, "AccessControlled", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessControlled_AccessControl(), this.getAccessControlEntry(), null, "accessControl", null, 0, -1, AccessControlled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentEClass, Content.class, "Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(effectEEnum, Effect.class, "Effect");
		addEEnumLiteral(effectEEnum, Effect.ALLOW);
		addEEnumLiteral(effectEEnum, Effect.DENY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Actions ----"
		   });
		addAnnotation
		  (subjectEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Subjects (who) ----"
		   });
		addAnnotation
		  (principalEClass,
		   source,
		   new String[] {
			   "documentation", "An individual identity: a person, a service account, an agent.\nAuthentication of the principal (how it proves it is who it says it is)\nis the enforcement layer\'s problem; aliases carry the external\nidentifiers (login, e-mail, OIDC subject) used to match."
		   });
		addAnnotation
		  (groupEClass,
		   source,
		   new String[] {
			   "documentation", "A named set of subjects: an organizational unit, a team, a subscription\ntier. Groups may contain groups. In the sealed-delivery extension a\ngroup is the unit of key distribution."
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
			   "documentation", "An IAM role: a named, assignable bundle of permissions (RBAC). Not to be\nconfused with the role model\'s roles, which are engagement types on\nelements (owner, reviewer); see EngagedSubject for the bridge.\nRole extends Subject, so role hierarchies (a role having roles) and\ndirect permissions come for free."
		   });
		addAnnotation
		  (subjectSelectorEClass,
		   source,
		   new String[] {
			   "documentation", "An expression-defined set of subjects (ABAC): all principals for which\nthe expression evaluates to true, e.g. principal.department == \"Risk\"."
		   });
		addAnnotation
		  (getSubjectSelector_Expression(),
		   source,
		   new String[] {
			   "documentation", " Boolean expression over subject attributes and properties."
		   });
		addAnnotation
		  (engagedSubjectEClass,
		   source,
		   new String[] {
			   "documentation", "A relationship-defined subject (ReBAC): whoever is engaged with the\nprotected element in the given role-model role, e.g. \"owner\",\n\"reviewer\". Bridges IAM to the role model: ownership data lives there,\ngrants derived from it live here."
		   });
		addAnnotation
		  (getEngagedSubject_Role(),
		   source,
		   new String[] {
			   "documentation", " Name or URI of the role in the role model. Becomes a typed reference once the role model nsURI is verified."
		   });
		addAnnotation
		  (getEngagedSubject_Inherited(),
		   source,
		   new String[] {
			   "documentation", " If true, engagements on ancestor elements also match (the owner of a catalog is treated as engaged with its entries)."
		   });
		addAnnotation
		  (realmEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Realms ----"
		   });
		addAnnotation
		  (accessControlEntryEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Authorization statements ----"
		   });
		addAnnotation
		  (getAccessControlEntry_Subjects(),
		   source,
		   new String[] {
			   "documentation", "*\nWho the entry applies to."
		   });
		addAnnotation
		  (getAccessControlEntry_Except(),
		   source,
		   new String[] {
			   "documentation", "*\nCarve-outs: subjects excluded from the above, e.g. a group minus specific principals."
		   });
		addAnnotation
		  (getAccessControlEntry_SubjectEvaluator(),
		   source,
		   new String[] {
			   "documentation", "*\nComputes subjects"
		   });
		addAnnotation
		  (getAccessControlEntry_ActionEvaluator(),
		   source,
		   new String[] {
			   "documentation", "*\nComputes actions"
		   });
		addAnnotation
		  (getAccessControlEntry_TargetEvaluator(),
		   source,
		   new String[] {
			   "documentation", "*\nEvaluator for descendant elements the entry covers; null means the element itself."
		   });
		addAnnotation
		  (getAccessControlEntry_Features(),
		   source,
		   new String[] {
			   "documentation", "*\nStructural feature names the entry covers; empty means all."
		   });
		addAnnotation
		  (getAccessControlEntry_Operations(),
		   source,
		   new String[] {
			   "documentation", "*\nOperation names the entry covers; empty means all."
		   });
		addAnnotation
		  (getAccessControlEntry_Condition(),
		   source,
		   new String[] {
			   "documentation", "*\nBoolean expression evaluator over subject, element, and environment; ABAC and stage-scoped access live here."
		   });
		addAnnotation
		  (permissionEClass,
		   source,
		   new String[] {
			   "documentation", "Subject-side statement, contained in a subject (typically a Role):\nwhat the subject may (or may not) do, on which resources."
		   });
		addAnnotation
		  (getPermission_Resources(),
		   source,
		   new String[] {
			   "documentation", "*\nSelector for the resources the permission covers, absolute or realm-relative."
		   });
		addAnnotation
		  (getPermission_Condition(),
		   source,
		   new String[] {
			   "documentation", "*\nBoolean expression evaluator over subject, element, and environment."
		   });
		addAnnotation
		  (accessControlledEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Protected elements ----"
		   });
		addAnnotation
		  (contentEClass,
		   source,
		   new String[] {
			   "documentation", "*\nAccess controlled content, e.g. targeted for specific audiences"
		   });
		addAnnotation
		  (sectionEClass,
		   source,
		   new String[] {
			   "documentation", "*\nAccess controlled section, e.g. targeted for specific audiences"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //IamPackageImpl
