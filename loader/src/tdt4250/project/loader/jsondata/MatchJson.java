package tdt4250.project.loader.jsondata;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchJson {
	
	public TeamJson homeTeam;
	public TeamJson awayTeam;
	public List<BookingJson> bookings;
	
	//get UTCdate 
	public String UTCdate;
	
	//goals needs to be extracted from the field 'score: {fulltime: {homegoals/awaygoals}}'
	
	//There are four referees each match, using the first listed referee should suffice
	public String referee;
		
	public Score score;
		
	public int matchday;
	
	public static class Score {
		
		public String homeTeam;
		public String awayTeam;
		public String duration;
		
		@JsonProperty("fullTime")
		public void unpackScore(Map<String, String> fullTime ) {
			
			homeTeam = fullTime.get("homeTeam");
			awayTeam = fullTime.get("awayTeam");

		
		}
	}

	
}
