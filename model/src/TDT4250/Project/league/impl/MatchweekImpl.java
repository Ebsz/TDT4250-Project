/**
 */
package TDT4250.Project.league.impl;

import TDT4250.Project.league.LeaguePackage;
import TDT4250.Project.league.Match;
import TDT4250.Project.league.Matchweek;

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
 * An implementation of the model object '<em><b>Matchweek</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TDT4250.Project.league.impl.MatchweekImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link TDT4250.Project.league.impl.MatchweekImpl#getMatchweek <em>Matchweek</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchweekImpl extends MinimalEObjectImpl.Container implements Matchweek {
	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList matches;

	/**
	 * The default value of the '{@link #getMatchweek() <em>Matchweek</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchweek()
	 * @generated
	 * @ordered
	 */
	protected static final int MATCHWEEK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatchweek() <em>Matchweek</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchweek()
	 * @generated
	 * @ordered
	 */
	protected int matchweek = MATCHWEEK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchweekImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LeaguePackage.Literals.MATCHWEEK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMatches() {
		if (matches == null) {
			matches = new EObjectContainmentEList(Match.class, this, LeaguePackage.MATCHWEEK__MATCHES);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMatchweek() {
		return matchweek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchweek(int newMatchweek) {
		int oldMatchweek = matchweek;
		matchweek = newMatchweek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LeaguePackage.MATCHWEEK__MATCHWEEK, oldMatchweek, matchweek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LeaguePackage.MATCHWEEK__MATCHES:
				return ((InternalEList)getMatches()).basicRemove(otherEnd, msgs);
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
			case LeaguePackage.MATCHWEEK__MATCHES:
				return getMatches();
			case LeaguePackage.MATCHWEEK__MATCHWEEK:
				return new Integer(getMatchweek());
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
			case LeaguePackage.MATCHWEEK__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection)newValue);
				return;
			case LeaguePackage.MATCHWEEK__MATCHWEEK:
				setMatchweek(((Integer)newValue).intValue());
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
			case LeaguePackage.MATCHWEEK__MATCHES:
				getMatches().clear();
				return;
			case LeaguePackage.MATCHWEEK__MATCHWEEK:
				setMatchweek(MATCHWEEK_EDEFAULT);
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
			case LeaguePackage.MATCHWEEK__MATCHES:
				return matches != null && !matches.isEmpty();
			case LeaguePackage.MATCHWEEK__MATCHWEEK:
				return matchweek != MATCHWEEK_EDEFAULT;
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
		result.append(" (matchweek: ");
		result.append(matchweek);
		result.append(')');
		return result.toString();
	}

} //MatchweekImpl
