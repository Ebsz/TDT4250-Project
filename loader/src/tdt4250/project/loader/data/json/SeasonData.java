package tdt4250.project.loader.data.json;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import tdt4250.project.loader.data.Parser;

public class SeasonData {
	public String name;
	public List<MatchweekData> matchweeks;
	public StandingData standing;

	public String getName() {
		return name;
	}
	public List<MatchweekData> getMatchweeks() {
		return matchweeks;
	}
	public StandingData getStanding() {
		return standing;
	}

	public static SeasonData fromJson(String leagueJson) {
		SeasonData seasonData = new SeasonData();

		try {
			JsonNode leagueNode = Parser.parse(leagueJson);

			// TODO: toString includes quotes" in the resulting string - find a more elegant solution?
			String startDate = leagueNode.get("currentSeason").get("startDate").toString();

			// API date is YYYY-MM-DD, but we define seasons by starting year, so strip the rest
			seasonData.name = startDate.substring(1, 5);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return seasonData;
	}
}
