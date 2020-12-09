package tdt4250.project.loader.data;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import tdt4250.project.loader.data.json.CompetitionJson;
import tdt4250.project.loader.data.json.MatchJson;
import tdt4250.project.loader.data.json.MatchesJson;
import tdt4250.project.loader.data.json.PlayerJson;
import tdt4250.project.loader.data.json.StandingJson;
import tdt4250.project.loader.data.json.StandingsJson;
import tdt4250.project.loader.data.json.TeamJson;
import tdt4250.project.loader.data.json.TeamsJson;

/**
 * Loads Competition data from the API
 */
public class CompetitionData {

	public CompetitionJson competitionJson;
	public TeamsJson teamsJson;
	public StandingsJson standingsJson;
	public MatchesJson matchesJson;

	private int competitionID;

	public CompetitionData(int competitionID) {
		this.competitionID = competitionID;
	}

	/**
	 * Loads the data necessary for building a League
	 */
	public void load()  {
		String competition = ApiFetcher.getCompetition(competitionID);
		try {
			competitionJson = Parser.parseObject(competition, CompetitionJson.class);
			standingsJson = Parser.parseObject(ApiFetcher.getStandings(competitionID), StandingsJson.class);
			teamsJson = Parser.parseObject(ApiFetcher.getCompetitionTeams(competitionID), TeamsJson.class);
			standingsJson = Parser.parseObject(ApiFetcher.getStandings(competitionID), StandingsJson.class);
			matchesJson = Parser.parseObject(ApiFetcher.getMatches(competitionID), MatchesJson.class);

			loadTeams();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	private void loadTeams() throws JsonProcessingException {
		teamsJson = Parser.parseObject(ApiFetcher.getCompetitionTeams(competitionID), TeamsJson.class);

		// Load players for each team - they require an API call per team, so they have to be added manually
		for (TeamJson team : teamsJson.teams) {
			team.players = loadTeamPlayers(team.id);
		}
	}

	/**
	 * Loads data about a team's players
	 *
	 * The data is cached because requests are throttled by the API
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
