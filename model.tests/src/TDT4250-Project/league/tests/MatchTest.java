/**
 */
package TDT4250-Project.league.tests;

import TDT4250-Project.league.LeagueFactory;
import TDT4250-Project.league.Match;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatchTest extends TestCase {

	/**
	 * The fixture for this Match test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Match fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MatchTest.class);
	}

	/**
	 * Constructs a new Match test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Match test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Match fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Match test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Match getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(LeagueFactory.eINSTANCE.createMatch());
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

} //MatchTest
