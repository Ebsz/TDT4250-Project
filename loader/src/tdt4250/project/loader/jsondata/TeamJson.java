package tdt4250.project.loader.jsondata;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamJson {
	public int id;
	public String name;
	public String venue;
	public String tla;

	@JsonProperty("squad")
	public List<PlayerJson> players;
}