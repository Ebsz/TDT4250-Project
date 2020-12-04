package tdt4250.project.loader.jsondata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StandingsJson {
	public SeasonJson season;
	public List<StandingJson> standings;

	@JsonProperty("standings")
	public void unpackStanding(List<StandingList> standings) {
		final String STANDING_TYPE = "TOTAL"; // API differentiates between TOTAL/HOME/AWAY; we only care about total

		for (StandingList sw : standings) {
			if (sw.type.equals(STANDING_TYPE)) {
				this.standings = sw.standings;
				return;
			}
		}
	}

	public static class StandingList {
		public String type;

		@JsonProperty("table")
		List<StandingJson> standings;
	}
}