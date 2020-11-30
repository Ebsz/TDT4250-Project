package tdt4250.football;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import tdt4250.football.json.folder.Player;

public class Parser {
	
	private static ObjectMapper objectMapper = getDefaultObjectMapper();
	
	
	private static ObjectMapper getDefaultObjectMapper() {
		ObjectMapper defaultObjectMapper = new ObjectMapper();
		defaultObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return defaultObjectMapper;
	}
	public static JsonNode parse(String src) throws IOException{
		return objectMapper.readTree(src);
	}
	
	public static <A> A fromJson(JsonNode node ,Class<A> pojo) throws JsonProcessingException{
		return objectMapper.treeToValue(node, pojo);
	}
	
	public static void populatePojos() {
		
	}
}
