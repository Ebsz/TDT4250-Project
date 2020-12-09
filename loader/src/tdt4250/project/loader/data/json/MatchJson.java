package tdt4250.project.loader.data.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchJson {
	
	public TeamJson homeTeam;
	public TeamJson awayTeam;
	
	public String booking;
	
	public Date utcDate;
	
	public List<Referee> referees;
	
	public static class Referee{
		
		public String name; 
	}
		
	public Score score;
		
	public int matchday;
	
	public String status;
	
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
