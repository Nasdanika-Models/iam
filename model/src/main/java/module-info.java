import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.iam.capability.IamEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.iam.capability.IamResourceFactoryCapabilityFactory;

module org.nasdanika.models.iam.Iam {
	
	exports org.nasdanika.models.iam;
	exports org.nasdanika.models.iam.impl;
	exports org.nasdanika.models.iam.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.capability;
	
	requires transitive org.nasdanika.models.role;
	
	provides CapabilityFactory with 
		IamEPackageResourceSetCapabilityFactory,
		IamResourceFactoryCapabilityFactory;
	
}