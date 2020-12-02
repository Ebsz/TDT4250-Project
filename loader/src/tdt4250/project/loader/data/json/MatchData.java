package tdt4250.project.loader.data.json;
import java.util.Date;
import java.util.List;


public class MatchData {
	public TeamData hometeam;
	public TeamData awayteam;
	public List<BookingData> bookings;
	public Date date;
	public int homeGoals;
	public int awayGoals;
	public String referee;

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
