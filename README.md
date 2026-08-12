# Nasdanika IAM Model

An [Ecore](https://www.eclipse.org/modeling/emf/) micro-model of identities and access control: realms, principals, groups, roles, actions, and authorization statements attachable to any model element. Defined in [`iam.xcore`](iam.xcore).

## Why "IAM"

The name is right, with one scope caveat. Pros: instantly recognizable (AWS IAM, GCP IAM, Keycloak realms all use this vocabulary), and it honestly covers both halves of the model, the identity directory (realm, principal, group) and the access half (entries, permissions). The caveat: in industry usage IAM also implies authentication, credential lifecycle, federation protocols, and provisioning. This model deliberately excludes all of that. It is authorization data plus an identity directory; authentication is delegated to the enforcement layer (Apache Shiro, an IdP). Alternatives considered and rejected: "access" or "authz" lose the identity half, "security" is too broad, "protection" is ODP-flavored but obscure. Keep IAM, state the scope, as this page does.

## Position among the aspect models

IAM is an aspect model, like lifecycle, role, and governance: it applies to anything which needs protection. `AccessControlled` is the extension point, playing the same part `GovernedElement` plays in the [governance model](../governance/README.md).

**Depends on the role model.** There are two distinct meanings of "role" and the model keeps them apart. An IAM `Role` is a named, assignable permission bundle (RBAC). A role-model role is an engagement type on an element (owner, reviewer, approver). They meet at exactly one point: `EngagedSubject`, a grant to whoever is engaged with the protected element in a given role-model role. "The owner may edit" is one entry with an `EngagedSubject`, and ownership data stays in the role model where it belongs. This is relationship-based access control (ReBAC, the Zanzibar idea) in miniature, and it is the only IAM dependency on the role model.

**Independent of the lifecycle model, and that is the recommendation.** Two couplings are conceivable and they point in opposite directions. Stage-scoped access ("visible only when published") would make IAM depend on lifecycle; transition guards ("who may approve this transition") make lifecycle depend on IAM. Taking both creates a cycle. The resolution: stage-scoped access is just an ABAC condition (`subject.stage == "published"`), already expressible in `condition` with no metamodel dependency. Transition guards are a genuine typed need, so the dependency arrow is lifecycle -> IAM, added the way the work model adds its aspect upgrades: an optional extension class, not a change to either base. This matches the lean stated in the request, with the addition that most "staged IAM elements" turn out not to be needed because conditions cover them.

**Governance depends on IAM.** An access control entry is a `PREVENTIVE` control by nature; a realm export is `Evidence`; segregation-of-duties requirements crosswalk to IAM instance data. No change to the governance base is needed, the connection is instance-level or a thin extension.

## Model overview

| Area | Types |
|------|-------|
| Base | `ModelElement`, `Property`, `Effect` |
| Actions | `Action` (hierarchical, instance data like `WorkType`) |
| Subjects | `Subject`, `Principal`, `Group`, `Role`, `SubjectSelector` (ABAC), `EngagedSubject` (ReBAC) |
| Realms | `Realm` (nested, itself access controlled) |
| Statements | `AccessControlEntry` (resource-side), `Permission` (subject-side) |
| Protected elements | `AccessControlled` |

Authorization statements come in two directions, matching XACML policies and Shiro permissions respectively. Resource-side: `AccessControlEntry` contained in the protected element ("on this capability, the pro tier may view"). Subject-side: `Permission` contained in a subject, typically a `Role` ("editors may write `capability/**`"). An entry or permission scopes to the element itself, to descendants by selector (NxPath), and down to individual features and operations. `subjects` plus `except` gives include/exclude; `Effect` gives allow/deny; `condition` gives ABAC. The combining algorithm is the AWS IAM / XACML convention: collect matching statements from the element and its ancestors plus the subject's permissions, explicit `DENY` overrides `ALLOW`, no match means `DENY`.

Because `Role extends Subject`, role hierarchies and roles-with-roles come for free, and `Realm extends AccessControlled` means realm administration is ordinary instance data rather than a special mechanism.

## Uses

**Identity-scoped generation.** Documentation sites and other derived artifacts are generated *for an identity*: resolve effective `view` permission for the target principal and filter the model before generation. The same capability model produces a full site locally (generated for the author principal) and a public site on GitHub Pages (generated for an anonymous / everyone subject) with private capabilities absent, not merely hidden. Publishing destinations are principals.

**Enforcement behind a Web UI.** Where users have no direct access to models in version control, a server consults the model at request time. The mapping to Apache Shiro is direct: model `Realm` backs a Shiro Realm, the `Action` hierarchy plus resource selectors flatten to Shiro wildcard permission strings, and Shiro handles what this model deliberately does not: authentication and sessions.

**Element-level encryption (sealed delivery).** Encryption builds on top of IAM rather than into it. A sealed-delivery extension maps `Group`s to keys; group membership, including subscription tiers, is the key distribution graph. Elements whose effective visibility excludes "everyone" are sealed in the published artifact and unseal for members holding the group key. One artifact, tiered visibility, and non-repudiation via signing, with IAM supplying the who-sees-what and the extension supplying the cryptography.

## Relation to other Nasdanika work

Ownership and engagements come from the role model via `EngagedSubject`. Lifecycle stays decoupled as described above. Access control entries surface in the [governance model](../governance/README.md) as preventive controls with realm exports as evidence. Selectors and conditions are expression strings by design; NxPath is the intended selector language. Protected elements in practice: capabilities in the Product Management model, agents and tools in the [agent model](https://agent.models.nasdanika.org/index.html), servers in the [MCP model](../mcp/README.md).

> *Editor's note for Pavel: `EngagedSubject.role` is a string until the role model nsURI and class names are verified (same note as in the work model); then it becomes a typed reference and IAM imports the role model. Decide whether `Realm` needs a `RealmReference` for federation (PM-model pattern) once a second realm source exists. The Shiro wildcard flattening and the sealed-delivery key model deserve their own design notes.*
