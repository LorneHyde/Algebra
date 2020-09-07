import java.util.Objects;
import java.util.HashSet;

public class SumOfTerms implements Term {
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
    public boolean isComparable(Term otherTerm) {
        return true;
    }
}
