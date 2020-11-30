package tdt4250.football.json.folder;

import java.util.List;

public class League {
	private Season season; 
	private List<Team> teams;
	private String name;
	
	public Season getSeason() {
		return season;
	}
	public List<Team> getTeams() {
		return teams;
	}
	public String getName() {
		return name;
	} 
}
