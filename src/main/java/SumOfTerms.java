import java.util.Objects;
import java.util.HashSet;

public class SumOfTerms implements AlgebraicExpression {
    final private HashSet<Term> theSum;

    public SumOfTerms(HashSet<Term> theSum) {
        this.theSum = theSum;
    }

    final HashSet<Term> getSet() {
        return theSum;
    }

    public SumOfTerms sumWith(SimpleTerm otherTerm) {
        return otherTerm.sumWith(this);
    }

    //TODO: fill in missing terms for the commented function below
    /*
    public SumOfTerms sumWith(SumOfTerms otherTerm) {
        var sumSoFar = new HashSet<Term>();
        var unpairedTerms = otherTerm.getSet();
        for (Term x : getSet()) {
            var comparableTerm = otherTerm.findComparable(x);
            if (comparableTerm == null) {
                sumSoFar.add(x);
                unpairedTerms.remove(comparableTerm);
            }
            else {
                sumSoFar.add(x.sumWith(comparableTerm));
            }
        }
        for (Term y : unpairedTerms) {
            sumSoFar.add(y);
        }
        return SumOfTerms(sumSoFar);
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SumOfTerms otherTerm = (SumOfTerms) o;
        return Objects.equals(theSum, otherTerm.theSum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theSum);
    }
}
