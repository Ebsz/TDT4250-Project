package tdt4250.project.loader.data.json;

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
