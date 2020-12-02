package tdt4250.project.loader.data.json;
import java.util.Date;
import java.util.List;


public class MatchData {
	private TeamData hometeam;
	private TeamData awayteam;
	private List<BookingData> bookings;
	private Date date; 
	private int homeGoals;
	private int awayGoals;
	private String referee;
	
	public TeamData getHometeam() {
		return hometeam;
	}
	public TeamData getAwayteam() {
		return awayteam;
	}
	public List<BookingData> getBookings() {
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
