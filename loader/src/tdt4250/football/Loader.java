package tdt4250.football;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import TDT4250.Project.league.*;

public class Loader {
	
	private void createLeague(String name) {
		LeaguePackage.eINSTANCE.eClass(); // Initialize the LeaguePackage singleton
		LeagueFactory leagueFactory = LeagueFactory.eINSTANCE;

		League league = leagueFactory.createLeague();
		league.setName(name);

		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	}

	public static void main(String[] args) {
		ApiFetcher apiFetcher = new ApiFetcher();

		final String COMPETITION_NAME = "Premier League";

		int competitionId = apiFetcher.getCompetitionId(COMPETITION_NAME);

		System.out.println(competitionId);
	}
}
