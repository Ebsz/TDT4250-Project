package tdt4250.project.loader.data;

import com.fasterxml.jackson.core.JsonProcessingException;

import tdt4250.project.loader.jsondata.CompetitionJson;
import tdt4250.project.loader.jsondata.MatchJson;
import tdt4250.project.loader.jsondata.MatchesJson;
import tdt4250.project.loader.jsondata.StandingJson;
import tdt4250.project.loader.jsondata.StandingsJson;
import tdt4250.project.loader.jsondata.TeamsJson;

/**
 * Loads Competition data from the API
 */
public class CompetitionData {

	// TODO: make private, add getters
	public CompetitionJson competitionJson;
	public TeamsJson teamsJson;
	public StandingsJson standingsJson;
	public MatchesJson matchesJson; 

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
			teamsJson = Parser.parseObject(ApiFetcher.getCompetitionTeams(leagueID), TeamsJson.class);
			standingsJson = Parser.parseObject(ApiFetcher.getStandings(leagueID), StandingsJson.class);
			matchesJson = Parser.parseObject(ApiFetcher.getMatches(leagueID), MatchesJson.class);
			for(MatchJson m : matchesJson.matches) {;
				System.out.println(m.utcDate);
			}

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
