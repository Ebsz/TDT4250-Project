package tdt4250.football;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import TDT4250.Project.league.League;
import TDT4250.Project.league.LeagueFactory;
import TDT4250.Project.league.LeaguePackage;

/**
 *
 * Main class of the data loader
 *
 * Fetches data from the API, creating .xmi models from it.
 */
public class Loader {

	public static final String XMI_OUT_FILENAME = "league.xmi";
	public static final String XMI_OUT_DIRECTORY = "output";

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

	public League createLeague(String name) {
		LeaguePackage.eINSTANCE.eClass(); // Initialize the LeaguePackage singleton
		LeagueFactory leagueFactory = LeagueFactory.eINSTANCE;

		League league = leagueFactory.createLeague();
		league.setName(name);

		return league;
	}

	public static void main(String[] args) {
		final String COMPETITION_NAME = "Premier League";

		Loader loader = new Loader();
		League league = loader.createLeague(COMPETITION_NAME);

		loader.saveLeagueAsXMI(league, XMI_OUT_FILENAME);
	}
}