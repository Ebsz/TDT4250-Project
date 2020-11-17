/**
 */
package TDT4250.Project.league;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.Player#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.Project.league.Player#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see TDT4250.Project.league.LeaguePackage#getPlayer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='playerPlaysForOnlyOneTeam'"
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TDT4250.Project.league.LeaguePackage#getPlayer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link TDT4250.Project.league.PositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see TDT4250.Project.league.PositionType
	 * @see #setPosition(PositionType)
	 * @see TDT4250.Project.league.LeaguePackage#getPlayer_Position()
	 * @model transient="true"
	 * @generated
	 */
	PositionType getPosition();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Player#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see TDT4250.Project.league.PositionType
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PositionType value);

} // Player
