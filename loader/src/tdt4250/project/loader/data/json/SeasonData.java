package tdt4250.project.loader.data.json;

import java.util.List;

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
}
