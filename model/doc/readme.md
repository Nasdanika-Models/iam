
```drawio-resource
../iam.drawio
```

An [Ecore](https://ecore.models.nasdanika.org/) micro-model of authorization: realms, subjects, actions, and allow/deny statements attachable to any model element in any model above.
Eleven types, and no permission vocabulary of its own - the actions are yours.

[TOC levels=6]

## Scope, and what the name promises

The name is accurate with one caveat worth stating before anything else.
"IAM" is instantly legible - AWS IAM, GCP IAM, and Keycloak realms all use this vocabulary - and it honestly covers both halves of the model: the identity directory (`Realm`, `Principal`, `Group`) and the access half (`AccessControlEntry`, `Permission`).
In industry usage it also implies authentication, credential lifecycle, federation protocols, session management, and provisioning.
This model deliberately excludes all of it.

What is here is *authorization data plus an identity directory*.
How a principal proves it is who it claims to be is the enforcement layer's problem - an IdP, [Apache Shiro](https://shiro.apache.org/), a forge's OAuth; `Principal.aliases` carries the external identifiers (login, e-mail, OIDC subject) those layers match against, and nothing more.
The alternatives were worse: "access" and "authz" lose the identity half, "security" is too broad, "protection" is ODP-flavored but obscure.
Keep the name, state the scope.

## Position in the tower

The aspect spine of the [Nasdanika model tower](https://nasdanika.com/models.html) runs

> [nxcore](https://nxcore.models.nasdanika.org/) < [role](https://role.models.nasdanika.org/) < **iam** < [seal](https://seal.models.nasdanika.org/) < [lifecycle](https://lifecycle.models.nasdanika.org/) < [accounting](https://accounting.models.nasdanika.org/) < [decision analysis](https://analysis.decision.models.nasdanika.org/) < [decision binding](https://binding.decision.models.nasdanika.org) < [governance](https://governance.models.nasdanika.org/) < [work](https://work.models.nasdanika.org/) < [requirements](https://requirements.models.nasdanika.org/) < [architecture](https://architecture.models.nasdanika.org/) < [threat](https://threat.models.nasdanika.org/)

and the enterprise branch continues off the top of it into [capability](https://capability.models.nasdanika.org/), [product management](https://product-management.models.nasdanika.org/), and [org design](https://org-design.models.nasdanika.org/).

This is the third floor, and it inherits very little: `Realm` extends nxcore's `NamedPeriod`, everything else extends `ModelElement` and `Period`, the selectors and conditions are nxcore `Evaluator`s, and `Content` and `Section` extend the [role model](https://role.models.nasdanika.org/)'s.
That is the whole dependency.
Everything above it - a sealed value, a lifecycle sojourn, a ledger entry, an expert judgment, a control, a work item, an architecture element, an asset, an agent - arrives already protectable.

The placement follows the tower's rule that a model sits at the lowest position consistent with its own dependencies, and two of the three neighboring arrows are worth spelling out, because that kind of decision is what keeps a stack of models a stack.

**Above role, and only because of `EngagedSubject`.** There are two meanings of "role" in circulation and this tower keeps them apart rather than merging them.
A role-model `Role` is an *engagement* with a specific element - being the reviewer of this document, the custodian of this dataset - which may imply no system permission at all.
An IAM `Role` is an assignable bundle of permissions in the RBAC sense.
They meet at exactly one type: `EngagedSubject`, a subject constituted by holding a named engagement on the protected element.
Engagement data lives one floor down, grants derived from it live here, and the arrow points up only.
That single seam is the whole reason the two are separate floors rather than one confused one.

**Below seal, because cryptography enforces a policy rather than being one.** Seal's `SealedElement` extends `AccessControlled`.
Encryption answers *how* a restriction is made unbreakable; it cannot answer *what* the restriction is or *for whom*, and that has to exist first.
So `Group` becomes the unit of key distribution, `Signature.features` mirrors `AccessControlEntry.features`, and the crypto floor adds material rather than semantics.

**Independent of lifecycle, deliberately, to avoid a cycle.** Two couplings are conceivable and they point in opposite directions.
Stage-scoped access ("visible only when published") would make IAM depend on lifecycle; transition guards ("who may approve this move") make lifecycle depend on IAM.
Taking both creates a cycle, and a cycle in the tower is not a modeling inconvenience, it is the end of independent versioning.
The resolution: stage-scoped access is an ABAC condition, already expressible in `condition` as an evaluator over the element with no metamodel dependency, so the arrow runs one way - lifecycle imports IAM, and `Sojourn.by` is a `Subject`.
Most "staged access control" turns out to be conditions; what genuinely needs typing is the guard, and the guard lives upstairs.

Being this low imposes the same discipline the role floor accepts: whatever this floor costs, every floor above pays.
Hence `AccessControlled` is an interface with a single containment feature that is empty by default.
An element with no entries is simply unprotected, and the aspect costs nothing until the first restriction is authored.

## Design-time authorization

Nearly everything in the landscape below is *run-time* authorization: a policy decision point evaluates a request against a policy while a user waits.
The center of gravity here is different, and it is the point of the model.

Authorization is part of the artifact.
It is authored in the same file as the thing it protects, reviewed in the same pull request, versioned in the same commits, and - critically - evaluatable *during generation*, before anything is served.
A confidential capability on a public site is not hidden behind a check that a misconfigured route might skip; it is **absent from the generated artifact**.
That is a categorically stronger property than a run-time deny, and it is available only because the policy and the protected element are in the same model.

The run-time story exists and is ordinary: flatten the model into Shiro wildcard permissions, Cedar, or Rego and let a proven engine enforce it.
But the differentiator is the decision that can be made before publication, and everything the [seal](https://seal.models.nasdanika.org/) floor does - one artifact, many audiences, unsealing per key - is that idea taken one step further.

## Competitive landscape

Five camps, of which four are complements routinely misread as competitors, and one is a spreadsheet.

**Cloud IAM.** AWS IAM, Azure RBAC and Entra, GCP IAM.
The closest semantic prior art and an acknowledged influence: allow/deny statements, principals, actions, resource selectors, condition keys, and explicit-deny-wins are borrowed on purpose, because a combining algorithm engineers already reason about correctly is worth more than a novel one.
The limit is jurisdictional.
Each governs its own provider's resources, in its own JSON dialect, with its own action taxonomy, and nothing outside the cloud plane is expressible.
There is no ARN for a capability, a document section, a decision record, an assessment, or an agent's tool - which is precisely the population that needs protecting in a modeled estate.

**Policy engines and policy-as-code.** OPA/Rego, Cedar and Verified Permissions, XACML, Casbin, and the Zanzibar lineage - OpenFGA, SpiceDB, Permify.
These are the state of the art in evaluation and this model does not compete with them; it is the data they should be evaluating over.
Every one of them needs an entity store: Cedar wants entities, Rego wants `data`, Zanzibar wants relationship tuples - and in practice that store is a second, hand-synchronized copy of the domain, kept fresh by a pipeline nobody owns.
Drift between the authorization graph and the real one is the standard failure mode of the whole camp.
Here the protected element *is* the domain element, so there is no copy to sync, and `EngagedSubject` derives the relationship tuples from ownership data that already exists rather than requiring them to be pushed in.
Compilation to any of these targets is the intended relationship.

**Identity governance and directories.** Okta, Entra ID, SailPoint, Saviynt, Keycloak, LDAP and AD.
Authoritative for principals, groups, and joiner-mover-leaver, and this model is a consumer of them rather than a rival: a `Realm` is loaded from a directory export.
What they cannot do is say what an entitlement *means*.
An IGA platform sees `APP_FIN_RPT_RW`, an opaque string whose semantics live inside one application, so certification campaigns ask reviewers to approve strings and the honest answer to "what does this grant let them see?" requires opening the application.
Here a grant names a modeled action on a modeled element, and the question has an answer that can be rendered.

**Permissions embedded in applications.** Spring Security and Django annotations, Rails CanCan, CMS role editors, SharePoint and Confluence space permissions, GitHub repository roles, dashboard sharing settings.
Each is right about its own objects and mute about everything else.
Authorization ends up scattered across annotations, admin screens, and YAML in every system, with no cross-system query and no artifact anyone can review as a whole.
These are good sources to *load* and poor places to keep the record.

**The real competitor, as always: the access matrix in a spreadsheet.** Exported quarterly, signed by a manager, filed for the auditor.
Cheaper than any model for producing one answer once.
The wedge is everything after the first answer - "who could see this document in March", "which grants exist because of an engagement that has since ended", "what does this agent's credential actually reach" - none of which a matrix can answer, because it was a snapshot of a system that had already moved on by the time it was exported.

The position this model takes is the diagonal none of the five occupy: **authorization as typed data attached to the protected element, in the same artifact and the same version control as the thing it protects, decidable before publication, and uniform across every model in the tower at once.**

## What a typed model adds

**Actions are instance data, not an enumeration.** This is the move the tower makes repeatedly - [lifecycle](https://lifecycle.models.nasdanika.org/) with stages, [work](https://work.models.nasdanika.org/) with `WorkType`, [role](https://role.models.nasdanika.org/) with roles: what would be an enum becomes data.
`Action` is a documented, dated model element, and hierarchical, so `administer` implying `edit` implying `view` is authored rather than hardcoded, and a realm that needs `publish`, `attest`, `unseal`, or `invoke` adds them as a data change instead of waiting for a metamodel release.
Two organizations with incompatible action taxonomies assemble into one model without either surrendering theirs.

**RBAC, ABAC, and ReBAC are subclasses, not products.** The industry sells them as competing paradigms and organizations end up running two or three systems.
Here they are five siblings under one `Subject` reference: `Principal` (an identity), `Group` (a set, nestable), `Role` (a permission bundle), `SubjectSelector` (an expression - all principals whose department is Risk), and `EngagedSubject` (a relationship - whoever is engaged as reviewer, optionally inherited from ancestors so the owner of a catalog is engaged with its entries).
A single entry may name all five at once, because `subjects` is one list.
And because `Role extends Subject`, role hierarchies, roles holding roles, and roles carrying their own permissions come for free rather than as a special mechanism.

**Every grant is dated, structurally.** `Subject` and both statement types extend nxcore's `Period`, and nxcore's `Temporal` supports relative and bounded time.
A contractor's access running from onboarding to the end of the engagement, a break-glass grant valid for four hours, an agent's authority scoped to one run - these become properties of the grant rather than jobs that must remember to revoke it.
The failure mode this removes is the industry's most common one: the access that outlives its reason.
And "who had access on the 14th of March" is a query, because grants accumulate rather than being overwritten.

**Two directions of statement, because both authoring styles exist.** `AccessControlEntry` is resource-side, contained in the protected element ("on this capability, the pro tier may view") - the ACL/XACML shape.
`Permission` is subject-side, contained in a subject and typically in a `Role` ("editors may write `capability/**`") - the Shiro/AWS policy shape.
Real organizations author both, and forcing one into the other is where authorization models usually acquire their first workaround.
Effective access folds both: entries from the element and its `AccessControlled` ancestors nearest-first, plus the subject's own and role-carried permissions, explicit `DENY` over `ALLOW`, no match denies.

**Carve-outs are first class.** `except` subtracts subjects from an entry - a group minus three principals - which most systems cannot express without inventing a shadow group that then has to be maintained, and which is exactly the construct segregation of duties needs.

**Selectors and conditions are evaluators, not strings.** `subjectEvaluator`, `actionEvaluator`, `targetEvaluator`, `resources`, and `condition` contain nxcore `Evaluator`s - SpEL, Groovy, or any JSR-223 language - so a subject set or an action set may be computed rather than enumerated, and an evaluator is itself a documented, marked model element.
A rule can therefore explain itself and carry provenance, which a policy string cannot.

**Granularity below the element.** `features` and `operations` scope a statement to named attributes, references, and operations, so "the salary attribute of an employee record" and "the invoke operation of this tool" need no second mechanism.
This is the granularity the seal floor consumes directly: `EncryptedFeature.feature` and `Signature.features` line up with `AccessControlEntry.features`, so what is restricted, what is sealed, and what is signed share one coordinate system.

**Realms nest and are themselves protected.** `Realm extends AccessControlled`, so who may administer a realm - add subjects, define actions, create child realms - is ordinary instance data.
Delegated administration, the feature every IAM product bolts on late as a special case, is here the base mechanism applied to itself.

**Provenance answers "why".** Every element carries nxcore markers, and git markers add file, line, branch, and commit.
"Why does this principal have access to this?" resolves to a permalink to the line and the commit that asserted it, with the author and the review attached - an audit property no IAM console offers, because in a console the best available answer is a change-log entry.

**Federation without a registry.** Realms, principals, and groups may be authored inline where they are used or published as shared Maven artifacts, and nxcore's `uris` merge anchors converge them: several teams may independently name `myorg://principals/jane-doe`, and at assembly time those are one logical subject.
Author locally without asking anyone's permission, federate when federation is worth it - the opposite order from the central identity registry a program has to finish before anyone benefits, which is why those programs stall.

## Applications

### Identity-scoped generation

The flagship, and the application that makes design-time authorization concrete.
Documentation sites and other derived artifacts are generated *for a subject*: resolve effective `view` access for the target principal, filter the model, then generate.
The same capability or architecture model produces a complete internal site locally (generated for an authenticated principal), a partner site with commercial detail removed, and a public site on GitHub Pages generated for an anonymous subject - in which the private elements are not hidden but **absent**.
Publishing destinations become principals, and "could this have leaked?" is answered by the artifact rather than by a configuration review.

### Sealed delivery: one artifact, many audiences

Where generating several artifacts is the wrong shape - a model shipped to subscribers, a ledger in ordinary cloud storage, a document distributed to a board - the [seal](https://seal.models.nasdanika.org/) floor keeps one artifact and seals what each audience may not see.
`Group`s map to keys, so group membership *is* the key distribution graph and a subscription tier is a group.
Feature-level bundling even hides cardinality: without the key the feature reifies as an empty list rather than as a visible count of things you cannot read.
IAM supplies who-sees-what; the floor above supplies the cryptography.

### Enforcement behind a server

Where users have no direct access to models in version control, a server consults the model at request time.
The mapping to [Apache Shiro](https://shiro.apache.org/) is direct - a model `Realm` backs a Shiro realm, and the `Action` hierarchy plus resource selectors flatten to wildcard permission strings - and the same flattening targets Cedar and Rego.
Shiro then handles what this model deliberately does not: authentication and sessions.

### Access derived from engagement

`EngagedSubject` turns an engagement recorded on the [role](https://role.models.nasdanika.org/) floor into a grant.
"The reviewer of this document may see the draft" needs no group to be provisioned, no membership to be maintained, and no reconciliation job between the group and the fact it was meant to represent - and with `inherited`, ownership of a catalog extends to its entries without restating anything.
This is the Zanzibar idea with the relationship left where it was already true.

### Approval gates and segregation of duties

Compose with [lifecycle](https://lifecycle.models.nasdanika.org/), [seal](https://seal.models.nasdanika.org/), and [governance](https://governance.models.nasdanika.org/).
An approval gate is a transition guard demanding a `Sojourn` signed by a subject engaged as approver on the date of signing; segregation of duties is `except` plus a condition stating that the acting subject is not the one engaged as author.
Both are answerable retrospectively, because sojourns and grants accumulate instead of being rewritten: the state of entitlement on the date in question is still in the model.
For [governance](https://governance.models.nasdanika.org/) an access control entry is a preventive control by nature and a realm export is evidence, so the crosswalk from an SoD requirement to the data implementing it is instance-level rather than a new mechanism.

### Agents, tools, and blast radius

An agent is a `Principal` and its authority is a dated grant.
[MCP](https://mcp.models.nasdanika.org/) servers, tools, and catalogs, and [agent model](https://agent.models.nasdanika.org/) elements, are `AccessControlled`, with `operations` scoping a grant to individual tool invocations.
The consequence is that an agent's blast radius - what it can read, what it can call, on whose authority, and until when - is a query over the model rather than an inference from configuration spread across a gateway, a token, and a prompt.
Time-bounded grants matter more here than anywhere: an agent run is exactly the kind of authority that should expire structurally.
The [AI governance model](https://ai.governance.models.nasdanika.org/) writes its controls against this plus the human engagement recorded one floor down, which is what keeps accountability from evaporating into the tooling.

### Per-role visibility in shared ledgers

With [accounting](https://accounting.models.nasdanika.org/) two floors up, a household or association ledger becomes multi-audience without becoming several ledgers.
The executor sees the continuity view, the power of attorney sees another, an authorized user sees the accounts they transact on and not the estate around them - and because statements scope to `features`, a balance can be visible where the correspondent entry behind it is not.
Combined with seal, the same ledger is safe in ordinary cloud storage, and correspondent entries exchanged between parties are signed rather than merely asserted.

### Analyzing the IAM you already have

The model is also an analysis substrate for existing estates.
Import AWS policies, Azure role assignments, directory groups, and repository permissions into one typed realm graph, and the cross-system questions become ordinary queries: who can reach this data across accounts and tools, which grants no one has exercised, which principals hold access whose engagement basis has lapsed, and where intent diverges from what is deployed.
The most valuable page of that report is the counterpart of the one the role floor produces: not the audit, but the query nobody asked for.

## Authoring and loading

Authorization data is born in systems that already exist, and those are sources rather than export targets:

* **YAML and the Groovy DSL** for hand-authored realms and policies, with git markers giving every statement a permalink back to the line and commit that asserted it.
* **Directory and IdP exports** - LDAP, Entra ID, Okta - loaded as `Realm`s, so principals and groups are imported rather than retyped.
* **Cloud policy documents** - AWS IAM JSON, Azure role assignments - as an initial corpus and as the input to effective-access analysis.
* **Excel** for access matrices and review workbooks: one row per subject-action-resource claim, which is the shape a statement already has.
* **Draw.io** for realm topology, trust boundaries, and delegation drawn in a workshop, via the [drawio model](https://drawio.models.nasdanika.org/).
* **Engagement data from the [role model](https://role.models.nasdanika.org/)**, which needs no import at all - `EngagedSubject` reads it in place.

The console is where access is granted; the model is where it accumulates and can be reasoned about.

## Model overview

| Area | Types |
|---|---|
| Extension point | `AccessControlled` (anything needing protection; contains `accessControl`) |
| Actions | `Action` (hierarchical, dated, instance data), `Effect` (`ALLOW` / `DENY`) |
| Subjects | `Subject` (dated; holds `roles` and `permissions`), `Principal` (`aliases`), `Group` (nestable `members`), `Role` (RBAC bundle), `SubjectSelector` (ABAC), `EngagedSubject` (ReBAC, `inherited`) |
| Realms | `Realm` (nested; contains subjects and actions; itself access controlled) |
| Statements | `AccessControlEntry` (resource-side: `subjects`, `except`, `actions`, `features`, `operations`, evaluators for subjects, actions, target, and condition), `Permission` (subject-side: `actions`, `resources` selector, `features`, `operations`, `condition`) |
| Documentation specializations | `Content`, `Section` (role's documentation types made access controlled) |
| Reused, not redefined | nxcore `ModelElement`, `NamedPeriod`, `Period`, `Temporal`, `Evaluator`, `Marker`, and `uris` merge anchors; role `Content` and `Section` |

`Content` and `Section` are worth a note.
The [role model](https://role.models.nasdanika.org/) specializes nxcore's documentation types to record who authored and reviewed a section; this floor specializes those in turn, so the same section is audience-scoped.
A page is rarely uniform: one section is public, one is for customers under NDA, one carries the internal rationale - and because a documented element's `docSections` are a tree, the restriction attaches at whatever granularity the content actually has.
Authorship and audience end up as one object rather than two parallel annotations bolted onto a CMS.

## What sits on top

[Seal](https://seal.models.nasdanika.org/) sits directly above: `SealedElement extends AccessControlled`, `Key.subject` is a `Subject`, and `Variant.subjects` selects which value a reader resolves - encryption turned inside out, over the visibility this floor defines.

Above that, protection arrives by inheritance rather than by declaration.
[Lifecycle](https://lifecycle.models.nasdanika.org/) attributes every `Sojourn` to a `Subject` and guards transitions against it.
[Accounting](https://accounting.models.nasdanika.org/) gets per-role ledger visibility and the segregation of duties that keeps an importer from reconciling their own import.
[Decision analysis](https://analysis.decision.models.nasdanika.org/) makes participants and experts `Subject`s, so a Delphi panel's anonymity is a modeled property, and [decision binding](https://binding.decision.models.nasdanika.org) records who bound a decision.
[Governance](https://governance.models.nasdanika.org/) reads access control entries as preventive controls and realm exports as evidence.
[Work](https://work.models.nasdanika.org/), [requirements](https://requirements.models.nasdanika.org/), [architecture](https://architecture.models.nasdanika.org/), and [threat](https://threat.models.nasdanika.org/) inherit the aspect without declaring anything - and on the threat floor the identity graph is itself part of the attack surface being modeled, which is the one place where a protection model becomes an analysis target rather than a mechanism.
[Capability](https://capability.models.nasdanika.org/), [product management](https://product-management.models.nasdanika.org/), and [org design](https://org-design.models.nasdanika.org/) get audience-scoped providers, personas, and units, which is what lets one capability model serve an internal site and a public one.

## Resources

* [Sources on GitHub](https://github.com/Nasdanika-Models/iam)
* [Nasdanika model tower](https://nasdanika.com/models.html)
* [Role model](https://role.models.nasdanika.org/) - the floor directly below, where engagement is recorded before it becomes a grant
* [Seal model](https://seal.models.nasdanika.org/) - the floor directly above, where visibility becomes cryptography
* [NxCore model](https://nxcore.models.nasdanika.org/) - identity, documentation, provenance, time, and evaluators
* [Lifecycle model](https://lifecycle.models.nasdanika.org/) - stage-scoped access as a condition, and transition guards as the one-way dependency
* [Architecture model](https://architecture.models.nasdanika.org/) - the tower ordering and the rules that govern it
