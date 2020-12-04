package tdt4250.project.loader.data;

import com.fasterxml.jackson.core.JsonProcessingException;

import tdt4250.project.loader.data.json.SeasonData;
import tdt4250.project.loader.jsondata.CompetitionJson;

/**
 * Loads Competition data from the API
 */
public class CompetitionData {

	private CompetitionJson competitionJson;

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

			System.out.println(competitionJson.name);

			for (SeasonData s : competitionJson.seasons) {
				System.out.println(s.name);
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
