package tdt4250.project.loader.data;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Helper class for parsing JSON to data objects.
 */
public class Parser {

	/**
	 * Parse a JSON object into a data object.
	 *
	 * The data object must correspond one-to-one with the JSON data, but doesn't
	 * need to map all the fields that exist in the data
	 *
	 * @param <T>  data object type
	 * @param json data
	 * @param objectClass
	 * @return parsed data object
	 * @throws JsonProcessingException
	 */
	public static <T> T parseObject(String json, Class<T> objectClass) throws JsonProcessingException {
		T obj = getObjectMapper().readValue(json, objectClass);

		return obj;
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