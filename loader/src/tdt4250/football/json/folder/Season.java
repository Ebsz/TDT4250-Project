package tdt4250.football.json.folder;

import java.util.List;

public class Season {
	private String name;
	private List<Matchweek> matchweeks;
	private Standing standing;
	
	public String getName() {
		return name;
	}
	public List<Matchweek> getMatchweeks() {
		return matchweeks;
	}
	public Standing getStanding() {
		return standing;
	}
}
