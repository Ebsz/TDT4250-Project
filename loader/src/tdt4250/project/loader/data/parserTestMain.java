package tdt4250.project.loader.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

import tdt4250.project.loader.data.json.BookingData;
import tdt4250.project.loader.data.json.MatchData;
import tdt4250.project.loader.data.json.PlayerData;

public class parserTestMain {
	
	private String playerJson = "{ \"name\" : \"Rune Bratseth\", \"position\" : \"attack\"}";
	
	private String matchJson = "{\"AwayTeam\": \"Manchester United\", "
			+ "\"HomeTeam\" : \"Arsenal\", "
			+ "\"bookings\" : [{\"bookedPlayer\" : "
			+ "				{\"name\": \"Jon Obi Mikel\", \"position\": \"midfield\"}, \"minute\" : \"23\"}], "
			+ "\"date\": \"2004-24-01\", "
			+ "\"homeGoals\": \"2\", "
			+ "\"awayGoals\":\"0\","
			+ "\"referee\":\"Mike Dean\"}";

	private String bookingJson = "{\"bookedPlayer\" : {\"name\": \"Jon Obi Mikel\", \"position\": \"midfield\"}, \"minute\": \"2\"}";
	
	@Test
	void parse() throws IOException {
		JsonNode node = Parser.parse(playerJson);
		assertEquals(node.get("name").asText(),"Rune Bratseth");
	}
	
	@Test
	void fromJson() throws IOException {
		JsonNode node = Parser.parse(playerJson);
		PlayerData player = Parser.fromJson(node, PlayerData.class);
		
		assertEquals(player.getName(), "Rune Bratseth");
	}
	
	@Test
	void matchTest() throws IOException{
		JsonNode node = Parser.parse(matchJson);
		MatchData match = Parser.fromJson(node, MatchData.class);
		
		System.out.println(match.getAwayGoals());
		System.out.println(match.getHomeGoals());
		for (BookingData b : match.getBookings()) {
			System.out.println(b.getBookedPlayer().getName());
			System.out.println(b.getMinute());
		}
		
	}
	@Test
	void bookingTest() throws IOException{
		JsonNode node = Parser.parse(bookingJson);
		BookingData booking = Parser.fromJson(node, BookingData.class);
		
	}
}
		

	



