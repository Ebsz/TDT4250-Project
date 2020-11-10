/**
 */
package TDT4250-Project.league.tests;

import TDT4250-Project.league.LeagueFactory;
import TDT4250-Project.league.Season;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeasonTest extends TestCase {

	/**
	 * The fixture for this Season test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Season fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SeasonTest.class);
	}

	/**
	 * Constructs a new Season test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeasonTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Season test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Season fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Season test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Season getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(LeagueFactory.eINSTANCE.createSeason());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SeasonTest