package music;

/**
 * The Enum AccidentalType represents the possibilities for Accidentals.
 */
public enum AccidentalType {

    /** No accidental applied. */
    NONE,
    /** The natural accidental is applied. */
    NATURAL,
    /**
     * The sharp accidental is applied. To represent a flat accidental,
     * associate a negative value with the sharp accidental.
     */
    SHARP;
}
