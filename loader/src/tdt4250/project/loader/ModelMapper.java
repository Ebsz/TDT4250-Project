package tdt4250.project.loader;

import java.util.ArrayList;
import java.util.List;

import TDT4250.Project.league.League;
import TDT4250.Project.league.LeagueFactory;
import TDT4250.Project.league.LeaguePackage;
import TDT4250.Project.league.Season;
import TDT4250.Project.league.Standing;
import TDT4250.Project.league.Team;
import tdt4250.project.loader.data.CompetitionData;
import tdt4250.project.loader.jsondata.StandingJson;
import tdt4250.project.loader.jsondata.TeamJson;

/**
 * Maps data from the API to model instances that can be exported as .xmi
 */
public class ModelMapper {

	private CompetitionData competitionData;
	private League league;

	public ModelMapper(CompetitionData data) {
		league = getLeagueFactory().createLeague();
		competitionData = data;
	}

	public League mapLeague() {
		league.setName(competitionData.competitionJson.name);

		league.getTeams().addAll(mapTeams());
		league.getSeason().add(mapCurrentSeason());

		return league;
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

	private Season mapCurrentSeason() {
		Season season = getLeagueFactory().createSeason();
		String startDate = competitionData.competitionJson.currentSeason.startDate;

		// API date is YYYY-MM-DD, but we define seasons by starting year, so strip the rest
		String seasonStartingYear =  startDate.substring(0, 4);
		season.setName(seasonStartingYear);

		season.getStanding().addAll(mapStandings());

		return season;
	}


	private List<Standing> mapStandings() {
		List<Standing> standings = new ArrayList<>();

		for (StandingJson s :  competitionData.standingsJson.standings) {
			Standing standing = getLeagueFactory().createStanding();
			standing.setPosition(s.position);
			standing.setGamesPlayed(s.playedGames);

			standing.setWins(s.won);
			standing.setDraws(s.draw);
			standing.setLoose(s.lost);
			standing.setPoints(s.points);
			standing.setGoalsFor(s.goalsFor);
			standing.setGoalsAgainst(s.goalsAgainst);
			standing.setGoalDifference(s.goalsDifference);

			Team team = getTeam(s.team.name);



			standing.setTeam(team);

			standings.add(standing);
		}

		return standings;
	}

	/**
	 * Get a team by name.
	 *
	 * This method has to be used after League has been populated using mapTeams()
	 *
	 * @param teamName
	 * @return team, or null.
	 */
	private Team getTeam(String teamName) {
		return league.getTeams().stream().filter(t -> t.getName().equals(teamName)).findFirst().get();
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
