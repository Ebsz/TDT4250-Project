package tdt4250.project.loader.data.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamData {
	private String name;
	private List<PlayerData> ownedPlayer; 
	private String abbreviation;
	private String stadium;
	
	public String getName() {
		return name;
	}

	public List<PlayerData> getOwnedPlayer() {
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
