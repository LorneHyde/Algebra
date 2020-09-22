package algebra;

import java.util.Objects;

public class SimpleTerm {
    final private char symbol;
    final private int exponent;

    /**
     * @param symbol      A single unicode character to represent the variable in this term.
     * @param exponent    The power to which this variable is raised.
     */
    public SimpleTerm(char symbol, int exponent) {
        this.symbol = symbol;
        this.exponent = exponent;
    }

    /**
     * The coefficient and exponent are assigned to 1 if not otherwise specified.
     * @param symbol A single unicode character to represent the variable in this term.
     */
    public SimpleTerm(char symbol) {
        this.symbol = symbol;
        this.exponent = 1;
    }

    /** Returns the symbol for the variable that this term represents.
     * For instance, when applied to x^2 it would return x.*/
    public char getSymbol() {
        return symbol;
    }

    /** Returns the exponent that this term is raised to.
     * For instance, when applied to x^2 it would return 2.*/
    public int getExponent() {
        return exponent;
    }

    /** Returns whether the variable is raised to a non-zero power (this power may be 1 or greater).*/
    public boolean notSimpleNumber() {
        return exponent != 0;
    }

    /**
     * Returns whether the other term is comparable to this term. Comparable terms can be added together by simply
     * adding their coefficients, rather than making a SumOfTerms object.
     */
    public boolean isComparable(SimpleTerm otherTerm) {
        return symbol == otherTerm.symbol && exponent == otherTerm.exponent;
    }

    /** When supplied with a SimpleTerm with the same symbol, returns the product of this term and the argument term.
     * @throws IllegalArgumentException if the symbol is not the same. */
    public SimpleTerm multiplyWithSameSymbol(SimpleTerm otherTerm) {
        if (symbol == otherTerm.getSymbol()) {
            return new SimpleTerm(symbol, exponent + otherTerm.exponent);
        }
        else {
            throw new IllegalArgumentException(symbol + " is not the same symbol as " + otherTerm.getSymbol());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        else {
            var otherTerm = (SimpleTerm) o;
            return symbol == otherTerm.symbol &&
                    exponent == otherTerm.exponent;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, exponent);
    }

    @Override
    public String toString() {
        if(exponent == 1) {
            return String.valueOf(symbol);
        }
        return symbol + "^" + exponent;
    }
}
