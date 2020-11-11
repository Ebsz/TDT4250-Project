/**
 */
package TDT4250.Project.league.impl;

import TDT4250.Project.league.Booking;
import TDT4250.Project.league.BookingType;
import TDT4250.Project.league.LeaguePackage;
import TDT4250.Project.league.Player;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.impl.BookingImpl#getBookedPlayer <em>Booked Player</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.BookingImpl#getType <em>Type</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.BookingImpl#getMinute <em>Minute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The cached value of the '{@link #getBookedPlayer() <em>Booked Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookedPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player bookedPlayer;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BookingType TYPE_EDEFAULT = BookingType.RED_CARD_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BookingType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected int minute = MINUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LeaguePackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player getBookedPlayer() {
		if (bookedPlayer != null && bookedPlayer.eIsProxy()) {
			InternalEObject oldBookedPlayer = (InternalEObject)bookedPlayer;
			bookedPlayer = (Player)eResolveProxy(oldBookedPlayer);
			if (bookedPlayer != oldBookedPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeaguePackage.BOOKING__BOOKED_PLAYER, oldBookedPlayer, bookedPlayer));
			}
		}
		return bookedPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetBookedPlayer() {
		return bookedPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookedPlayer(Player newBookedPlayer) {
		Player oldBookedPlayer = bookedPlayer;
		bookedPlayer = newBookedPlayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.BOOKING__BOOKED_PLAYER, oldBookedPlayer, bookedPlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BookingType newType) {
		BookingType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.BOOKING__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinute(int newMinute) {
		int oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.BOOKING__MINUTE, oldMinute, minute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeaguePackage.BOOKING__BOOKED_PLAYER:
				if (resolve) return getBookedPlayer();
				return basicGetBookedPlayer();
			case LeaguePackage.BOOKING__TYPE:
				return getType();
			case LeaguePackage.BOOKING__MINUTE:
				return new Integer(getMinute());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LeaguePackage.BOOKING__BOOKED_PLAYER:
				setBookedPlayer((Player)newValue);
				return;
			case LeaguePackage.BOOKING__TYPE:
				setType((BookingType)newValue);
				return;
			case LeaguePackage.BOOKING__MINUTE:
				setMinute(((Integer)newValue).intValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case LeaguePackage.BOOKING__BOOKED_PLAYER:
				setBookedPlayer((Player)null);
				return;
			case LeaguePackage.BOOKING__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case LeaguePackage.BOOKING__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LeaguePackage.BOOKING__BOOKED_PLAYER:
				return bookedPlayer != null;
			case LeaguePackage.BOOKING__TYPE:
				return type != TYPE_EDEFAULT;
			case LeaguePackage.BOOKING__MINUTE:
				return minute != MINUTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Type: ");
		result.append(type);
		result.append(", Minute: ");
		result.append(minute);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
