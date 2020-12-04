package tdt4250.project.loader;

import java.util.ArrayList;
import java.util.List;

import TDT4250.Project.league.League;
import TDT4250.Project.league.LeagueFactory;
import TDT4250.Project.league.LeaguePackage;
import TDT4250.Project.league.Season;
import TDT4250.Project.league.Team;
import tdt4250.project.loader.data.CompetitionData;
import tdt4250.project.loader.jsondata.TeamJson;

/**
 * Maps data from the API to model instances that can be exported as .xmi
 */
public class ModelMapper {

	private CompetitionData competitionData;

	public ModelMapper(CompetitionData data) {
		competitionData = data;
	}

	public League mapLeague() {
		League league = getLeagueFactory().createLeague();
		league.setName(competitionData.competitionJson.name);

		league.getSeason().add(mapCurrentSeason());
		league.getTeams().addAll(mapTeams());

		return league;
	}

	private Season mapCurrentSeason() {
		Season season = getLeagueFactory().createSeason();
		String startDate = competitionData.competitionJson.currentSeason.startDate;

		// API date is YYYY-MM-DD, but we define seasons by starting year, so strip the rest
		String seasonStartingYear =  startDate.substring(0, 4);
		season.setName(seasonStartingYear);

		return season;
	}

	private List<Team> mapTeams() {
		List<Team> teams = new ArrayList<>();

		for (TeamJson t : competitionData.teamsJson.teams) {
			Team team = getLeagueFactory().createTeam();

			team.setName(t.name);
			team.setAbbr(t.tla);
			team.setStadium(t.venue);

			teams.add(team);
		}

		return teams;
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
