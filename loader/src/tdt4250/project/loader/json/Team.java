package tdt4250.project.loader.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

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

	@JsonProperty("tla")
	public String getAbbreviation() {
		return abbreviation;
	}

	@JsonProperty("venue")
	public String getStadium() {
		return stadium;
	}
}
