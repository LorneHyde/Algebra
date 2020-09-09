import java.util.Objects;
import java.util.HashSet;

public class SumOfTerms implements AlgebraicExpression {
    final private HashSet<CompositeTerm> theSum;

    public SumOfTerms(HashSet<CompositeTerm> theSum) {
        this.theSum = theSum;
    }

    public SumOfTerms() {
        this.theSum = new HashSet<>();
    }

    public final HashSet<CompositeTerm> getSet() {
        return theSum;
    }

    public SumOfTerms plus(TermWithCoefficient otherTerm) {
        return otherTerm.plus(this);
    }

    public CompositeTerm findComparable(CompositeTerm x) {
        boolean found = false;
        CompositeTerm comparableTerm = null;
        for (CompositeTerm i : getSet()) {
            if (!found && i.isComparable(x)) {
                found = true;
                comparableTerm = i;
            }
        }
        return comparableTerm;
    }

    public SumOfTerms plusIncomparable(CompositeTerm otherTerm) {
        var newSet = new HashSet<>(getSet());
        newSet.add(otherTerm);
        return new SumOfTerms(newSet);
    }

    @Override
    public SumOfTerms plus(SumOfTerms otherTerm) {
        var sumSoFar = new HashSet<CompositeTerm>();
        var unpairedTerms = otherTerm.getSet();
        for (CompositeTerm x : getSet()) {
            var comparableTerm = otherTerm.findComparable(x);
            if (comparableTerm == null) {
                sumSoFar.add(x);
            }
            else {
                sumSoFar.add(x.plusComparable(comparableTerm));
                unpairedTerms.remove(comparableTerm);
            }
        }
        sumSoFar.addAll(unpairedTerms);
        return new SumOfTerms(sumSoFar);
    }

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

    public SumOfTerms plus(CompositeTerm otherTerm) {
        return otherTerm.plus(this);
    }
}
