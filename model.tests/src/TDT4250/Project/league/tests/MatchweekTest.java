/**
 */
package TDT4250.Project.league.tests;

import TDT4250.Project.league.LeagueFactory;
import TDT4250.Project.league.Matchweek;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Matchweek</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatchweekTest extends TestCase {

	/**
	 * The fixture for this Matchweek test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Matchweek fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MatchweekTest.class);
	}

	/**
	 * Constructs a new Matchweek test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchweekTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Matchweek test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Matchweek fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Matchweek test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Matchweek getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(LeagueFactory.eINSTANCE.createMatchweek());
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

} //MatchweekTest
