package tdt4250.project.loader.data;

import com.fasterxml.jackson.core.JsonProcessingException;

import tdt4250.project.loader.jsondata.CompetitionJson;
import tdt4250.project.loader.jsondata.SeasonJson;

/**
 * Loads Competition data from the API
 */
public class CompetitionData {


	// TODO: make private, add getters
	public CompetitionJson competitionJson;

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
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
