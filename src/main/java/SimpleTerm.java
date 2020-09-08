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

    private SimpleTerm sumWithComparable(Term otherTerm) {
        var theOtherTerm = (SimpleTerm) otherTerm;
        return new SimpleTerm(symbol, quantity + theOtherTerm.quantity, exponent);
    }

    SumOfTerms sumWithIncomparable(SimpleTerm otherTerm) {
        var sum = new HashSet<Term>();
        sum.add(this);
        sum.add(otherTerm);
        return new SumOfTerms(sum);
    }

    AlgebraicExpression sumWith(SimpleTerm otherTerm){
        if (isComparable(otherTerm)) {
            return sumWithComparable(otherTerm);
        }
        else {
            return sumWithIncomparable(otherTerm);
        }
    }

    public SumOfTerms sumWith(SumOfTerms otherTerm) {
        var sumSoFar = new SumOfTerms();
        boolean hasOtherTermBeenAdded = false;
        for (Term x : otherTerm.getSet()) {
            if (!hasOtherTermBeenAdded && isComparable(x)) { //Add 'otherTerm' to its comparable term
                var mergedTerm = sumWithComparable(x);
                sumSoFar = sumSoFar.sumWithIncomparable(mergedTerm);
                hasOtherTermBeenAdded = true; // If 'otherTerm' has already been added, we need not add it again
            } else {
                // Keep x unchanged in the new sum
                sumSoFar = sumSoFar.sumWithIncomparable(x);
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
