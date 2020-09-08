import java.beans.Expression;
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

    public SimpleTerm plusComparable(Term otherTerm) {
        if (!(otherTerm instanceof SimpleTerm)) {
            throw new IllegalArgumentException("otherTerm must be an instance of SimpleTerm to be comparable.");
        }
        var theOtherTerm = (SimpleTerm) otherTerm;
        return new SimpleTerm(symbol, quantity + theOtherTerm.quantity, exponent);
    }

    SumOfTerms plusIncomparable(SimpleTerm otherTerm) {
        var sum = new HashSet<Term>();
        sum.add(this);
        sum.add(otherTerm);
        return new SumOfTerms(sum);
    }

    AlgebraicExpression plus(SimpleTerm otherTerm){
        if (isComparable(otherTerm)) {
            return plusComparable(otherTerm);
        }
        else {
            return plusIncomparable(otherTerm);
        }
    }

    public SumOfTerms plus(SumOfTerms otherTerm) {
        var sumSoFar = new SumOfTerms();
        boolean hasOtherTermBeenAdded = false;
        for (Term x : otherTerm.getSet()) {
            if (!hasOtherTermBeenAdded && isComparable(x)) { //Add 'otherTerm' to its comparable term
                var mergedTerm = plusComparable(x);
                sumSoFar = sumSoFar.plusIncomparable(mergedTerm);
                hasOtherTermBeenAdded = true; // If 'otherTerm' has already been added, we need not add it again
            } else {
                // Keep x unchanged in the new sum
                sumSoFar = sumSoFar.plusIncomparable(x);
            }
        }
        return sumSoFar;
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
                quantity == otherTerm.quantity &&
                exponent == otherTerm.exponent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, quantity, exponent);
    }
}
