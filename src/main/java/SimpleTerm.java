import java.util.HashSet;
import java.util.Objects;

public class SimpleTerm implements Term {
    final private char symbol;
    final private int quantity;
    final private int exponent;

    public SimpleTerm(char symbol, int quantity, int exponent) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.exponent = exponent;
    }

    public SimpleTerm(char symbol) {
        this.symbol = symbol;
        this.quantity = 1;
        this.exponent = 1;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getExponent() {
        return exponent;
    }

    public Term sumWith(SimpleTerm other) {
        if (isComparable(other)) {
            return new SimpleTerm(symbol, quantity + other.quantity, exponent);
        } else {
            var sum = new HashSet<Term>();
            sum.add(this);
            sum.add(other);
            return new SumOfTerms(sum);
        }
    }

    public SumOfTerms sumWith(SumOfTerms other) {
        var sumSoFar = new HashSet<Term>();
        boolean isOtherAlreadyAdded = false;
        for (Term x : other.getSet()) {
            if (!isOtherAlreadyAdded && isComparable(x)) { //Add the 'other' term to its comparable term
                sumSoFar.add(sumWith((SimpleTerm) x));
                isOtherAlreadyAdded = true; // If the 'other' term has already been added, we need not add it again
            } else {
                // Keep x unchanged in the new sum
                sumSoFar.add(x);
            }
        }
        return new SumOfTerms(sumSoFar);
    }

    private Boolean isComparable(SimpleTerm other) {
        return other.symbol == symbol && other.exponent == exponent;
    }

    private Boolean isComparable(Term other) {
        return other instanceof SimpleTerm && isComparable((SimpleTerm) other);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleTerm that = (SimpleTerm) o;
        return symbol == that.symbol &&
                quantity == that.quantity &&
                exponent == that.exponent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, quantity, exponent);
    }
}
