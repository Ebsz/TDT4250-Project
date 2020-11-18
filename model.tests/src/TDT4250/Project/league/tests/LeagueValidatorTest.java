package TDT4250.Project.league.tests;

import org.eclipse.acceleo.query.delegates.AQLValidationDelegate;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import junit.framework.TestCase;
import TDT4250.Project.league.*;


public class LeagueValidatorTest extends TestCase {
	
	private Resource testInstance;
	private Diagnostic diagnostics;
	
	protected Resource loadResource(String name) {
		ResourceSet resSet = new ResourceSetImpl();
		// relate the RaPackage identifier used in XMI files to the RaPackage instance (EPackage meta-object) 
		resSet.getPackageRegistry().put(LeaguePackage.eNS_URI, LeaguePackage.eINSTANCE);
		// relate the XMI parser to the 'xmi' file extension
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		return resSet.getResource(URI.createURI(LeagueValidatorTest.class.getResource(name + ".xmi").toString()), true);
	}

	protected void setUp() throws Exception {
		// register AQL (an OCL implementation) constraint support
		ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/acceleo/query/1.0", new AQLValidationDelegate());

		testInstance = loadResource("LeagueValidatorTest");
		diagnostics = Diagnostician.INSTANCE.validate(testInstance.getContents().get(0));
	}
	
	private Diagnostic findDiagnostics(Diagnostic diagnostic, Object o, String constraint) {
		if (diagnostic.getMessage().contains(constraint) && (o == null || diagnostic.getData().contains(o))) {
			return diagnostic;
		}
		for (Diagnostic child : diagnostic.getChildren()) {
			Diagnostic found = findDiagnostics(child, o, constraint);
			if (found != null) {
				return found;
			}
		}
		return null;
	}
	
	public void testCorrectNumberOfCards_valid() {
		League Testliga = (League) testInstance.getContents().get(0);
		Season season = (Season) Testliga.getSeason().get(0);
		Matchweek matchweek = (Matchweek) season.getMatchweeks().get(0);
		Match match = (Match) matchweek.getMatches().get(0);
		
		assertNull(findDiagnostics(diagnostics, match, "correctNumberOfCards"));
	}
	
	public void testCorrectNumberOfCards_invalid() {
		League Testliga = (League) testInstance.getContents().get(0);
		Season season = (Season) Testliga.getSeason().get(0);
		Matchweek matchweek = (Matchweek) season.getMatchweeks().get(0);
		Match match = (Match) matchweek.getMatches().get(1);	

		assertNotNull(findDiagnostics(diagnostics, match, "correctNumberOfCards"));
	}
	
	public void testTeamsPlaysOnlyOneMatchPerWeek_valid( ) {
		League Testliga = (League) testInstance.getContents().get(0);
		Season season = (Season) Testliga.getSeason().get(0);
		Matchweek matchweek = (Matchweek) season.getMatchweeks().get(1);
		
		assertNull(findDiagnostics(diagnostics, matchweek, "teamsPlaysOnlyOneMatchPerWeek"));
	}

	public void testTeamsPlaysOnlyOneMatchPerWeek_invalid( ) {
		League Testliga = (League) testInstance.getContents().get(0);
		Season season = (Season) Testliga.getSeason().get(0);
		Matchweek matchweek = (Matchweek) season.getMatchweeks().get(0);
		
		assertNotNull(findDiagnostics(diagnostics, matchweek, "teamsPlaysOnlyOneMatchPerWeek"));
	}
	
	public void testAllTeamsMeetsHomeAndAway_valid( ) {
		League Testliga = (League) testInstance.getContents().get(0);
		
		assertNotNull(findDiagnostics(diagnostics, Testliga, "allTeamsMeetsHomeAndAway"));	
	}
	
	public void testCorrectNumberOfMatchesPerSeason_valid( ) {
		League Testliga = (League) testInstance.getContents().get(0);
		Season season = (Season) Testliga.getSeason().get(1);
		
		assertNull(findDiagnostics(diagnostics, season, "correctNumberOfMatchesPerSeason"));
	}

	public void testCorrectNumberOfMatchesPerSeason_invalid( ) {
		League Testliga = (League) testInstance.getContents().get(0);
		Season season = (Season) Testliga.getSeason().get(0);
		
		assertNotNull(findDiagnostics(diagnostics, season, "correctNumberOfMatchesPerSeason"));
	}
	
}
