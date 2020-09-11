import java.util.Objects;
import java.util.HashSet;

public class SumOfTerms implements AlgebraicExpression {
    final private HashSet<CompositeTerm> theSum;

    /** @param theSum is a set of all terms in the sum.*/
    public SumOfTerms(HashSet<CompositeTerm> theSum) {
        this.theSum = theSum;
    }

    /** Creates an empty sum of terms. */
    public SumOfTerms() {
        this.theSum = new HashSet<>();
    }

    /** Returns a set of all terms in the sum. */
    public final HashSet<CompositeTerm> getSumSet() {
        return new HashSet<>(theSum);
    }

    /** Returns a term in the sum that can be added to the given parameter to produce a CompositeTerm
     * (rather than a sum of terms), or returns null if no such term exists. */
    public CompositeTerm findComparable(CompositeTerm x) {
        boolean found = false;
        CompositeTerm comparableTerm = null;
        for (CompositeTerm i : getSumSet()) {
            if (!found && i.isComparable(x)) {
                found = true;
                comparableTerm = i;
            }
        }
        return comparableTerm;
    }

    public SumOfTerms plusIncomparable(CompositeTerm otherTerm) {
        var newSet = getSumSet();
        newSet.add(otherTerm);
        return new SumOfTerms(newSet);
    }

    public SumOfTerms multiply(CompositeTerm t) {
        var newTermSet = new HashSet<CompositeTerm>();
        for (CompositeTerm i : getSumSet()) {
            newTermSet.add(i.multiply(t));
        }
        return new SumOfTerms(newTermSet);
    }

    public SumOfTerms multiplyWithoutSimplifying(SumOfTerms sum2) {
        var newTermSet = new HashSet<CompositeTerm>();
        for (CompositeTerm i : getSumSet()) {
            for (CompositeTerm j : sum2.getSumSet()) {
                newTermSet.add(i.multiply(j));
            }
        }
        return new SumOfTerms(newTermSet);
    }

    public SumOfTerms multiplyAndSimplify(SumOfTerms sum2) {
        var sumSoFar = new SumOfTerms(new HashSet<>());
        for (CompositeTerm i : getSumSet()) {
            for (CompositeTerm j : sum2.getSumSet()) {
                sumSoFar = sumSoFar.plus(i.multiply(j));
            }
        }
        return sumSoFar;
    }

    public SumOfTerms simplify() {
        return null;
    }

    @Override
    public SumOfTerms plus(SumOfTerms otherTerm) {
        var sumSoFar = new HashSet<CompositeTerm>();
        var unpairedTerms = otherTerm.getSumSet();
        for (CompositeTerm x : getSumSet()) {
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

    @Override
    public String toString() {
        return theSum.toString();
    }

    public SumOfTerms plus(CompositeTerm otherTerm) {
        return otherTerm.plus(this);
    }
}
