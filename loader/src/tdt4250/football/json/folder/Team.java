package tdt4250.football.json.folder;

import java.util.List;

public class Team {
	private String name;
	private List<Player> ownedPlayer; 
	private String abbreviation;
	private String stadium;
	
	public String getName() {
		return name;
	}
	public List<Player> getOwnedPlayer() {
		return ownedPlayer;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public String getStadium() {
		return stadium;
	}
}
