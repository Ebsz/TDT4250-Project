/**
 */
package TDT4250.Project.league;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matchweek</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.Matchweek#getMatches <em>Matches</em>}</li>
 *   <li>{@link TDT4250.Project.league.Matchweek#getMatchweek <em>Matchweek</em>}</li>
 * </ul>
 *
 * @see TDT4250.Project.league.LeaguePackage#getMatchweek()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='temaPlaysOnlyOneMatchPerWeek'"
 * @generated
 */
public interface Matchweek extends EObject {
	/**
	 * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.Project.league.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see TDT4250.Project.league.LeaguePackage#getMatchweek_Matches()
	 * @model type="TDT4250.Project.league.Match" containment="true"
	 * @generated
	 */
	EList getMatches();

	/**
	 * Returns the value of the '<em><b>Matchweek</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchweek</em>' attribute.
	 * @see #setMatchweek(int)
	 * @see TDT4250.Project.league.LeaguePackage#getMatchweek_Matchweek()
	 * @model
	 * @generated
	 */
	int getMatchweek();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Matchweek#getMatchweek <em>Matchweek</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matchweek</em>' attribute.
	 * @see #getMatchweek()
	 * @generated
	 */
	void setMatchweek(int value);

} // Matchweek
