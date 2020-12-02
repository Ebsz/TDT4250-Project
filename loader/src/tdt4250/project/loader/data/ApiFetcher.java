package tdt4250.project.loader.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Class for fetching data from the remote API
 *
 * As all data from the API is formatted as JSON, the methods of this class returns the JSON 
 * as String's that have to be parsed later.
 */
public class ApiFetcher {
	private static final String API_BASE_URL = "http://api.football-data.org/v2/";
	private static final String API_KEY = "b7822848398f41b2b76165aeedd97ac2";

	/**
	 * Send a HTTP GET request to a specified url and return the response
	 *
	 * @param destinationUrl
	 * @return String containing the response or null on error
	 */
	public static String sendGet(String destinationUrl) {
		HttpURLConnection connection = null;

		try {
			URL url = new URL(destinationUrl);
			connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");
			connection.setRequestProperty("UserAgent", "Mozilla/5.0");

			connection.setRequestProperty("X-Auth-Token", API_KEY);

			connection.setUseCaches(false);
			connection.setDoOutput(true);

			System.out.println(destinationUrl + " GET response: " + connection.getResponseCode());

			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String inputLine = null;
			StringBuffer response = new StringBuffer();

			while((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			return response.toString();

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String getCompetition(int id) {
		final String URI = API_BASE_URL + "competitions/" + String.valueOf(id);

		String response = sendGet(URI);
		return response;
	}

	// TODO: Add parameterizing by season
	public static String getCompetitionTeams(int competitionID) {
		final String URI = API_BASE_URL + "competitions/" + String.valueOf(competitionID) + "/teams";

		String response = sendGet(URI);
		return response;
	}

	/**
	 * Get the ID of a competition by name.
	 * Competitions are referred to by ID in the API, so this is a necessary step in fetching them.
	 *
	 * @param competitionName name of the competition.
	 * @return Competition ID
	 */
	public static int getCompetitionIdByName(String competitionName) {
		String response= sendGet(API_BASE_URL + "competitions");
		JSONObject obj = new JSONObject(response);

		JSONArray ar = obj.getJSONArray("competitions");

		for(int i=0; i< ar.length(); i++) {
			JSONObject o = ar.getJSONObject(i);
			if (o.getString("name").equals(competitionName)) {
				return o.getInt("id");
			}
		}

		//TODO: better error handling -  raise some kind of exception?
		return 0;
	}
}