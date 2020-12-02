package tdt4250.project.loader;

import TDT4250.Project.league.League;
import TDT4250.Project.league.LeagueFactory;
import TDT4250.Project.league.LeaguePackage;
import tdt4250.project.loader.data.json.LeagueData;

/**
 * Maps data objects to model instance objects
 */
public class Mapper {

	public static League mapLeague(LeagueData ld) {
		LeaguePackage.eINSTANCE.eClass(); // Initialize the LeaguePackage singleton
		LeagueFactory leagueFactory = LeagueFactory.eINSTANCE;

		League league = leagueFactory.createLeague();
		league.setName(ld.getName());

		return league;
	}
}