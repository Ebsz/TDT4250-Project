package tdt4250.project.loader.data.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import tdt4250.project.loader.data.Parser;

public class TeamData {
	public String name;
	public List<PlayerData> ownedPlayer;
	public String abbreviation;
	public String stadium;

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

	public static List<TeamData> fromJson(String jsonData) {
		List<TeamData> teams = new ArrayList<>();

		try {
			JsonNode teamsNode = Parser.parse(jsonData).get("teams");
			teams = Parser.fromJsonNodeToList(teamsNode, TeamData.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return teams;
	}
}
