/**
 */
package TDT4250.Project.league.impl;

import TDT4250.Project.league.LeaguePackage;
import TDT4250.Project.league.Matchweek;
import TDT4250.Project.league.Season;
import TDT4250.Project.league.Standing;

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
 * An implementation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.impl.SeasonImpl#getName <em>Name</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.SeasonImpl#getMatchweeks <em>Matchweeks</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.SeasonImpl#getStanding <em>Standing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeasonImpl extends MinimalEObjectImpl.Container implements Season {
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
	 * The cached value of the '{@link #getMatchweeks() <em>Matchweeks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchweeks()
	 * @generated
	 * @ordered
	 */
	protected EList matchweeks;

	/**
	 * The cached value of the '{@link #getStanding() <em>Standing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStanding()
	 * @generated
	 * @ordered
	 */
	protected EList standing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LeaguePackage.Literals.SEASON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.SEASON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMatchweeks() {
		if (matchweeks == null) {
			matchweeks = new EObjectContainmentEList(Matchweek.class, this, LeaguePackage.SEASON__MATCHWEEKS);
		}
		return matchweeks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStanding() {
		if (standing == null) {
			standing = new EObjectContainmentEList(Standing.class, this, LeaguePackage.SEASON__STANDING);
		}
		return standing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeaguePackage.SEASON__MATCHWEEKS:
				return ((InternalEList)getMatchweeks()).basicRemove(otherEnd, msgs);
			case LeaguePackage.SEASON__STANDING:
				return ((InternalEList)getStanding()).basicRemove(otherEnd, msgs);
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
			case LeaguePackage.SEASON__NAME:
				return getName();
			case LeaguePackage.SEASON__MATCHWEEKS:
				return getMatchweeks();
			case LeaguePackage.SEASON__STANDING:
				return getStanding();
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
			case LeaguePackage.SEASON__NAME:
				setName((String)newValue);
				return;
			case LeaguePackage.SEASON__MATCHWEEKS:
				getMatchweeks().clear();
				getMatchweeks().addAll((Collection)newValue);
				return;
			case LeaguePackage.SEASON__STANDING:
				getStanding().clear();
				getStanding().addAll((Collection)newValue);
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
			case LeaguePackage.SEASON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LeaguePackage.SEASON__MATCHWEEKS:
				getMatchweeks().clear();
				return;
			case LeaguePackage.SEASON__STANDING:
				getStanding().clear();
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
			case LeaguePackage.SEASON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LeaguePackage.SEASON__MATCHWEEKS:
				return matchweeks != null && !matchweeks.isEmpty();
			case LeaguePackage.SEASON__STANDING:
				return standing != null && !standing.isEmpty();
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

} //SeasonImpl
