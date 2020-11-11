/**
 */
package TDT4250.Project.league;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Booking Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TDT4250.Project.league.LeaguePackage#getBookingType()
 * @model
 * @generated
 */
public enum BookingType implements Enumerator {
	/**
	 * The '<em><b>Red Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_CARD_VALUE
	 * @generated
	 * @ordered
	 */
	RED_CARD(1, "RedCard", "RedCard"),

	/**
	 * The '<em><b>Yellow Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW_CARD_VALUE
	 * @generated
	 * @ordered
	 */
	YELLOW_CARD(2, "YellowCard", "YellowCard"),

	/**
	 * The '<em><b>Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	GOAL(3, "Goal", "Goal"),

	/**
	 * The '<em><b>Own Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWN_GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	OWN_GOAL(4, "OwnGoal", "OwnGoal");

	/**
	 * The '<em><b>Red Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_CARD
	 * @model name="RedCard"
	 * @generated
	 * @ordered
	 */
	public static final int RED_CARD_VALUE = 1;

	/**
	 * The '<em><b>Yellow Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YELLOW_CARD
	 * @model name="YellowCard"
	 * @generated
	 * @ordered
	 */
	public static final int YELLOW_CARD_VALUE = 2;

	/**
	 * The '<em><b>Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL
	 * @model name="Goal"
	 * @generated
	 * @ordered
	 */
	public static final int GOAL_VALUE = 3;

	/**
	 * The '<em><b>Own Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWN_GOAL
	 * @model name="OwnGoal"
	 * @generated
	 * @ordered
	 */
	public static final int OWN_GOAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Booking Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BookingType[] VALUES_ARRAY =
		new BookingType[] {
			RED_CARD,
			YELLOW_CARD,
			GOAL,
			OWN_GOAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Booking Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BookingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case RED_CARD_VALUE: return RED_CARD;
			case YELLOW_CARD_VALUE: return YELLOW_CARD;
			case GOAL_VALUE: return GOAL;
			case OWN_GOAL_VALUE: return OWN_GOAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BookingType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //BookingType
