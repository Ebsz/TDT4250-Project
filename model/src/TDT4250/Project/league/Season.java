/**
 */
package TDT4250.Project.league;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.Season#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.Project.league.Season#getMatchweeks <em>Matchweeks</em>}</li>
 *   <li>{@link TDT4250.Project.league.Season#getStanding <em>Standing</em>}</li>
 * </ul>
 *
 * @see TDT4250.Project.league.LeaguePackage#getSeason()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correctNumberOfMatchesPerSeason'"
 * @generated
 */
public interface Season extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TDT4250.Project.league.LeaguePackage#getSeason_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Season#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Matchweeks</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.Project.league.Matchweek}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchweeks</em>' containment reference list.
	 * @see TDT4250.Project.league.LeaguePackage#getSeason_Matchweeks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Matchweek> getMatchweeks();

	/**
	 * Returns the value of the '<em><b>Standing</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.Project.league.Standing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standing</em>' containment reference list.
	 * @see TDT4250.Project.league.LeaguePackage#getSeason_Standing()
	 * @model containment="true"
	 * @generated
	 */
	EList<Standing> getStanding();

} // Season
