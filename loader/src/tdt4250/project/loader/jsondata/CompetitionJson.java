package tdt4250.project.loader.jsondata;

import java.util.List;


/**
 * Class representation of Competition season data
 *
 * Maps to the /competition end-point on the API
 */
public class CompetitionJson {
	public String name;
	public SeasonJson currentSeason;
	public List<SeasonJson> seasons;
}
