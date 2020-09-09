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

    public char getSymbol() {
        return symbol;
    }

    public int getExponent() {
        return exponent;
    }

    public boolean isComparable(SimpleTerm otherTerm) {
        return symbol == otherTerm.symbol && exponent == otherTerm.exponent;
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
}
