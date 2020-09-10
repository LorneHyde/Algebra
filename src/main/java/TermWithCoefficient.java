import java.util.HashSet;
import java.util.Objects;

/**
 * A class to represent an algebraic variable with a coefficient and exponent.
 */
public class TermWithCoefficient implements CompositeTerm {
    final private char symbol;
    final private int coefficient;
    final private int exponent;
    final private HashSet<SimpleTerm> termInSet;

    /**
     * @param symbol      A single unicode character to represent the variable in this term.
     * @param coefficient The number multiplied by this variable.
     * @param exponent    The power to which this variable is raised.
     */
    public TermWithCoefficient(char symbol, int coefficient, int exponent) {
        this.symbol = symbol;
        this.coefficient = coefficient;
        this.exponent = exponent;
        termInSet = new HashSet<>();
        termInSet.add(new SimpleTerm(symbol, exponent));
    }

    /**
     * The coefficient and exponent are assigned to 1 if not otherwise specified.
     *
     * @param symbol A single unicode character to represent the variable in this term.
     */
    public TermWithCoefficient(char symbol) {
        this.symbol = symbol;
        this.coefficient = 1;
        this.exponent = 1;
        termInSet = new HashSet<>();
        termInSet.add(new SimpleTerm(symbol, exponent));
    }

    public TermWithCoefficient(SimpleTerm termInside, int coefficient) {
        this(termInside.getSymbol(), coefficient, termInside.getExponent());
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public int getCoefficient() {
        return coefficient;
    }

    public int getExponent() {
        return exponent;
    }

    private boolean sameSymbol(TermWithCoefficient otherTerm) {
        return symbol == otherTerm.symbol;
    }

    @Override
    public TermWithCoefficient plusComparable(CompositeTerm otherTerm) {
        if (!isComparable(otherTerm)) {
            throw new IllegalArgumentException("plusComparable was called on incomparable term.");
        }
        var theOtherTerm = (TermWithCoefficient) otherTerm;
        return new TermWithCoefficient(symbol, coefficient + theOtherTerm.coefficient, exponent);
    }

    @Override
    final public int factorCount() {
        return 1;
    }

    @Override
    public boolean isComparable(CompositeTerm otherTerm) {
        if (otherTerm.getSet().size() == 1) {
            var unwrappedOtherTerm = otherTerm.getSet().iterator().next();
            return unwrappedOtherTerm.getExponent() == exponent && unwrappedOtherTerm.getSymbol() == symbol;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TermWithCoefficient otherTerm = (TermWithCoefficient) o;
        return symbol == otherTerm.symbol &&
                coefficient == otherTerm.coefficient &&
                exponent == otherTerm.exponent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, coefficient, exponent);
    }

    @Override
    public HashSet<SimpleTerm> getSet() {
        return new HashSet<>(termInSet);
    }

    @Override
    public String toString() {
        return coefficient + Character.toString(symbol) + "^" + exponent;
    }
}
