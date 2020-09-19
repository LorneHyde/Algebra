import java.util.Iterator;
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

    @Override
    public SumOfTerms multiply(SumOfTerms sum2) {
        var sumSoFar = new SumOfTerms(new HashSet<>());
        for (CompositeTerm i : getSumSet()) {
            for (CompositeTerm j : sum2.getSumSet()) {
                sumSoFar = sumSoFar.plus(i.multiply(j));
            }
        }
        return sumSoFar;
    }

    @Override
    public SumOfTerms asNegative() {
        var newSumSet = getSumSet();
        for (CompositeTerm i : getSumSet()) {
            newSumSet.add(i.asNegative());
        }
        return new SumOfTerms(newSumSet);
    }

    public SumOfTerms simplify() { //TODO: Write a test for this
        var newSum = new SumOfTerms(new HashSet<>());
        for (CompositeTerm i : getSumSet()) {
            newSum = newSum.plus(i);
        }
        return newSum;
    }

    @Override
    public SumOfTerms plus(SumOfTerms otherTerm) {
        var sumSoFar = new HashSet<CompositeTerm>();
        var unpairedTerms = otherTerm.getSumSet();
        for (CompositeTerm x : getSumSet()) {
            if (x.getCoefficient() != 0) {
                var comparableTerm = otherTerm.findComparable(x);
                if (comparableTerm == null) {
                    sumSoFar.add(x);
                }
                else {
                    sumSoFar.add(x.plusComparable(comparableTerm));
                    unpairedTerms.remove(comparableTerm);
                }
            }

        }
        for (CompositeTerm i: unpairedTerms) {
            if (i.getCoefficient() != 0) {
                sumSoFar.add(i);
            }
        }
        return new SumOfTerms(sumSoFar);
    }

    public AlgebraicExpression subtract(CompositeTerm t) {
        return plus(t.asNegative());
    }

    public AlgebraicExpression subtract(SumOfTerms s) {
        return plus(s.asNegative());
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
        Iterator<CompositeTerm> it = theSum.iterator();
        if (! it.hasNext())
            return "";
        StringBuilder sb = new StringBuilder();
        sb.append(it.next());
        for (;;) {
            CompositeTerm t = it.next();
            if(t.getCoefficient() < 0) {
                var termWithoutMinusSign = t.toString().substring(1);
                sb.append(" - " + termWithoutMinusSign);
            }
            else {
                sb.append(" + " + t);
            }
            if (! it.hasNext())
                return sb.toString();
        }
    }

    public SumOfTerms plus(CompositeTerm otherTerm) {
        return otherTerm.plus(this);
    }
}
