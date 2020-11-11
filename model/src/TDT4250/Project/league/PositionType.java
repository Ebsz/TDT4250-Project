/**
 */
package TDT4250.Project.league;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Position Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TDT4250.Project.league.LeaguePackage#getPositionType()
 * @model
 * @generated
 */
public final class PositionType extends AbstractEnumerator {
	/**
	 * The '<em><b>Keeper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEPER_LITERAL
	 * @model name="Keeper"
	 * @generated
	 * @ordered
	 */
	public static final int KEEPER = 1;

	/**
	 * The '<em><b>Defence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFENCE_LITERAL
	 * @model name="Defence"
	 * @generated
	 * @ordered
	 */
	public static final int DEFENCE = 2;

	/**
	 * The '<em><b>Midfield</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDFIELD_LITERAL
	 * @model name="Midfield"
	 * @generated
	 * @ordered
	 */
	public static final int MIDFIELD = 3;

	/**
	 * The '<em><b>Attacker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACKER_LITERAL
	 * @model name="Attacker"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACKER = 4;

	/**
	 * The '<em><b>Keeper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEPER
	 * @generated
	 * @ordered
	 */
	public static final PositionType KEEPER_LITERAL = new PositionType(KEEPER, "Keeper", "Keeper");

	/**
	 * The '<em><b>Defence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFENCE
	 * @generated
	 * @ordered
	 */
	public static final PositionType DEFENCE_LITERAL = new PositionType(DEFENCE, "Defence", "Defence");

	/**
	 * The '<em><b>Midfield</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDFIELD
	 * @generated
	 * @ordered
	 */
	public static final PositionType MIDFIELD_LITERAL = new PositionType(MIDFIELD, "Midfield", "Midfield");

	/**
	 * The '<em><b>Attacker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACKER
	 * @generated
	 * @ordered
	 */
	public static final PositionType ATTACKER_LITERAL = new PositionType(ATTACKER, "Attacker", "Attacker");

	/**
	 * An array of all the '<em><b>Position Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PositionType[] VALUES_ARRAY =
		new PositionType[] {
			KEEPER_LITERAL,
			DEFENCE_LITERAL,
			MIDFIELD_LITERAL,
			ATTACKER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Position Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case KEEPER: return KEEPER_LITERAL;
			case DEFENCE: return DEFENCE_LITERAL;
			case MIDFIELD: return MIDFIELD_LITERAL;
			case ATTACKER: return ATTACKER_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PositionType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PositionType
