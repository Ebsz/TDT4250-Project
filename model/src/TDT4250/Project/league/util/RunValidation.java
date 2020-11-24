package TDT4250.Project.league.util;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import TDT4250.Project.league.League;
import TDT4250.Project.league.LeaguePackage;

public class RunValidation {
	
	public static void main(String[] args) {
		ResourceSet resSet = new ResourceSetImpl();
		// relate the RaPackage identifier used in XMI files to the LeaguePackage instance (EPackage meta-object) 
		resSet.getPackageRegistry().put(LeaguePackage.eNS_URI, LeaguePackage.eINSTANCE);
		// relate the XMI parser to the 'xmi' file extension
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		Resource resource = resSet.getResource(URI.createURI(RunValidation.class.getResource("RunValidation.xmi").toString()), true);
		League league = (League) resource.getContents().get(0);
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(league);
		System.out.println(diagnostics.getSeverity());
		
	}
}
