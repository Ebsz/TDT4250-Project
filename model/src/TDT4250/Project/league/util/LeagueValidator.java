/**
 */
package TDT4250.Project.league.util;

import TDT4250.Project.league.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.common.util.ResourceLocator;

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
	@Override
	protected EPackage getEPackage() {
	  return LeaguePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	public boolean validateLeague(League league, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(league, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeason(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(season, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(season, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeason_correctNumberOfMatchesPerSeason(season, diagnostics, context);
		return result;
	}

	/**
	 * Validates the correctNumberOfMatchesPerSeason constraint of '<em>Season</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unused")
	public boolean validateSeason_correctNumberOfMatchesPerSeason(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int numberOfTeams = 0;
		int numberOfMatches = 0;
		
		League league = (League) season.eContainer();
		
		// Calculate total number of teams
		for (Team team : league.getTeams()) {
			numberOfTeams += 1;
		}
		
		// Calculate total number of matches
		for (Matchweek matchweek : season.getMatchweeks()) {
			for (Match match : matchweek.getMatches()) {
				numberOfMatches += 1;
			}
		}
		
		if (numberOfTeams != numberOfMatches) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "correctNumberOfMatchesPerSeason", getObjectLabel(season, context) },
						 new Object[] { season },
						 context));
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
	public boolean validateMatchweek(Matchweek matchweek, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(matchweek, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(matchweek, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(matchweek, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(matchweek, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(matchweek, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(matchweek, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(matchweek, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(matchweek, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(matchweek, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatchweek_teamsPlaysOnlyOneMatchPerWeek(matchweek, diagnostics, context);
		return result;
	}

	/**
	 * Validates the temaPlaysOnlyOneMatchPerWeek constraint of '<em>Matchweek</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMatchweek_teamsPlaysOnlyOneMatchPerWeek(Matchweek matchweek, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		Map<Team, String> homeTeams = new HashMap<Team, String>();
		Map<Team, String> awayTeams = new HashMap<Team, String>();
		boolean duplicate = false;
		
		EList<Match> matches = matchweek.getMatches();
		Iterator<Match> itr = matches.iterator();
		while(itr.hasNext() && !duplicate) {
			Match match = (Match) itr.next();
			Team home = match.getHometeam();
			Team away = match.getAwayteam();
			
			if(!homeTeams.containsKey(home)) {
				homeTeams.put(home, "home");
			}
			else {
				duplicate = true;
			}
			
			if(!awayTeams.containsKey(away)) {
				awayTeams.put(away, "away");
			}
			else {
				duplicate = true;
			}
		}
		
		if (duplicate) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic // Team played more than one match during a matchweek", new Object[] { "temaPlaysOnlyOneMatchPerWeek", getObjectLabel(matchweek, context) }),
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
	public boolean validateMatch(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(match, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(match, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatch_onlyOneRedCardPerMatch(match, diagnostics, context);
		return result;
	}

	/**
	 * Validates the onlyOneRedCardPerMatch constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("null")
	public boolean validateMatch_onlyOneRedCardPerMatch(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		Boolean error = false;
		EList<Booking> redCards = null;
		
		for (Booking booking : match.getBookings()) {
			if (booking.getType().getName() == "RedCard") {
				redCards.add(booking);
			}
		}
		
		System.out.println(redCards);
		
		for (Booking bookings : redCards) {
			redCards.remove(bookings);
			for (Booking books : redCards) {
				if(books.getBookedPlayer() == bookings.getBookedPlayer()) {
					error = true;
				}
			}
		}
		
		if (error) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "onlyOneRedCardPerMatch", getObjectLabel(match, context) },
						 new Object[] { match },
						 context));
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
	public boolean validateTeam(Team team, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(team, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(player, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(player, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlayer_playerPlaysForOnlyOneTeam(player, diagnostics, context);
		return result;
	}

	/**
	 * Validates the playerPlaysForOnlyOneTeam constraint of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePlayer_playerPlaysForOnlyOneTeam(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean error = false;
		Team team = (Team) player.eContainer();
		
		// TODO: Er det i det hele tatt mulig å registreres for 2 lag?
		
		if (error) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "playerPlaysForOnlyOneTeam", getObjectLabel(player, context) },
						 new Object[] { player },
						 context));
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
	public boolean validateBooking(Booking booking, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booking, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStanding(Standing standing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookingType(BookingType bookingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType(PositionType positionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //LeagueValidator
