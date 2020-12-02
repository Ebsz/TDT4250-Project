package tdt4250.project.loader;

import java.util.ArrayList;
import java.util.List;

import TDT4250.Project.league.League;
import TDT4250.Project.league.LeagueFactory;
import TDT4250.Project.league.LeaguePackage;
import TDT4250.Project.league.Season;
import TDT4250.Project.league.Team;
import tdt4250.project.loader.data.json.LeagueData;
import tdt4250.project.loader.data.json.SeasonData;
import tdt4250.project.loader.data.json.TeamData;

/**
 * Maps data objects to model instance objects
 */
public class Mapper {
	public static List<Team> mapTeams(List<TeamData> teamData) {
		List<Team> teams = new ArrayList<>();

		for (TeamData td: teamData) {
			Team team = getLeagueFactory().createTeam();
			team.setName(td.name);
			team.setAbbr(td.abbreviation);
			team.setStadium(td.stadium);
			teams.add(team);
		}

		return teams;
	}

	public static League mapLeague(LeagueData leagueData) {
		League league = getLeagueFactory().createLeague();
		league.setName(leagueData.name);

		league.getTeams().addAll(mapTeams(leagueData.teams));
		league.getSeason().add(mapSeason(leagueData.season));

		return league;
	}

	private static Season mapSeason(SeasonData seasonData) {
		Season season = getLeagueFactory().createSeason();

		season.setName(seasonData.name);

		return season;
	}

	private static LeagueFactory leagueFactory;
	private static LeagueFactory getLeagueFactory() {
		if (leagueFactory == null) {
			LeaguePackage.eINSTANCE.eClass(); // Initialize the LeaguePackage singleton
			leagueFactory = LeagueFactory.eINSTANCE;
		}

		return leagueFactory;
	}
}