package tdt4250.project.loader.data;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import tdt4250.project.loader.jsondata.CompetitionJson;
import tdt4250.project.loader.jsondata.PlayerJson;
import tdt4250.project.loader.jsondata.StandingsJson;
import tdt4250.project.loader.jsondata.TeamJson;
import tdt4250.project.loader.jsondata.TeamsJson;

/**
 * Loads Competition data from the API
 */
public class CompetitionData {

	// TODO: make private, add getters
	public CompetitionJson competitionJson;
	public TeamsJson teamsJson;
	public StandingsJson standingsJson;

	private int leagueID;

	public CompetitionData(int leagueID) {
		this.leagueID = leagueID;
	}

	/**
	 * Loads the data necessary for building a League
	 */
	public void load()  {
		String competition = ApiFetcher.getCompetition(leagueID);
		try {
			competitionJson = Parser.parseObject(competition, CompetitionJson.class);
			standingsJson = Parser.parseObject(ApiFetcher.getStandings(leagueID), StandingsJson.class);

			loadTeams();

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	private void loadTeams() throws JsonProcessingException {
		teamsJson = Parser.parseObject(ApiFetcher.getCompetitionTeams(leagueID), TeamsJson.class);

		// Load players for each team - they require an API call per team, so they have to be added manually
		for (TeamJson team : teamsJson.teams) {
			team.players = loadTeamPlayers(team.id);
		}
	}

	/**
	 * Loads data about a team's players
	 *
	 * The data is cached because of limitations in the API
	 *
	 * @param teamID
	 * @return list of player data
	 * @throws JsonProcessingException
	 */
	private List<PlayerJson> loadTeamPlayers(int teamID) throws JsonProcessingException {
		String teamJson;

		// Don't fetch the data if we have it cached
		if (DataCache.hasTeamData(teamID)) {
			teamJson = DataCache.getTeamData(teamID);
		} else {
			teamJson = ApiFetcher.getTeam(teamID);
			DataCache.saveTeamData(teamJson, teamID);
		}

		TeamJson teamData = Parser.parseObject(teamJson, TeamJson.class);
		return teamData.players;
	}
}