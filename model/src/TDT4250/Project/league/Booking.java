/**
 */
package TDT4250.Project.league;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.Booking#getBookedPlayer <em>Booked Player</em>}</li>
 *   <li>{@link TDT4250.Project.league.Booking#getType <em>Type</em>}</li>
 *   <li>{@link TDT4250.Project.league.Booking#getMinute <em>Minute</em>}</li>
 * </ul>
 *
 * @see TDT4250.Project.league.LeaguePackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Booked Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booked Player</em>' reference.
	 * @see #setBookedPlayer(Player)
	 * @see TDT4250.Project.league.LeaguePackage#getBooking_BookedPlayer()
	 * @model
	 * @generated
	 */
	Player getBookedPlayer();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Booking#getBookedPlayer <em>Booked Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booked Player</em>' reference.
	 * @see #getBookedPlayer()
	 * @generated
	 */
	void setBookedPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link TDT4250.Project.league.BookingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see TDT4250.Project.league.BookingType
	 * @see #setType(BookingType)
	 * @see TDT4250.Project.league.LeaguePackage#getBooking_Type()
	 * @model required="true"
	 * @generated
	 */
	BookingType getType();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Booking#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see TDT4250.Project.league.BookingType
	 * @see #getType()
	 * @generated
	 */
	void setType(BookingType value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(int)
	 * @see TDT4250.Project.league.LeaguePackage#getBooking_Minute()
	 * @model
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link TDT4250.Project.league.Booking#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(int value);

} // Booking
