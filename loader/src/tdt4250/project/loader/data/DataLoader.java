package tdt4250.project.loader.data;

import java.util.List;

import tdt4250.project.loader.data.json.TeamData;
import tdt4250.project.loader.data.json.LeagueData;


/**
 * Class for loading data objects
 *
 * Fetches Json data from the API, and parses them to data objects
 */
public class DataLoader {

	public static LeagueData getLeagueData(String leagueName) {
		int leagueID = ApiFetcher.getCompetitionIdByName(leagueName);

		if (leagueID == 0) {
			// TODO: Properly handle errors here
			System.out.println("ERROR: could not find league '" +  leagueName + "'");
		}

		return getLeagueData(leagueID, leagueName);
	}

	private static LeagueData getLeagueData(int leagueID, String leagueName) {
		LeagueData league = new LeagueData();

		league.name = leagueName;
		league.teams = getLeagueTeams(leagueID);

		return league;
	}

	private static List<TeamData> getLeagueTeams(int leagueID) {
		String teamsJson = ApiFetcher.getCompetitionTeams(leagueID);
		List<TeamData> teamData = Parser.parseTeams(teamsJson);

		return teamData;
	}
}