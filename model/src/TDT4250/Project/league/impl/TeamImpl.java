/**
 */
package TDT4250.Project.league.impl;

import TDT4250.Project.league.LeaguePackage;
import TDT4250.Project.league.Player;
import TDT4250.Project.league.Team;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.impl.TeamImpl#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.TeamImpl#getOwnedPlayer <em>Owned Player</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.TeamImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.TeamImpl#getStadium <em>Stadium</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends MinimalEObjectImpl.Container implements Team {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedPlayer() <em>Owned Player</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPlayer()
	 * @generated
	 * @ordered
	 */
	protected EList ownedPlayer;

	/**
	 * The default value of the '{@link #getAbbr() <em>Abbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbr()
	 * @generated
	 * @ordered
	 */
	protected static final String ABBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbbr() <em>Abbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbr()
	 * @generated
	 * @ordered
	 */
	protected String abbr = ABBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStadium() <em>Stadium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadium()
	 * @generated
	 * @ordered
	 */
	protected static final String STADIUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStadium() <em>Stadium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadium()
	 * @generated
	 * @ordered
	 */
	protected String stadium = STADIUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LeaguePackage.Literals.TEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.TEAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedPlayer() {
		if (ownedPlayer == null) {
			ownedPlayer = new EObjectContainmentEList(Player.class, this, LeaguePackage.TEAM__OWNED_PLAYER);
		}
		return ownedPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbbr() {
		return abbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbbr(String newAbbr) {
		String oldAbbr = abbr;
		abbr = newAbbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.TEAM__ABBR, oldAbbr, abbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStadium() {
		return stadium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStadium(String newStadium) {
		String oldStadium = stadium;
		stadium = newStadium;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.TEAM__STADIUM, oldStadium, stadium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeaguePackage.TEAM__OWNED_PLAYER:
				return ((InternalEList)getOwnedPlayer()).basicRemove(otherEnd, msgs);
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
			case LeaguePackage.TEAM__NAME:
				return getName();
			case LeaguePackage.TEAM__OWNED_PLAYER:
				return getOwnedPlayer();
			case LeaguePackage.TEAM__ABBR:
				return getAbbr();
			case LeaguePackage.TEAM__STADIUM:
				return getStadium();
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
			case LeaguePackage.TEAM__NAME:
				setName((String)newValue);
				return;
			case LeaguePackage.TEAM__OWNED_PLAYER:
				getOwnedPlayer().clear();
				getOwnedPlayer().addAll((Collection)newValue);
				return;
			case LeaguePackage.TEAM__ABBR:
				setAbbr((String)newValue);
				return;
			case LeaguePackage.TEAM__STADIUM:
				setStadium((String)newValue);
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
			case LeaguePackage.TEAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LeaguePackage.TEAM__OWNED_PLAYER:
				getOwnedPlayer().clear();
				return;
			case LeaguePackage.TEAM__ABBR:
				setAbbr(ABBR_EDEFAULT);
				return;
			case LeaguePackage.TEAM__STADIUM:
				setStadium(STADIUM_EDEFAULT);
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
			case LeaguePackage.TEAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LeaguePackage.TEAM__OWNED_PLAYER:
				return ownedPlayer != null && !ownedPlayer.isEmpty();
			case LeaguePackage.TEAM__ABBR:
				return ABBR_EDEFAULT == null ? abbr != null : !ABBR_EDEFAULT.equals(abbr);
			case LeaguePackage.TEAM__STADIUM:
				return STADIUM_EDEFAULT == null ? stadium != null : !STADIUM_EDEFAULT.equals(stadium);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Abbr: ");
		result.append(abbr);
		result.append(", Stadium: ");
		result.append(stadium);
		result.append(')');
		return result.toString();
	}

} //TeamImpl
