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

    public SumOfTerms add(SimpleTerm other) {
        return other.sumWith(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SumOfTerms that = (SumOfTerms) o;
        return Objects.equals(theSum, that.theSum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theSum);
    }
}
