package tdt4250.project.loader.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Data cache for Competition Data
 *
 * Avoids unnecessary calls to the API, necessitated by the limit of 10 calls per minute
 */
public class DataCache {

	private static final String CACHE_DIR = "data/";
	private static final String TEAM_CACHE_DIR = CACHE_DIR + "teams/";
	private static final String FILE_EXTENSION = ".json";

	private static List<Integer> cachedTeamIDs;

	/**
	 * Check if the cache has the team data
	 *
	 * @param teamID id of the team
	 * @return whether the team data is cached
	 */
	public static boolean hasTeamData(int teamID) {
		if (cachedTeamIDs == null) {
			cachedTeamIDs = new ArrayList<>();
			String[] directoryFiles = readDirectory(TEAM_CACHE_DIR);

			for (String s : directoryFiles) {
				int id = Integer.valueOf((s.substring(0, s.length()-5)));
				cachedTeamIDs.add(id);
			}
		}

		return cachedTeamIDs.contains(teamID);
	}

	/**
	 * Get the cached data of a team
	 *
	 * @param teamID
	 * @return cached data
	 */
	public static String getTeamData(int teamID) {
		String path = getTeamDataPath(teamID);
		return readData(path);
	}

	/**
	 * Saves the team data to the cache
	 *
	 * @param playerData
	 * @param teamID
	 */
	public static void saveTeamData(String playerData, int teamID) {
		System.out.println("Caching data for team: " + teamID);

		String path = getTeamDataPath(teamID);
		writeData(playerData, path);
	}

	private static void writeData(String data, String path) {
		try(FileWriter fileWriter = new FileWriter(path)) {
			fileWriter.write(data);
			fileWriter.close();

			System.out.println("Wrote data cache to " + path);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static String readData(String path) {
		String outData = "";
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				outData += line;
				line = br.readLine();
			}

		} catch(Exception e ) {
			e.printStackTrace();
		}

		return outData;
	}

	private static String[] readDirectory(String path) {
		File f = new File(path);
		return f.list();
	}

	private static String getTeamDataPath(int teamID) {
		return TEAM_CACHE_DIR + String.valueOf(teamID) + FILE_EXTENSION;
	}
}