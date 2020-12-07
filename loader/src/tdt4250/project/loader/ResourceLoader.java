package tdt4250.project.loader;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import TDT4250.Project.league.League;
import tdt4250.project.loader.data.CompetitionData;
import tdt4250.project.loader.data.DataLoader;
import tdt4250.project.loader.data.json.LeagueData;


/**
 *
 * Main class of the data loader
 *
 * Fetches data from the API, creating .xmi models from it.
 */
public class ResourceLoader {
	public static final String XMI_OUT_FILENAME = "league.xmi";
	public static final String XMI_OUT_DIRECTORY = "output";

	public static final String COMPETITION_NAME = "Premier League";
	public static final int COMPETITION_ID = 2021;

	/**
	 * Save the League model object as an .xmi file
	 *
	 * League is the root of our model so, in practice, this saves an entire model.
	 *
	 * @param league 	league to be saved
	 * @param filename 	name of the output .xmi file. Must include the .xmi extension
	 */
	public void saveLeagueAsXMI(League league, String filename) {
		String outputPath = XMI_OUT_DIRECTORY + "/" + filename; //TODO: a safer way of concatenating paths?

		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		Resource resource = rs.createResource(URI.createURI(outputPath));
		resource.getContents().add(league);

		try {
			resource.save(Collections.EMPTY_MAP);

			System.out.println("Model saved to " + outputPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void load() {
		CompetitionData data = new CompetitionData(COMPETITION_ID);
		data.load();

		ModelMapper mapper = new ModelMapper(data);
		League league = mapper.mapLeague();
	

		System.out.println("league:" + league);

		saveLeagueAsXMI(league, XMI_OUT_FILENAME);

		//LeagueData leagueData = DataLoader.getLeagueData(COMPETITION_NAME);
		//League league = Mapper.mapLeague(leagueData);
	}

	public static void main(String[] args) {
		ResourceLoader loader = new ResourceLoader();
		loader.load();
	}
}