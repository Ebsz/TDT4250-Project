package tdt4250.project.loader;

import java.util.ArrayList;
import java.util.List;

import TDT4250.Project.league.League;
import TDT4250.Project.league.LeagueFactory;
import TDT4250.Project.league.LeaguePackage;
import TDT4250.Project.league.Match;
import TDT4250.Project.league.Season;
import TDT4250.Project.league.Team;
import tdt4250.project.loader.data.json.BookingData;
import tdt4250.project.loader.data.json.LeagueData;
import tdt4250.project.loader.data.json.MatchData;
import tdt4250.project.loader.data.json.SeasonData;
import tdt4250.project.loader.data.json.TeamData;

/**
 * Maps data objects to model instance objects
 */
public class Mapper {
	
	public static Team mapTeam(TeamData teamData) {
		Team team = getLeagueFactory().createTeam();
		
		team.setName(teamData.name);
		team.setAbbr(teamData.abbreviation);
		team.setStadium(teamData.stadium);
		
		return team;
	}
	
	public static List<Team> mapTeams(List<TeamData> teamData) {
		List<Team> teams = new ArrayList<>();

		for (TeamData td: teamData) {
			Team team = mapTeam(td);
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
	
	public static Match mapMatch(MatchData matchData) {
		Match match = getLeagueFactory().createMatch();
		match.setHometeam(mapTeam(matchData.getHometeam()));
		match.setAwayteam(mapTeam(matchData.getAwayteam()));
		
		for (BookingData bd : matchData.getBookings()) {
			System.out.println("skrt");
		}
		match.setHomegoals(matchData.homeGoals);
		match.setAvaygoals(matchData.awayGoals);
		match.setReferee(matchData.referee);
		
		return match;
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