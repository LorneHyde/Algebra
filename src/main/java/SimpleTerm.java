import java.beans.Expression;
import java.util.HashSet;
import java.util.Objects;

/** A class to represent an algebraic variable with a coefficient and exponent.*/
public class SimpleTerm implements Term {
    final private char symbol;
    final private int coefficient;
    final private int exponent;

    public SimpleTerm(char symbol, int coefficient, int exponent) {
        this.symbol = symbol;
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    public SimpleTerm(char symbol) {
        this.symbol = symbol;
        this.coefficient = 1;
        this.exponent = 1;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getcoefficient() {
        return coefficient;
    }

    public int getExponent() {
        return exponent;
    }

    public SimpleTerm plusComparable(Term otherTerm) {
        if (!(otherTerm instanceof SimpleTerm)) {
            throw new IllegalArgumentException("otherTerm must be an instance of SimpleTerm to be comparable.");
        }
        var theOtherTerm = (SimpleTerm) otherTerm;
        return new SimpleTerm(symbol, coefficient + theOtherTerm.coefficient, exponent);
    }



    private boolean isComparable(SimpleTerm otherTerm) {
        return otherTerm.symbol == symbol && otherTerm.exponent == exponent;
    }

    public boolean isComparable(Term otherTerm) {
        return otherTerm instanceof SimpleTerm && isComparable((SimpleTerm) otherTerm);
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
}
