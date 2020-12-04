package tdt4250.project.loader.jsondata;

import java.util.List;

import tdt4250.project.loader.data.json.SeasonData;


/**
 * Maps to the /competition end-point on the API
 */
public class CompetitionJson {
	public String name;
	public List<SeasonData> seasons;
}
