package tdt4250.project.loader.data;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import tdt4250.project.loader.data.json.LeagueData;
import tdt4250.project.loader.data.json.SeasonData;
import tdt4250.project.loader.data.json.TeamData;
import tdt4250.project.loader.jsondata.CompetitionJson;


/**
 * Class for loading league data
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

	/**
	 * Primary entrypoint for the dataloader.
	 * Fetches data about the league and all its leaf data-nodes recursively
	 */
	private static LeagueData getLeagueData(int leagueID, String leagueName) {
		LeagueData league = new LeagueData();

		league.name = leagueName;
		league.teams = getLeagueTeams(leagueID);
		league.season = getLatestSeason(leagueID);

		return league;
	}

	private static List<TeamData> getLeagueTeams(int leagueID) {
		String teamsJson = ApiFetcher.getCompetitionTeams(leagueID);
		List<TeamData> teamData = TeamData.fromJson(teamsJson);

		return teamData;
	}

	private static SeasonData getLatestSeason(int leagueID) {
		String leagueJson = ApiFetcher.getCompetition(leagueID);
		SeasonData seasonData = SeasonData.fromJson(leagueJson);

		return seasonData;
	}
}