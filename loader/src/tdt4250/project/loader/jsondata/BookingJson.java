package tdt4250.project.loader.jsondata;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import TDT4250.Project.league.Player;

public class BookingJson {
	
	/**
	 * get from field bookings: {} from match
	 */
	
	public int minute;
	public Player bookedPlayer;
	
	@JsonProperty("bookings")
	public void unpackMinute(Map<String, Integer> bookings) {
		minute = bookings.get("minute");
	}
	@JsonProperty("player")
	public void unpackBookedPlayer(Map<String, Object> player) {
		bookedPlayer = player.get("name");
	}
}	
