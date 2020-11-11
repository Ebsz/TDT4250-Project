package tdt4250.football;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiFetcher {

	private final String API_URL = "https://google.com";
	private final String API_KEY = "b7822848398f41b2b76165aeedd97ac2";

	public static String sendGet(String destinationUrl) {
		HttpURLConnection connection = null;

		try {
			URL url = new URL(destinationUrl);
			connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");
			connection.setRequestProperty("UserAgent", "Mozilla/5.0 ");

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

	public void fetch() {
		String response;
		response = sendGet(API_URL);
		System.out.println("response: " + response);
	}

	public static void main(String[] args) {
		ApiFetcher apiFetcher = new ApiFetcher();
		apiFetcher.fetch();
	}
}