/**
 */
package TDT4250.Project.league.impl;

import TDT4250.Project.league.LeaguePackage;
import TDT4250.Project.league.Standing;
import TDT4250.Project.league.Team;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.impl.StandingImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.StandingImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.StandingImpl#getGamesPlayed <em>Games Played</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.StandingImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.StandingImpl#getWins <em>Wins</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.StandingImpl#getDraws <em>Draws</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.StandingImpl#getLoose <em>Loose</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.StandingImpl#getGoalsFor <em>Goals For</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.StandingImpl#getGoalsAgainst <em>Goals Against</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.StandingImpl#getGoalDifference <em>Goal Difference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandingImpl extends MinimalEObjectImpl.Container implements Standing {
	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected Team team;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGamesPlayed() <em>Games Played</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamesPlayed()
	 * @generated
	 * @ordered
	 */
	protected static final int GAMES_PLAYED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGamesPlayed() <em>Games Played</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamesPlayed()
	 * @generated
	 * @ordered
	 */
	protected int gamesPlayed = GAMES_PLAYED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected int points = POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWins() <em>Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWins()
	 * @generated
	 * @ordered
	 */
	protected static final int WINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWins() <em>Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWins()
	 * @generated
	 * @ordered
	 */
	protected int wins = WINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDraws() <em>Draws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDraws()
	 * @generated
	 * @ordered
	 */
	protected static final int DRAWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDraws() <em>Draws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDraws()
	 * @generated
	 * @ordered
	 */
	protected int draws = DRAWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoose() <em>Loose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoose()
	 * @generated
	 * @ordered
	 */
	protected static final int LOOSE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoose() <em>Loose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoose()
	 * @generated
	 * @ordered
	 */
	protected int loose = LOOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoalsFor() <em>Goals For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalsFor()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_FOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoalsFor() <em>Goals For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalsFor()
	 * @generated
	 * @ordered
	 */
	protected int goalsFor = GOALS_FOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoalsAgainst() <em>Goals Against</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalsAgainst()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_AGAINST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoalsAgainst() <em>Goals Against</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalsAgainst()
	 * @generated
	 * @ordered
	 */
	protected int goalsAgainst = GOALS_AGAINST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoalDifference() <em>Goal Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalDifference()
	 * @generated
	 * @ordered
	 */
	protected static final int GOAL_DIFFERENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoalDifference() <em>Goal Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalDifference()
	 * @generated
	 * @ordered
	 */
	protected int goalDifference = GOAL_DIFFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LeaguePackage.Literals.STANDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getTeam() {
		if (team != null && team.eIsProxy()) {
			InternalEObject oldTeam = (InternalEObject)team;
			team = (Team)eResolveProxy(oldTeam);
			if (team != oldTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeaguePackage.STANDING__TEAM, oldTeam, team));
			}
		}
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetTeam() {
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeam(Team newTeam) {
		Team oldTeam = team;
		team = newTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.STANDING__TEAM, oldTeam, team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.STANDING__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGamesPlayed() {
		return gamesPlayed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGamesPlayed(int newGamesPlayed) {
		int oldGamesPlayed = gamesPlayed;
		gamesPlayed = newGamesPlayed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.STANDING__GAMES_PLAYED, oldGamesPlayed, gamesPlayed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoints(int newPoints) {
		int oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.STANDING__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWins() {
		return wins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWins(int newWins) {
		int oldWins = wins;
		wins = newWins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.STANDING__WINS, oldWins, wins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDraws() {
		return draws;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDraws(int newDraws) {
		int oldDraws = draws;
		draws = newDraws;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.STANDING__DRAWS, oldDraws, draws));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLoose() {
		return loose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoose(int newLoose) {
		int oldLoose = loose;
		loose = newLoose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.STANDING__LOOSE, oldLoose, loose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGoalsFor() {
		return goalsFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoalsFor(int newGoalsFor) {
		int oldGoalsFor = goalsFor;
		goalsFor = newGoalsFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.STANDING__GOALS_FOR, oldGoalsFor, goalsFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGoalsAgainst() {
		return goalsAgainst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoalsAgainst(int newGoalsAgainst) {
		int oldGoalsAgainst = goalsAgainst;
		goalsAgainst = newGoalsAgainst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.STANDING__GOALS_AGAINST, oldGoalsAgainst, goalsAgainst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGoalDifference() {
		return goalDifference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoalDifference(int newGoalDifference) {
		int oldGoalDifference = goalDifference;
		goalDifference = newGoalDifference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.STANDING__GOAL_DIFFERENCE, oldGoalDifference, goalDifference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeaguePackage.STANDING__TEAM:
				if (resolve) return getTeam();
				return basicGetTeam();
			case LeaguePackage.STANDING__POSITION:
				return getPosition();
			case LeaguePackage.STANDING__GAMES_PLAYED:
				return getGamesPlayed();
			case LeaguePackage.STANDING__POINTS:
				return getPoints();
			case LeaguePackage.STANDING__WINS:
				return getWins();
			case LeaguePackage.STANDING__DRAWS:
				return getDraws();
			case LeaguePackage.STANDING__LOOSE:
				return getLoose();
			case LeaguePackage.STANDING__GOALS_FOR:
				return getGoalsFor();
			case LeaguePackage.STANDING__GOALS_AGAINST:
				return getGoalsAgainst();
			case LeaguePackage.STANDING__GOAL_DIFFERENCE:
				return getGoalDifference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LeaguePackage.STANDING__TEAM:
				setTeam((Team)newValue);
				return;
			case LeaguePackage.STANDING__POSITION:
				setPosition((Integer)newValue);
				return;
			case LeaguePackage.STANDING__GAMES_PLAYED:
				setGamesPlayed((Integer)newValue);
				return;
			case LeaguePackage.STANDING__POINTS:
				setPoints((Integer)newValue);
				return;
			case LeaguePackage.STANDING__WINS:
				setWins((Integer)newValue);
				return;
			case LeaguePackage.STANDING__DRAWS:
				setDraws((Integer)newValue);
				return;
			case LeaguePackage.STANDING__LOOSE:
				setLoose((Integer)newValue);
				return;
			case LeaguePackage.STANDING__GOALS_FOR:
				setGoalsFor((Integer)newValue);
				return;
			case LeaguePackage.STANDING__GOALS_AGAINST:
				setGoalsAgainst((Integer)newValue);
				return;
			case LeaguePackage.STANDING__GOAL_DIFFERENCE:
				setGoalDifference((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LeaguePackage.STANDING__TEAM:
				setTeam((Team)null);
				return;
			case LeaguePackage.STANDING__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case LeaguePackage.STANDING__GAMES_PLAYED:
				setGamesPlayed(GAMES_PLAYED_EDEFAULT);
				return;
			case LeaguePackage.STANDING__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case LeaguePackage.STANDING__WINS:
				setWins(WINS_EDEFAULT);
				return;
			case LeaguePackage.STANDING__DRAWS:
				setDraws(DRAWS_EDEFAULT);
				return;
			case LeaguePackage.STANDING__LOOSE:
				setLoose(LOOSE_EDEFAULT);
				return;
			case LeaguePackage.STANDING__GOALS_FOR:
				setGoalsFor(GOALS_FOR_EDEFAULT);
				return;
			case LeaguePackage.STANDING__GOALS_AGAINST:
				setGoalsAgainst(GOALS_AGAINST_EDEFAULT);
				return;
			case LeaguePackage.STANDING__GOAL_DIFFERENCE:
				setGoalDifference(GOAL_DIFFERENCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LeaguePackage.STANDING__TEAM:
				return team != null;
			case LeaguePackage.STANDING__POSITION:
				return position != POSITION_EDEFAULT;
			case LeaguePackage.STANDING__GAMES_PLAYED:
				return gamesPlayed != GAMES_PLAYED_EDEFAULT;
			case LeaguePackage.STANDING__POINTS:
				return points != POINTS_EDEFAULT;
			case LeaguePackage.STANDING__WINS:
				return wins != WINS_EDEFAULT;
			case LeaguePackage.STANDING__DRAWS:
				return draws != DRAWS_EDEFAULT;
			case LeaguePackage.STANDING__LOOSE:
				return loose != LOOSE_EDEFAULT;
			case LeaguePackage.STANDING__GOALS_FOR:
				return goalsFor != GOALS_FOR_EDEFAULT;
			case LeaguePackage.STANDING__GOALS_AGAINST:
				return goalsAgainst != GOALS_AGAINST_EDEFAULT;
			case LeaguePackage.STANDING__GOAL_DIFFERENCE:
				return goalDifference != GOAL_DIFFERENCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Position: ");
		result.append(position);
		result.append(", GamesPlayed: ");
		result.append(gamesPlayed);
		result.append(", Points: ");
		result.append(points);
		result.append(", Wins: ");
		result.append(wins);
		result.append(", Draws: ");
		result.append(draws);
		result.append(", Loose: ");
		result.append(loose);
		result.append(", GoalsFor: ");
		result.append(goalsFor);
		result.append(", GoalsAgainst: ");
		result.append(goalsAgainst);
		result.append(", GoalDifference: ");
		result.append(goalDifference);
		result.append(')');
		return result.toString();
	}

} //StandingImpl
