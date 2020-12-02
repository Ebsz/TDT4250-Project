package tdt4250.project.loader.data;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import tdt4250.project.loader.data.json.TeamData;


public class Parser {
	/**
	 * Parse a JSON string into a single JsonNode object
	 *
	 * @param src JSON string
	 * @return JsonNode
	 * @throws IOException
	 */
	public static JsonNode parse(String src) throws IOException{
		return getObjectMapper().readTree(src);
	}

	/**
	 * Converts a JsonNode into a single Java object
	 *
	 * @param <A> object type
	 * @param node
	 * @param dataClass
	 * @return
	 * @throws JsonProcessingException
	 */	
	public static <A> A fromJson(JsonNode node, Class<A> dataClass) throws JsonProcessingException{
		return getObjectMapper().treeToValue(node, dataClass);
	}

	/**
	 * Convert a JsonNode to a list of objects
	 *
	 * The JsonNode must be a direct list of objects, where the objects correspond to dataClass
	 *
	 * @param <T> object type
	 * @param node
	 * @param dataClass
	 * @return list of objects of type T
	 * @throws JsonProcessingException
	 */
	public static <T> List<T> fromJsonNodeToList(JsonNode node, Class<T> dataClass) throws JsonProcessingException {
		List<T> list = new ArrayList<>();

		// TODO: There is a better way to do this with Jackson, that avoids directly iterate over each part of the node
		for (JsonNode n: node) {
			list.add(fromJson(n, dataClass));
		}

		return list;
	}

	public static List<TeamData> parseTeams(String teamsJson) {
		List<TeamData> teams = new ArrayList<>();

		try {
			JsonNode teamsNode = parse(teamsJson).get("teams");
			teams = fromJsonNodeToList(teamsNode, TeamData.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return teams;
	}

	private static ObjectMapper objectMapper = null;
	private static ObjectMapper getObjectMapper() {
		if (objectMapper == null) {
			objectMapper = new ObjectMapper();
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		}
		return objectMapper;
	}
}
