package tdt4250.project.loader.data.json;

import java.util.List;

public class SeasonData {
	private String name;
	private List<MatchweekData> matchweeks;
	private StandingData standing;
	
	public String getName() {
		return name;
	}
	public List<MatchweekData> getMatchweeks() {
		return matchweeks;
	}
	public StandingData getStanding() {
		return standing;
	}
}
