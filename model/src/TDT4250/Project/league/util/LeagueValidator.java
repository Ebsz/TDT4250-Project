/**
 */
package TDT4250.Project.league.util;

import TDT4250.Project.league.*;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see TDT4250.Project.league.LeaguePackage
 * @generated
 */
public class LeagueValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LeagueValidator INSTANCE = new LeagueValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "TDT4250.Project.league";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeagueValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return LeaguePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case LeaguePackage.LEAGUE:
				return validateLeague((League)value, diagnostics, context);
			case LeaguePackage.SEASON:
				return validateSeason((Season)value, diagnostics, context);
			case LeaguePackage.MATCHWEEK:
				return validateMatchweek((Matchweek)value, diagnostics, context);
			case LeaguePackage.MATCH:
				return validateMatch((Match)value, diagnostics, context);
			case LeaguePackage.TEAM:
				return validateTeam((Team)value, diagnostics, context);
			case LeaguePackage.PLAYER:
				return validatePlayer((Player)value, diagnostics, context);
			case LeaguePackage.BOOKING:
				return validateBooking((Booking)value, diagnostics, context);
			case LeaguePackage.STANDING:
				return validateStanding((Standing)value, diagnostics, context);
			case LeaguePackage.BOOKING_TYPE:
				return validateBookingType((BookingType)value, diagnostics, context);
			case LeaguePackage.POSITION_TYPE:
				return validatePositionType((PositionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeague(League league, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(league, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeason(Season season, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(season, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatchweek(Matchweek matchweek, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(matchweek, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(matchweek, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(matchweek, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(matchweek, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(matchweek, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatchweek_temaPlaysOnlyOneMatchPerWeek(matchweek, diagnostics, context);
		return result;
	}

	/**
	 * Validates the temaPlaysOnlyOneMatchPerWeek constraint of '<em>Matchweek</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatchweek_temaPlaysOnlyOneMatchPerWeek(Matchweek matchweek, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "temaPlaysOnlyOneMatchPerWeek", getObjectLabel(matchweek, context) }),
						 new Object[] { matchweek }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatch(Match match, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(match, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeam(Team team, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(team, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(player, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooking(Booking booking, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(booking, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStanding(Standing standing, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(standing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookingType(BookingType bookingType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType(PositionType positionType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

} //LeagueValidator
