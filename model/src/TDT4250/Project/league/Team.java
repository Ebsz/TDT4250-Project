/**
 */
package TDT4250.Project.league;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.Team#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.Project.league.Team#getOwnedPlayer <em>Owned Player</em>}</li>
 *   <li>{@link TDT4250.Project.league.Team#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link TDT4250.Project.league.Team#getStadium <em>Stadium</em>}</li>
 * </ul>
 *
 * @see TDT4250.Project.league.LeaguePackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TDT4250.Project.league.LeaguePackage#getTeam_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Team#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Player</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.Project.league.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Player</em>' containment reference list.
	 * @see TDT4250.Project.league.LeaguePackage#getTeam_OwnedPlayer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Player> getOwnedPlayer();

	/**
	 * Returns the value of the '<em><b>Abbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbr</em>' attribute.
	 * @see #setAbbr(String)
	 * @see TDT4250.Project.league.LeaguePackage#getTeam_Abbr()
	 * @model
	 * @generated
	 */
	String getAbbr();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Team#getAbbr <em>Abbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbr</em>' attribute.
	 * @see #getAbbr()
	 * @generated
	 */
	void setAbbr(String value);

	/**
	 * Returns the value of the '<em><b>Stadium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stadium</em>' attribute.
	 * @see #setStadium(String)
	 * @see TDT4250.Project.league.LeaguePackage#getTeam_Stadium()
	 * @model
	 * @generated
	 */
	String getStadium();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Team#getStadium <em>Stadium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stadium</em>' attribute.
	 * @see #getStadium()
	 * @generated
	 */
	void setStadium(String value);

} // Team
