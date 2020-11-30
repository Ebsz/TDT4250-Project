package tdt4250.football;

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


public class ApiFetcher {
	private final String API_BASE_URL = "http://api.football-data.org/v2/";
	private final String API_KEY = "b7822848398f41b2b76165aeedd97ac2";

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

	/**
	 * 
	 * 
	 * @param competitionName
	 * @return
	 */
	public int getCompetitionId(String competitionName) {
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