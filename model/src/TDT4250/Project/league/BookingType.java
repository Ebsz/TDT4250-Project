/**
 */
package TDT4250.Project.league;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Booking Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TDT4250.Project.league.LeaguePackage#getBookingType()
 * @model
 * @generated
 */
public final class BookingType extends AbstractEnumerator {
	/**
	 * The '<em><b>Red Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_CARD_LITERAL
	 * @model name="RedCard"
	 * @generated
	 * @ordered
	 */
	public static final int RED_CARD = 1;

	/**
	 * The '<em><b>Yellow Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW_CARD_LITERAL
	 * @model name="YellowCard"
	 * @generated
	 * @ordered
	 */
	public static final int YELLOW_CARD = 2;

	/**
	 * The '<em><b>Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL_LITERAL
	 * @model name="Goal"
	 * @generated
	 * @ordered
	 */
	public static final int GOAL = 3;

	/**
	 * The '<em><b>Own Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWN_GOAL_LITERAL
	 * @model name="OwnGoal"
	 * @generated
	 * @ordered
	 */
	public static final int OWN_GOAL = 4;

	/**
	 * The '<em><b>Red Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_CARD
	 * @generated
	 * @ordered
	 */
	public static final BookingType RED_CARD_LITERAL = new BookingType(RED_CARD, "RedCard", "RedCard");

	/**
	 * The '<em><b>Yellow Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW_CARD
	 * @generated
	 * @ordered
	 */
	public static final BookingType YELLOW_CARD_LITERAL = new BookingType(YELLOW_CARD, "YellowCard", "YellowCard");

	/**
	 * The '<em><b>Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL
	 * @generated
	 * @ordered
	 */
	public static final BookingType GOAL_LITERAL = new BookingType(GOAL, "Goal", "Goal");

	/**
	 * The '<em><b>Own Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWN_GOAL
	 * @generated
	 * @ordered
	 */
	public static final BookingType OWN_GOAL_LITERAL = new BookingType(OWN_GOAL, "OwnGoal", "OwnGoal");

	/**
	 * An array of all the '<em><b>Booking Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BookingType[] VALUES_ARRAY =
		new BookingType[] {
			RED_CARD_LITERAL,
			YELLOW_CARD_LITERAL,
			GOAL_LITERAL,
			OWN_GOAL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Booking Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Booking Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BookingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BookingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Booking Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BookingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BookingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Booking Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BookingType get(int value) {
		switch (value) {
			case RED_CARD: return RED_CARD_LITERAL;
			case YELLOW_CARD: return YELLOW_CARD_LITERAL;
			case GOAL: return GOAL_LITERAL;
			case OWN_GOAL: return OWN_GOAL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BookingType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //BookingType
