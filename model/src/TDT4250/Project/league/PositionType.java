/**
 */
package TDT4250.Project.league;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Position Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TDT4250.Project.league.LeaguePackage#getPositionType()
 * @model
 * @generated
 */
public enum PositionType implements Enumerator {
	/**
	 * The '<em><b>Keeper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEPER_VALUE
	 * @generated
	 * @ordered
	 */
	KEEPER(1, "Keeper", "Keeper"),

	/**
	 * The '<em><b>Defence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DEFENCE(2, "Defence", "Defence"),

	/**
	 * The '<em><b>Midfield</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDFIELD_VALUE
	 * @generated
	 * @ordered
	 */
	MIDFIELD(3, "Midfield", "Midfield"),

	/**
	 * The '<em><b>Attacker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACKER_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACKER(4, "Attacker", "Attacker");

	/**
	 * The '<em><b>Keeper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEPER
	 * @model name="Keeper"
	 * @generated
	 * @ordered
	 */
	public static final int KEEPER_VALUE = 1;

	/**
	 * The '<em><b>Defence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFENCE
	 * @model name="Defence"
	 * @generated
	 * @ordered
	 */
	public static final int DEFENCE_VALUE = 2;

	/**
	 * The '<em><b>Midfield</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDFIELD
	 * @model name="Midfield"
	 * @generated
	 * @ordered
	 */
	public static final int MIDFIELD_VALUE = 3;

	/**
	 * The '<em><b>Attacker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACKER
	 * @model name="Attacker"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACKER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Position Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PositionType[] VALUES_ARRAY =
		new PositionType[] {
			KEEPER,
			DEFENCE,
			MIDFIELD,
			ATTACKER,
		};

	/**
	 * A public read-only list of all the '<em><b>Position Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PositionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Position Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PositionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PositionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Position Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PositionType get(int value) {
		switch (value) {
			case KEEPER_VALUE: return KEEPER;
			case DEFENCE_VALUE: return DEFENCE;
			case MIDFIELD_VALUE: return MIDFIELD;
			case ATTACKER_VALUE: return ATTACKER;
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
	private PositionType(int value, String name, String literal) {
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
	
} //PositionType
