package tdt4250.project.loader.data.json;
import java.util.Date;
import java.util.List;


public class Match {
	private Team hometeam;
	private Team awayteam;
	private List<Booking> bookings;
	private Date date; 
	private int homeGoals;
	private int awayGoals;
	private String referee;
	
	public Team getHometeam() {
		return hometeam;
	}
	public Team getAwayteam() {
		return awayteam;
	}
	public List<Booking> getBookings() {
		return bookings;
	}
	public Date getDate() {
		return date;
	}
	public int getHomeGoals() {
		return homeGoals;
	}
	public int getAwayGoals() {
		return awayGoals;
	}
	public String getReferee() {
		return referee;
	}
}
