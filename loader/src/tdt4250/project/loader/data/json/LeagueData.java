package tdt4250.project.loader.data.json;

import java.util.List;

public class LeagueData {
	private SeasonData season;
	private List<TeamData> teams;
	private String name;
	
	public SeasonData getSeason() {
		return season;
	}
	public List<TeamData> getTeams() {
		return teams;
	}
	public String getName() {
		return name;
	} 
}
