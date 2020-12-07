package tdt4250.project.loader.jsondata;

import java.util.Date;
import java.util.List;

public class MatchJson {
	
	public TeamJson homeTeam;
	public TeamJson awayTeam;
	public List<BookingJson> bookings;
	
	//get UTCdate 
	public Date date;
	
	//goals needs to be extracted from the field 'score: {fulltime: {homegoals/awaygoals}}'
	public int homeGoals;
	public int awayGoals;
	
	//There are four referees each match, using the first listed referee should suffice
	public String referee;

	
}
