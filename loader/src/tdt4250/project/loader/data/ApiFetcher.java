package tdt4250.project.loader.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;


/**
 * Fetches data from the remote API
 *
 * All data from the API is formatted as JSON - the methods in this class
 * simply return it as Strings that have to be parsed later.
 */
public class ApiFetcher {

	private static final String API_BASE_URL = "http://api.football-data.org/v2/";
	private static final String API_KEY = "b7822848398f41b2b76165aeedd97ac2";

	/**
	 * Sends a request to the desired end-point and handle HTTP 429 Too Many Requests.
	 * The exception is handled by sleeping for the timeout period and then retrying
	 * until the API is available.
	 *
	 * @param destinationURL
	 * @return
	 */
	public static String sendGet(String apiEndpoint) {
		while(true) {
			try {
				return doGet(apiEndpoint);
			} catch (TooManyRequestsException e) {
				System.out.println("API returned TooManyRequests (max 10/min), retrying in " + e.getTimeout() + " seconds");

				try {
					Thread.sleep(1000 * e.getTimeout());
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		}
	}

	/**
	 * Send a HTTP GET request to a specified URL and return the response
	 *
	 * @param destinationUrl
	 * @return String containing the response or null on error
	 */
	private static String doGet(String destinationURL) throws TooManyRequestsException {
		HttpURLConnection connection = null;

		try {
			URL url = new URL(destinationURL);
			connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");
			connection.setRequestProperty("UserAgent", "Mozilla/5.0");

			connection.setRequestProperty("X-Auth-Token", API_KEY);

			connection.setUseCaches(false);
			connection.setDoOutput(true);

			if (connection.getResponseCode() == 429) {
				throw new TooManyRequestsException(60);
			}

			return readResponse(connection.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * Read the response from a HTTP request
	 *
	 * @param is InputStream
	 * @return the response
	 * @throws IOException
	 */
	private static String readResponse(InputStream is) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(is));

		String inputLine = null;
		StringBuffer response = new StringBuffer();

		while((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}

		return response.toString();
	}

	public static String getCompetition(int id) {
		final String URI = API_BASE_URL + "competitions/" + String.valueOf(id);

		String response = sendGet(URI);
		return response;
	}

	public static String getCompetitionTeams(int competitionID) {
		final String URI = API_BASE_URL + "competitions/" + String.valueOf(competitionID) + "/teams";

		String response = sendGet(URI);
		return response;
	}

	public static String getStandings(int competitionID) {
		final String URI = API_BASE_URL + "competitions/" + String.valueOf(competitionID) + "/standings";

		String response = sendGet(URI);
		return response;
	}

	public static String getTeam(int teamID) {
		final String URI = API_BASE_URL + "teams/" + String.valueOf(teamID);

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
		String response = sendGet(API_BASE_URL + "competitions");
		JSONObject obj = new JSONObject(response);

		JSONArray ar = obj.getJSONArray("competitions");

		for(int i=0; i< ar.length(); i++) {
			JSONObject o = ar.getJSONObject(i);
			if (o.getString("name").equals(competitionName)) {
				return o.getInt("id");
			}
		}

		return 0;
	}

	public static String getMatches(int competitionID) {
		final String URI = API_BASE_URL + "competitions/" +String.valueOf(competitionID) +"/matches" ;
		String response = sendGet(URI);
		
		return response;
	}


	public static class TooManyRequestsException extends Exception {
		private int timeout;

		public TooManyRequestsException(int timeout) {
			super();

			this.timeout = timeout;
		}

		public int getTimeout() {
			return timeout;
		}

		private static final long serialVersionUID = 1L;
	}
}
