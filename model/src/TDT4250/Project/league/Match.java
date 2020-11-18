/**
 */
package TDT4250.Project.league;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.Match#getHometeam <em>Hometeam</em>}</li>
 *   <li>{@link TDT4250.Project.league.Match#getAwayteam <em>Awayteam</em>}</li>
 *   <li>{@link TDT4250.Project.league.Match#getBookings <em>Bookings</em>}</li>
 *   <li>{@link TDT4250.Project.league.Match#getDate <em>Date</em>}</li>
 *   <li>{@link TDT4250.Project.league.Match#getHomegoals <em>Homegoals</em>}</li>
 *   <li>{@link TDT4250.Project.league.Match#getAvaygoals <em>Avaygoals</em>}</li>
 *   <li>{@link TDT4250.Project.league.Match#getReferee <em>Referee</em>}</li>
 * </ul>
 *
 * @see TDT4250.Project.league.LeaguePackage#getMatch()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyOneRedCardPerMatch'"
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Hometeam</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hometeam</em>' reference.
	 * @see #setHometeam(Team)
	 * @see TDT4250.Project.league.LeaguePackage#getMatch_Hometeam()
	 * @model required="true"
	 * @generated
	 */
	Team getHometeam();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Match#getHometeam <em>Hometeam</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hometeam</em>' reference.
	 * @see #getHometeam()
	 * @generated
	 */
	void setHometeam(Team value);

	/**
	 * Returns the value of the '<em><b>Awayteam</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awayteam</em>' reference.
	 * @see #setAwayteam(Team)
	 * @see TDT4250.Project.league.LeaguePackage#getMatch_Awayteam()
	 * @model required="true"
	 * @generated
	 */
	Team getAwayteam();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Match#getAwayteam <em>Awayteam</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Awayteam</em>' reference.
	 * @see #getAwayteam()
	 * @generated
	 */
	void setAwayteam(Team value);

	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.Project.league.Booking}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' containment reference list.
	 * @see TDT4250.Project.league.LeaguePackage#getMatch_Bookings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Booking> getBookings();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see TDT4250.Project.league.LeaguePackage#getMatch_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Match#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Homegoals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Homegoals</em>' attribute.
	 * @see #setHomegoals(int)
	 * @see TDT4250.Project.league.LeaguePackage#getMatch_Homegoals()
	 * @model
	 * @generated
	 */
	int getHomegoals();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Match#getHomegoals <em>Homegoals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Homegoals</em>' attribute.
	 * @see #getHomegoals()
	 * @generated
	 */
	void setHomegoals(int value);

	/**
	 * Returns the value of the '<em><b>Avaygoals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avaygoals</em>' attribute.
	 * @see #setAvaygoals(int)
	 * @see TDT4250.Project.league.LeaguePackage#getMatch_Avaygoals()
	 * @model
	 * @generated
	 */
	int getAvaygoals();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Match#getAvaygoals <em>Avaygoals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avaygoals</em>' attribute.
	 * @see #getAvaygoals()
	 * @generated
	 */
	void setAvaygoals(int value);

	/**
	 * Returns the value of the '<em><b>Referee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referee</em>' attribute.
	 * @see #setReferee(String)
	 * @see TDT4250.Project.league.LeaguePackage#getMatch_Referee()
	 * @model
	 * @generated
	 */
	String getReferee();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Match#getReferee <em>Referee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referee</em>' attribute.
	 * @see #getReferee()
	 * @generated
	 */
	void setReferee(String value);

} // Match
