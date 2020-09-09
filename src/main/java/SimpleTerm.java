import java.util.HashSet;
import java.util.Objects;

/**
 * A class to represent an algebraic variable with a coefficient and exponent.
 */
public class SimpleTerm implements Term {
    final private char symbol;
    final private int coefficient;
    final private int exponent;
    final private HashSet<SimpleTermWithoutExponent> termInSet;

    /**
     * @param symbol      A single unicode character to represent the variable in this term.
     * @param coefficient The number multiplied by this variable.
     * @param exponent    The power to which this variable is raised.
     */
    public SimpleTerm(char symbol, int coefficient, int exponent) {
        this.symbol = symbol;
        this.coefficient = coefficient;
        this.exponent = exponent;
        termInSet = new HashSet<>();
        termInSet.add(new SimpleTermWithoutExponent(symbol, exponent));
    }

    /**
     * The coefficient and exponent are assigned to 1 if not otherwise specified.
     *
     * @param symbol A single unicode character to represent the variable in this term.
     */
    public SimpleTerm(char symbol) {
        this.symbol = symbol;
        this.coefficient = 1;
        this.exponent = 1;
        termInSet = new HashSet<>();
        termInSet.add(new SimpleTermWithoutExponent(symbol, exponent));
    }

    public char getSymbol() {
        return symbol;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public int getExponent() {
        return exponent;
    }

    /**
     * Adds this term to a comparable SimpleTerm.
     */
    public SimpleTerm plusComparable(Term otherTerm) {
        if (!isComparable(otherTerm)) {
            throw new IllegalArgumentException("plusComparable was called on incomparable term.");
        }
        var theOtherTerm = (SimpleTerm) otherTerm;
        return new SimpleTerm(symbol, coefficient + theOtherTerm.coefficient, exponent);
    }

    @Override
    final public int factorCount() {
        return 1;
    }


    public boolean isComparable(Term otherTerm) {
        if (otherTerm.getSet().size() == 1) {
            var unwrappedOtherTerm = otherTerm.getSet().iterator().next();
            return unwrappedOtherTerm.getExponent() == exponent && unwrappedOtherTerm.getSymbol() == symbol;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleTerm otherTerm = (SimpleTerm) o;
        return symbol == otherTerm.symbol &&
                coefficient == otherTerm.coefficient &&
                exponent == otherTerm.exponent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, coefficient, exponent);
    }

    @Override
    public HashSet<SimpleTermWithoutExponent> getSet() {
        return termInSet;
    }
}
