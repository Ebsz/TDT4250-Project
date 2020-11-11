/**
 */
package TDT4250.Project.league;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>League</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.League#getSeason <em>Season</em>}</li>
 *   <li>{@link TDT4250.Project.league.League#getTeams <em>Teams</em>}</li>
 *   <li>{@link TDT4250.Project.league.League#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see TDT4250.Project.league.LeaguePackage#getLeague()
 * @model
 * @generated
 */
public interface League extends EObject {
	/**
	 * Returns the value of the '<em><b>Season</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.Project.league.Season}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' containment reference list.
	 * @see TDT4250.Project.league.LeaguePackage#getLeague_Season()
	 * @model type="TDT4250.Project.league.Season" containment="true"
	 * @generated
	 */
	EList getSeason();

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link TDT4250.Project.league.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see TDT4250.Project.league.LeaguePackage#getLeague_Teams()
	 * @model type="TDT4250.Project.league.Team" containment="true"
	 * @generated
	 */
	EList getTeams();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TDT4250.Project.league.LeaguePackage#getLeague_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.League#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // League
