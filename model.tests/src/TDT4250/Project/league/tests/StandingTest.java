/**
 */
package TDT4250.Project.league.tests;

import TDT4250.Project.league.LeagueFactory;
import TDT4250.Project.league.Standing;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Standing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandingTest extends TestCase {

	/**
	 * The fixture for this Standing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Standing fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StandingTest.class);
	}

	/**
	 * Constructs a new Standing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandingTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Standing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Standing fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Standing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Standing getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(LeagueFactory.eINSTANCE.createStanding());
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

} //StandingTest
