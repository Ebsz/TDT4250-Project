/**
 */
package TDT4250.Project.league;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.Standing#getTeam <em>Team</em>}</li>
 *   <li>{@link TDT4250.Project.league.Standing#getPosition <em>Position</em>}</li>
 *   <li>{@link TDT4250.Project.league.Standing#getGamesPlayed <em>Games Played</em>}</li>
 *   <li>{@link TDT4250.Project.league.Standing#getPoints <em>Points</em>}</li>
 *   <li>{@link TDT4250.Project.league.Standing#getWins <em>Wins</em>}</li>
 *   <li>{@link TDT4250.Project.league.Standing#getDraws <em>Draws</em>}</li>
 *   <li>{@link TDT4250.Project.league.Standing#getLoose <em>Loose</em>}</li>
 *   <li>{@link TDT4250.Project.league.Standing#getGoalsFor <em>Goals For</em>}</li>
 *   <li>{@link TDT4250.Project.league.Standing#getGoalsAgainst <em>Goals Against</em>}</li>
 *   <li>{@link TDT4250.Project.league.Standing#getGoalDifference <em>Goal Difference</em>}</li>
 * </ul>
 *
 * @see TDT4250.Project.league.LeaguePackage#getStanding()
 * @model
 * @generated
 */
public interface Standing extends EObject {
	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference.
	 * @see #setTeam(Team)
	 * @see TDT4250.Project.league.LeaguePackage#getStanding_Team()
	 * @model
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Standing#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see TDT4250.Project.league.LeaguePackage#getStanding_Position()
	 * @model
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Standing#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Games Played</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games Played</em>' attribute.
	 * @see #setGamesPlayed(int)
	 * @see TDT4250.Project.league.LeaguePackage#getStanding_GamesPlayed()
	 * @model
	 * @generated
	 */
	int getGamesPlayed();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Standing#getGamesPlayed <em>Games Played</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Games Played</em>' attribute.
	 * @see #getGamesPlayed()
	 * @generated
	 */
	void setGamesPlayed(int value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see TDT4250.Project.league.LeaguePackage#getStanding_Points()
	 * @model
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Standing#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

	/**
	 * Returns the value of the '<em><b>Wins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wins</em>' attribute.
	 * @see #setWins(int)
	 * @see TDT4250.Project.league.LeaguePackage#getStanding_Wins()
	 * @model
	 * @generated
	 */
	int getWins();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Standing#getWins <em>Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wins</em>' attribute.
	 * @see #getWins()
	 * @generated
	 */
	void setWins(int value);

	/**
	 * Returns the value of the '<em><b>Draws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Draws</em>' attribute.
	 * @see #setDraws(int)
	 * @see TDT4250.Project.league.LeaguePackage#getStanding_Draws()
	 * @model
	 * @generated
	 */
	int getDraws();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Standing#getDraws <em>Draws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Draws</em>' attribute.
	 * @see #getDraws()
	 * @generated
	 */
	void setDraws(int value);

	/**
	 * Returns the value of the '<em><b>Loose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loose</em>' attribute.
	 * @see #setLoose(int)
	 * @see TDT4250.Project.league.LeaguePackage#getStanding_Loose()
	 * @model
	 * @generated
	 */
	int getLoose();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Standing#getLoose <em>Loose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loose</em>' attribute.
	 * @see #getLoose()
	 * @generated
	 */
	void setLoose(int value);

	/**
	 * Returns the value of the '<em><b>Goals For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals For</em>' attribute.
	 * @see #setGoalsFor(int)
	 * @see TDT4250.Project.league.LeaguePackage#getStanding_GoalsFor()
	 * @model
	 * @generated
	 */
	int getGoalsFor();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Standing#getGoalsFor <em>Goals For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals For</em>' attribute.
	 * @see #getGoalsFor()
	 * @generated
	 */
	void setGoalsFor(int value);

	/**
	 * Returns the value of the '<em><b>Goals Against</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals Against</em>' attribute.
	 * @see #setGoalsAgainst(int)
	 * @see TDT4250.Project.league.LeaguePackage#getStanding_GoalsAgainst()
	 * @model
	 * @generated
	 */
	int getGoalsAgainst();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Standing#getGoalsAgainst <em>Goals Against</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals Against</em>' attribute.
	 * @see #getGoalsAgainst()
	 * @generated
	 */
	void setGoalsAgainst(int value);

	/**
	 * Returns the value of the '<em><b>Goal Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Difference</em>' attribute.
	 * @see #setGoalDifference(int)
	 * @see TDT4250.Project.league.LeaguePackage#getStanding_GoalDifference()
	 * @model
	 * @generated
	 */
	int getGoalDifference();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Standing#getGoalDifference <em>Goal Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Difference</em>' attribute.
	 * @see #getGoalDifference()
	 * @generated
	 */
	void setGoalDifference(int value);

} // Standing
