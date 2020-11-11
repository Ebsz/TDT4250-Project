/**
 */
package TDT4250.Project.league.impl;

import TDT4250.Project.league.League;
import TDT4250.Project.league.LeaguePackage;
import TDT4250.Project.league.Season;
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
 * An implementation of the model object '<em><b>League</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.impl.LeagueImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.LeagueImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.LeagueImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeagueImpl extends MinimalEObjectImpl.Container implements League {
	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected EList season;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList teams;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LeaguePackage.Literals.LEAGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSeason() {
		if (season == null) {
			season = new EObjectContainmentEList(Season.class, this, LeaguePackage.LEAGUE__SEASON);
		}
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentEList(Team.class, this, LeaguePackage.LEAGUE__TEAMS);
		}
		return teams;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.LEAGUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeaguePackage.LEAGUE__SEASON:
				return ((InternalEList)getSeason()).basicRemove(otherEnd, msgs);
			case LeaguePackage.LEAGUE__TEAMS:
				return ((InternalEList)getTeams()).basicRemove(otherEnd, msgs);
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
			case LeaguePackage.LEAGUE__SEASON:
				return getSeason();
			case LeaguePackage.LEAGUE__TEAMS:
				return getTeams();
			case LeaguePackage.LEAGUE__NAME:
				return getName();
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
			case LeaguePackage.LEAGUE__SEASON:
				getSeason().clear();
				getSeason().addAll((Collection)newValue);
				return;
			case LeaguePackage.LEAGUE__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection)newValue);
				return;
			case LeaguePackage.LEAGUE__NAME:
				setName((String)newValue);
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
			case LeaguePackage.LEAGUE__SEASON:
				getSeason().clear();
				return;
			case LeaguePackage.LEAGUE__TEAMS:
				getTeams().clear();
				return;
			case LeaguePackage.LEAGUE__NAME:
				setName(NAME_EDEFAULT);
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
			case LeaguePackage.LEAGUE__SEASON:
				return season != null && !season.isEmpty();
			case LeaguePackage.LEAGUE__TEAMS:
				return teams != null && !teams.isEmpty();
			case LeaguePackage.LEAGUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LeagueImpl
