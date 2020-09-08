import java.util.Objects;
import java.util.HashSet;

public class SumOfTerms implements AlgebraicExpression, TermSet {
    final private HashSet<Term> theSum;

    public SumOfTerms(HashSet<Term> theSum) {
        this.theSum = theSum;
    }

    public SumOfTerms() {
        this.theSum = new HashSet<>();
    }

    public final HashSet<Term> getSet() {
        return theSum;
    }

    public SumOfTerms plus(SimpleTerm otherTerm) {
        return otherTerm.plus(this);
    }

    public SumOfTerms plusIncomparable(Term otherTerm) {
        var newSet = new HashSet<>(getSet());
        newSet.add(otherTerm);
        return new SumOfTerms(newSet);
    }

    public SumOfTerms plus(SumOfTerms otherTerm) {
        var sumSoFar = new HashSet<Term>();
        var unpairedTerms = otherTerm.getSet();
        for (Term x : getSet()) {
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
    public AlgebraicExpression plus(AlgebraicExpression otherExpression) {
        AlgebraicExpression sum;
        if (otherExpression instanceof SumOfTerms) {
            sum = plus((SumOfTerms) otherExpression);
        }
        else if (otherExpression instanceof Term){
            sum = ((Term) otherExpression).plus(this);
        }
        else {
            throw new IllegalArgumentException("An algebraic expression should only ever be either a Term" +
                    "or a sum of terms.");
        }
        return sum;
    }
}
