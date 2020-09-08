import java.util.Objects;
import java.util.HashSet;

public class SumOfTerms implements AlgebraicExpression {
    final private HashSet<Term> theSum;

    public SumOfTerms(HashSet<Term> theSum) {
        this.theSum = theSum;
    }

    public SumOfTerms() {
        this.theSum = new HashSet<>();
    }

    final HashSet<Term> getSet() {
        return theSum;
    }

    public SumOfTerms sumWith(SimpleTerm otherTerm) {
        return otherTerm.sumWith(this);
    }

    public SumOfTerms sumWithIncomparable(Term otherTerm) {
        var newSet = new HashSet<>(getSet());
        newSet.add(otherTerm);
        return new SumOfTerms(newSet);
    }

    public SumOfTerms sumWith(SumOfTerms otherTerm) {
        var sumSoFar = new HashSet<Term>();
        var unpairedTerms = otherTerm.getSet();
        for (Term x : getSet()) {
            var comparableTerm = otherTerm.findComparable(x);
            if (comparableTerm == null) {
                sumSoFar.add(x);
            }
            else {
                sumSoFar.add(x.sumWithComparable(comparableTerm));
                unpairedTerms.remove(comparableTerm);
            }
        }
        sumSoFar.addAll(unpairedTerms);
        return new SumOfTerms(sumSoFar);
    }

    private Term findComparable(Term x) {
        boolean found = false;
        Term comparableTerm = null;
        for (Term i : getSet()) {
            if (!found && i.isComparable(x)) {
                found = true;
                comparableTerm = i;
            }
        }
        return comparableTerm;
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
}
