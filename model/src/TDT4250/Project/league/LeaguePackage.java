/**
 */
package TDT4250.Project.league;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TDT4250.Project.league.LeagueFactory
 * @model kind="package"
 * @generated
 */
public interface LeaguePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "league";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/TDT4250.Project/model/League.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "league";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LeaguePackage eINSTANCE = TDT4250.Project.league.impl.LeaguePackageImpl.init();

	/**
	 * The meta object id for the '{@link TDT4250.Project.league.impl.LeagueImpl <em>League</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Project.league.impl.LeagueImpl
	 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getLeague()
	 * @generated
	 */
	int LEAGUE = 0;

	/**
	 * The feature id for the '<em><b>Season</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__SEASON = 0;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__TEAMS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__NAME = 2;

	/**
	 * The number of structural features of the '<em>League</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>League</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Project.league.impl.SeasonImpl <em>Season</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Project.league.impl.SeasonImpl
	 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getSeason()
	 * @generated
	 */
	int SEASON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Matchweeks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__MATCHWEEKS = 1;

	/**
	 * The feature id for the '<em><b>Standing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__STANDING = 2;

	/**
	 * The number of structural features of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Project.league.impl.MatchweekImpl <em>Matchweek</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Project.league.impl.MatchweekImpl
	 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getMatchweek()
	 * @generated
	 */
	int MATCHWEEK = 2;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHWEEK__MATCHES = 0;

	/**
	 * The feature id for the '<em><b>Matchweek</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHWEEK__MATCHWEEK = 1;

	/**
	 * The number of structural features of the '<em>Matchweek</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHWEEK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Matchweek</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHWEEK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Project.league.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Project.league.impl.MatchImpl
	 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 3;

	/**
	 * The feature id for the '<em><b>Hometeam</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOMETEAM = 0;

	/**
	 * The feature id for the '<em><b>Awayteam</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAYTEAM = 1;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__BOOKINGS = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__DATE = 3;

	/**
	 * The feature id for the '<em><b>Homegoals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOMEGOALS = 4;

	/**
	 * The feature id for the '<em><b>Avaygoals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AVAYGOALS = 5;

	/**
	 * The feature id for the '<em><b>Referee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__REFEREE = 6;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Project.league.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Project.league.impl.TeamImpl
	 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned Player</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__OWNED_PLAYER = 1;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__ABBR = 2;

	/**
	 * The feature id for the '<em><b>Stadium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__STADIUM = 3;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Project.league.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Project.league.impl.PlayerImpl
	 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POSITION = 1;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Project.league.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Project.league.impl.BookingImpl
	 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 6;

	/**
	 * The feature id for the '<em><b>Booked Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKED_PLAYER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__MINUTE = 2;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Project.league.impl.StandingImpl <em>Standing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Project.league.impl.StandingImpl
	 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getStanding()
	 * @generated
	 */
	int STANDING = 7;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING__TEAM = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Games Played</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING__GAMES_PLAYED = 2;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING__POINTS = 3;

	/**
	 * The feature id for the '<em><b>Wins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING__WINS = 4;

	/**
	 * The feature id for the '<em><b>Draws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING__DRAWS = 5;

	/**
	 * The feature id for the '<em><b>Loose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING__LOOSE = 6;

	/**
	 * The feature id for the '<em><b>Goals For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING__GOALS_FOR = 7;

	/**
	 * The feature id for the '<em><b>Goals Against</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING__GOALS_AGAINST = 8;

	/**
	 * The feature id for the '<em><b>Goal Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING__GOAL_DIFFERENCE = 9;

	/**
	 * The number of structural features of the '<em>Standing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Standing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TDT4250.Project.league.BookingType <em>Booking Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Project.league.BookingType
	 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getBookingType()
	 * @generated
	 */
	int BOOKING_TYPE = 8;

	/**
	 * The meta object id for the '{@link TDT4250.Project.league.PositionType <em>Position Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TDT4250.Project.league.PositionType
	 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getPositionType()
	 * @generated
	 */
	int POSITION_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link TDT4250.Project.league.League <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>League</em>'.
	 * @see TDT4250.Project.league.League
	 * @generated
	 */
	EClass getLeague();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Project.league.League#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Season</em>'.
	 * @see TDT4250.Project.league.League#getSeason()
	 * @see #getLeague()
	 * @generated
	 */
	EReference getLeague_Season();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Project.league.League#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see TDT4250.Project.league.League#getTeams()
	 * @see #getLeague()
	 * @generated
	 */
	EReference getLeague_Teams();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.League#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.Project.league.League#getName()
	 * @see #getLeague()
	 * @generated
	 */
	EAttribute getLeague_Name();

	/**
	 * Returns the meta object for class '{@link TDT4250.Project.league.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season</em>'.
	 * @see TDT4250.Project.league.Season
	 * @generated
	 */
	EClass getSeason();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Season#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.Project.league.Season#getName()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Project.league.Season#getMatchweeks <em>Matchweeks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matchweeks</em>'.
	 * @see TDT4250.Project.league.Season#getMatchweeks()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_Matchweeks();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Project.league.Season#getStanding <em>Standing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Standing</em>'.
	 * @see TDT4250.Project.league.Season#getStanding()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_Standing();

	/**
	 * Returns the meta object for class '{@link TDT4250.Project.league.Matchweek <em>Matchweek</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matchweek</em>'.
	 * @see TDT4250.Project.league.Matchweek
	 * @generated
	 */
	EClass getMatchweek();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Project.league.Matchweek#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see TDT4250.Project.league.Matchweek#getMatches()
	 * @see #getMatchweek()
	 * @generated
	 */
	EReference getMatchweek_Matches();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Matchweek#getMatchweek <em>Matchweek</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matchweek</em>'.
	 * @see TDT4250.Project.league.Matchweek#getMatchweek()
	 * @see #getMatchweek()
	 * @generated
	 */
	EAttribute getMatchweek_Matchweek();

	/**
	 * Returns the meta object for class '{@link TDT4250.Project.league.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see TDT4250.Project.league.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the reference '{@link TDT4250.Project.league.Match#getHometeam <em>Hometeam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hometeam</em>'.
	 * @see TDT4250.Project.league.Match#getHometeam()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Hometeam();

	/**
	 * Returns the meta object for the reference '{@link TDT4250.Project.league.Match#getAwayteam <em>Awayteam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Awayteam</em>'.
	 * @see TDT4250.Project.league.Match#getAwayteam()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Awayteam();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Project.league.Match#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bookings</em>'.
	 * @see TDT4250.Project.league.Match#getBookings()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Bookings();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Match#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see TDT4250.Project.league.Match#getDate()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Date();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Match#getHomegoals <em>Homegoals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Homegoals</em>'.
	 * @see TDT4250.Project.league.Match#getHomegoals()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Homegoals();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Match#getAvaygoals <em>Avaygoals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avaygoals</em>'.
	 * @see TDT4250.Project.league.Match#getAvaygoals()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Avaygoals();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Match#getReferee <em>Referee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referee</em>'.
	 * @see TDT4250.Project.league.Match#getReferee()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Referee();

	/**
	 * Returns the meta object for class '{@link TDT4250.Project.league.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see TDT4250.Project.league.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Team#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.Project.league.Team#getName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link TDT4250.Project.league.Team#getOwnedPlayer <em>Owned Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Player</em>'.
	 * @see TDT4250.Project.league.Team#getOwnedPlayer()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_OwnedPlayer();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Team#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbr</em>'.
	 * @see TDT4250.Project.league.Team#getAbbr()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Abbr();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Team#getStadium <em>Stadium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stadium</em>'.
	 * @see TDT4250.Project.league.Team#getStadium()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Stadium();

	/**
	 * Returns the meta object for class '{@link TDT4250.Project.league.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see TDT4250.Project.league.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TDT4250.Project.league.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Player#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see TDT4250.Project.league.Player#getPosition()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Position();

	/**
	 * Returns the meta object for class '{@link TDT4250.Project.league.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see TDT4250.Project.league.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the reference '{@link TDT4250.Project.league.Booking#getBookedPlayer <em>Booked Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booked Player</em>'.
	 * @see TDT4250.Project.league.Booking#getBookedPlayer()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_BookedPlayer();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Booking#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see TDT4250.Project.league.Booking#getType()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Type();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Booking#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see TDT4250.Project.league.Booking#getMinute()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Minute();

	/**
	 * Returns the meta object for class '{@link TDT4250.Project.league.Standing <em>Standing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standing</em>'.
	 * @see TDT4250.Project.league.Standing
	 * @generated
	 */
	EClass getStanding();

	/**
	 * Returns the meta object for the reference '{@link TDT4250.Project.league.Standing#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see TDT4250.Project.league.Standing#getTeam()
	 * @see #getStanding()
	 * @generated
	 */
	EReference getStanding_Team();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Standing#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see TDT4250.Project.league.Standing#getPosition()
	 * @see #getStanding()
	 * @generated
	 */
	EAttribute getStanding_Position();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Standing#getGamesPlayed <em>Games Played</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Games Played</em>'.
	 * @see TDT4250.Project.league.Standing#getGamesPlayed()
	 * @see #getStanding()
	 * @generated
	 */
	EAttribute getStanding_GamesPlayed();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Standing#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see TDT4250.Project.league.Standing#getPoints()
	 * @see #getStanding()
	 * @generated
	 */
	EAttribute getStanding_Points();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Standing#getWins <em>Wins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wins</em>'.
	 * @see TDT4250.Project.league.Standing#getWins()
	 * @see #getStanding()
	 * @generated
	 */
	EAttribute getStanding_Wins();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Standing#getDraws <em>Draws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Draws</em>'.
	 * @see TDT4250.Project.league.Standing#getDraws()
	 * @see #getStanding()
	 * @generated
	 */
	EAttribute getStanding_Draws();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Standing#getLoose <em>Loose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loose</em>'.
	 * @see TDT4250.Project.league.Standing#getLoose()
	 * @see #getStanding()
	 * @generated
	 */
	EAttribute getStanding_Loose();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Standing#getGoalsFor <em>Goals For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals For</em>'.
	 * @see TDT4250.Project.league.Standing#getGoalsFor()
	 * @see #getStanding()
	 * @generated
	 */
	EAttribute getStanding_GoalsFor();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Standing#getGoalsAgainst <em>Goals Against</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals Against</em>'.
	 * @see TDT4250.Project.league.Standing#getGoalsAgainst()
	 * @see #getStanding()
	 * @generated
	 */
	EAttribute getStanding_GoalsAgainst();

	/**
	 * Returns the meta object for the attribute '{@link TDT4250.Project.league.Standing#getGoalDifference <em>Goal Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal Difference</em>'.
	 * @see TDT4250.Project.league.Standing#getGoalDifference()
	 * @see #getStanding()
	 * @generated
	 */
	EAttribute getStanding_GoalDifference();

	/**
	 * Returns the meta object for enum '{@link TDT4250.Project.league.BookingType <em>Booking Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Booking Type</em>'.
	 * @see TDT4250.Project.league.BookingType
	 * @generated
	 */
	EEnum getBookingType();

	/**
	 * Returns the meta object for enum '{@link TDT4250.Project.league.PositionType <em>Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position Type</em>'.
	 * @see TDT4250.Project.league.PositionType
	 * @generated
	 */
	EEnum getPositionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LeagueFactory getLeagueFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TDT4250.Project.league.impl.LeagueImpl <em>League</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Project.league.impl.LeagueImpl
		 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getLeague()
		 * @generated
		 */
		EClass LEAGUE = eINSTANCE.getLeague();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAGUE__SEASON = eINSTANCE.getLeague_Season();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAGUE__TEAMS = eINSTANCE.getLeague_Teams();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAGUE__NAME = eINSTANCE.getLeague_Name();

		/**
		 * The meta object literal for the '{@link TDT4250.Project.league.impl.SeasonImpl <em>Season</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Project.league.impl.SeasonImpl
		 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getSeason()
		 * @generated
		 */
		EClass SEASON = eINSTANCE.getSeason();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__NAME = eINSTANCE.getSeason_Name();

		/**
		 * The meta object literal for the '<em><b>Matchweeks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__MATCHWEEKS = eINSTANCE.getSeason_Matchweeks();

		/**
		 * The meta object literal for the '<em><b>Standing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__STANDING = eINSTANCE.getSeason_Standing();

		/**
		 * The meta object literal for the '{@link TDT4250.Project.league.impl.MatchweekImpl <em>Matchweek</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Project.league.impl.MatchweekImpl
		 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getMatchweek()
		 * @generated
		 */
		EClass MATCHWEEK = eINSTANCE.getMatchweek();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHWEEK__MATCHES = eINSTANCE.getMatchweek_Matches();

		/**
		 * The meta object literal for the '<em><b>Matchweek</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCHWEEK__MATCHWEEK = eINSTANCE.getMatchweek_Matchweek();

		/**
		 * The meta object literal for the '{@link TDT4250.Project.league.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Project.league.impl.MatchImpl
		 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Hometeam</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__HOMETEAM = eINSTANCE.getMatch_Hometeam();

		/**
		 * The meta object literal for the '<em><b>Awayteam</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__AWAYTEAM = eINSTANCE.getMatch_Awayteam();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__BOOKINGS = eINSTANCE.getMatch_Bookings();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__DATE = eINSTANCE.getMatch_Date();

		/**
		 * The meta object literal for the '<em><b>Homegoals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__HOMEGOALS = eINSTANCE.getMatch_Homegoals();

		/**
		 * The meta object literal for the '<em><b>Avaygoals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__AVAYGOALS = eINSTANCE.getMatch_Avaygoals();

		/**
		 * The meta object literal for the '<em><b>Referee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__REFEREE = eINSTANCE.getMatch_Referee();

		/**
		 * The meta object literal for the '{@link TDT4250.Project.league.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Project.league.impl.TeamImpl
		 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

		/**
		 * The meta object literal for the '<em><b>Owned Player</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__OWNED_PLAYER = eINSTANCE.getTeam_OwnedPlayer();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__ABBR = eINSTANCE.getTeam_Abbr();

		/**
		 * The meta object literal for the '<em><b>Stadium</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__STADIUM = eINSTANCE.getTeam_Stadium();

		/**
		 * The meta object literal for the '{@link TDT4250.Project.league.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Project.league.impl.PlayerImpl
		 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__POSITION = eINSTANCE.getPlayer_Position();

		/**
		 * The meta object literal for the '{@link TDT4250.Project.league.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Project.league.impl.BookingImpl
		 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Booked Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__BOOKED_PLAYER = eINSTANCE.getBooking_BookedPlayer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__TYPE = eINSTANCE.getBooking_Type();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__MINUTE = eINSTANCE.getBooking_Minute();

		/**
		 * The meta object literal for the '{@link TDT4250.Project.league.impl.StandingImpl <em>Standing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Project.league.impl.StandingImpl
		 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getStanding()
		 * @generated
		 */
		EClass STANDING = eINSTANCE.getStanding();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDING__TEAM = eINSTANCE.getStanding_Team();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDING__POSITION = eINSTANCE.getStanding_Position();

		/**
		 * The meta object literal for the '<em><b>Games Played</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDING__GAMES_PLAYED = eINSTANCE.getStanding_GamesPlayed();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDING__POINTS = eINSTANCE.getStanding_Points();

		/**
		 * The meta object literal for the '<em><b>Wins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDING__WINS = eINSTANCE.getStanding_Wins();

		/**
		 * The meta object literal for the '<em><b>Draws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDING__DRAWS = eINSTANCE.getStanding_Draws();

		/**
		 * The meta object literal for the '<em><b>Loose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDING__LOOSE = eINSTANCE.getStanding_Loose();

		/**
		 * The meta object literal for the '<em><b>Goals For</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDING__GOALS_FOR = eINSTANCE.getStanding_GoalsFor();

		/**
		 * The meta object literal for the '<em><b>Goals Against</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDING__GOALS_AGAINST = eINSTANCE.getStanding_GoalsAgainst();

		/**
		 * The meta object literal for the '<em><b>Goal Difference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDING__GOAL_DIFFERENCE = eINSTANCE.getStanding_GoalDifference();

		/**
		 * The meta object literal for the '{@link TDT4250.Project.league.BookingType <em>Booking Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Project.league.BookingType
		 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getBookingType()
		 * @generated
		 */
		EEnum BOOKING_TYPE = eINSTANCE.getBookingType();

		/**
		 * The meta object literal for the '{@link TDT4250.Project.league.PositionType <em>Position Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TDT4250.Project.league.PositionType
		 * @see TDT4250.Project.league.impl.LeaguePackageImpl#getPositionType()
		 * @generated
		 */
		EEnum POSITION_TYPE = eINSTANCE.getPositionType();

	}

} //LeaguePackage
