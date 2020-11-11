/**
 */
package TDT4250.Project.league.impl;

import TDT4250.Project.league.Booking;
import TDT4250.Project.league.LeaguePackage;
import TDT4250.Project.league.Match;
import TDT4250.Project.league.Team;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.impl.MatchImpl#getHometeam <em>Hometeam</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.MatchImpl#getAwayteam <em>Awayteam</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.MatchImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.MatchImpl#getDate <em>Date</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.MatchImpl#getHomegoals <em>Homegoals</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.MatchImpl#getAvaygoals <em>Avaygoals</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.MatchImpl#getReferee <em>Referee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The cached value of the '{@link #getHometeam() <em>Hometeam</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHometeam()
	 * @generated
	 * @ordered
	 */
	protected Team hometeam;

	/**
	 * The cached value of the '{@link #getAwayteam() <em>Awayteam</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayteam()
	 * @generated
	 * @ordered
	 */
	protected Team awayteam;

	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList bookings;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHomegoals() <em>Homegoals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomegoals()
	 * @generated
	 * @ordered
	 */
	protected static final int HOMEGOALS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHomegoals() <em>Homegoals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomegoals()
	 * @generated
	 * @ordered
	 */
	protected int homegoals = HOMEGOALS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvaygoals() <em>Avaygoals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvaygoals()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAYGOALS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvaygoals() <em>Avaygoals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvaygoals()
	 * @generated
	 * @ordered
	 */
	protected int avaygoals = AVAYGOALS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferee() <em>Referee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferee()
	 * @generated
	 * @ordered
	 */
	protected static final String REFEREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferee() <em>Referee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferee()
	 * @generated
	 * @ordered
	 */
	protected String referee = REFEREE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LeaguePackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getHometeam() {
		if (hometeam != null && hometeam.eIsProxy()) {
			InternalEObject oldHometeam = (InternalEObject)hometeam;
			hometeam = (Team)eResolveProxy(oldHometeam);
			if (hometeam != oldHometeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeaguePackage.MATCH__HOMETEAM, oldHometeam, hometeam));
			}
		}
		return hometeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetHometeam() {
		return hometeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHometeam(Team newHometeam) {
		Team oldHometeam = hometeam;
		hometeam = newHometeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.MATCH__HOMETEAM, oldHometeam, hometeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getAwayteam() {
		if (awayteam != null && awayteam.eIsProxy()) {
			InternalEObject oldAwayteam = (InternalEObject)awayteam;
			awayteam = (Team)eResolveProxy(oldAwayteam);
			if (awayteam != oldAwayteam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeaguePackage.MATCH__AWAYTEAM, oldAwayteam, awayteam));
			}
		}
		return awayteam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetAwayteam() {
		return awayteam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwayteam(Team newAwayteam) {
		Team oldAwayteam = awayteam;
		awayteam = newAwayteam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.MATCH__AWAYTEAM, oldAwayteam, awayteam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBookings() {
		if (bookings == null) {
			bookings = new EObjectContainmentEList(Booking.class, this, LeaguePackage.MATCH__BOOKINGS);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.MATCH__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHomegoals() {
		return homegoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomegoals(int newHomegoals) {
		int oldHomegoals = homegoals;
		homegoals = newHomegoals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.MATCH__HOMEGOALS, oldHomegoals, homegoals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAvaygoals() {
		return avaygoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvaygoals(int newAvaygoals) {
		int oldAvaygoals = avaygoals;
		avaygoals = newAvaygoals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.MATCH__AVAYGOALS, oldAvaygoals, avaygoals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferee() {
		return referee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferee(String newReferee) {
		String oldReferee = referee;
		referee = newReferee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.MATCH__REFEREE, oldReferee, referee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeaguePackage.MATCH__BOOKINGS:
				return ((InternalEList)getBookings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LeaguePackage.MATCH__HOMETEAM:
				if (resolve) return getHometeam();
				return basicGetHometeam();
			case LeaguePackage.MATCH__AWAYTEAM:
				if (resolve) return getAwayteam();
				return basicGetAwayteam();
			case LeaguePackage.MATCH__BOOKINGS:
				return getBookings();
			case LeaguePackage.MATCH__DATE:
				return getDate();
			case LeaguePackage.MATCH__HOMEGOALS:
				return new Integer(getHomegoals());
			case LeaguePackage.MATCH__AVAYGOALS:
				return new Integer(getAvaygoals());
			case LeaguePackage.MATCH__REFEREE:
				return getReferee();
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
			case LeaguePackage.MATCH__HOMETEAM:
				setHometeam((Team)newValue);
				return;
			case LeaguePackage.MATCH__AWAYTEAM:
				setAwayteam((Team)newValue);
				return;
			case LeaguePackage.MATCH__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection)newValue);
				return;
			case LeaguePackage.MATCH__DATE:
				setDate((Date)newValue);
				return;
			case LeaguePackage.MATCH__HOMEGOALS:
				setHomegoals(((Integer)newValue).intValue());
				return;
			case LeaguePackage.MATCH__AVAYGOALS:
				setAvaygoals(((Integer)newValue).intValue());
				return;
			case LeaguePackage.MATCH__REFEREE:
				setReferee((String)newValue);
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
			case LeaguePackage.MATCH__HOMETEAM:
				setHometeam((Team)null);
				return;
			case LeaguePackage.MATCH__AWAYTEAM:
				setAwayteam((Team)null);
				return;
			case LeaguePackage.MATCH__BOOKINGS:
				getBookings().clear();
				return;
			case LeaguePackage.MATCH__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case LeaguePackage.MATCH__HOMEGOALS:
				setHomegoals(HOMEGOALS_EDEFAULT);
				return;
			case LeaguePackage.MATCH__AVAYGOALS:
				setAvaygoals(AVAYGOALS_EDEFAULT);
				return;
			case LeaguePackage.MATCH__REFEREE:
				setReferee(REFEREE_EDEFAULT);
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
			case LeaguePackage.MATCH__HOMETEAM:
				return hometeam != null;
			case LeaguePackage.MATCH__AWAYTEAM:
				return awayteam != null;
			case LeaguePackage.MATCH__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
			case LeaguePackage.MATCH__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case LeaguePackage.MATCH__HOMEGOALS:
				return homegoals != HOMEGOALS_EDEFAULT;
			case LeaguePackage.MATCH__AVAYGOALS:
				return avaygoals != AVAYGOALS_EDEFAULT;
			case LeaguePackage.MATCH__REFEREE:
				return REFEREE_EDEFAULT == null ? referee != null : !REFEREE_EDEFAULT.equals(referee);
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
		result.append(" (Date: ");
		result.append(date);
		result.append(", Homegoals: ");
		result.append(homegoals);
		result.append(", Avaygoals: ");
		result.append(avaygoals);
		result.append(", Referee: ");
		result.append(referee);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
