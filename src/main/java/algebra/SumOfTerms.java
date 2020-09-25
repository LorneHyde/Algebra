package algebra;

import java.util.Iterator;
import java.util.Objects;
import java.util.HashSet;

/** Represents a sum of CompositeTerms.*/
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

    /** Creates a SumOfTerms containing only the given parameter CompositeTerm.
     * @param c The only term in the sum.*/
    public SumOfTerms(CompositeTerm c) {
        this();
        theSum.add(c);
    }

    /** Returns whether this SumOfTerms represents the number 0.*/
    private boolean isZero() {
        return (getSumSet().size() == 0 | (getSumSet().size() == 1 && giveATerm().getCoefficient() == 0));
    }

    /** {@inheritDoc} */
    @Override
    public final HashSet<CompositeTerm> getSumSet() {
        return new HashSet<>(theSum);
    }

    /** Returns a term in the sum that can be added to the given parameter to produce a CompositeTerm
     * (rather than a sum of terms), or returns null if no such term exists. */
    public CompositeTerm findComparable(CompositeTerm term) {
        boolean found = false;
        CompositeTerm comparableTerm = null;
        for (CompositeTerm i : getSumSet()) {
            if (!found && i.isComparable(term)) {
                found = true;
                comparableTerm = i;
            }
        }
        return comparableTerm;
    }

    /**{@inheritDoc}*/
    @Override
    public SumOfTerms multiply(CompositeTerm term) {
        HashSet<CompositeTerm> newTermSet = new HashSet<>();
        for (CompositeTerm i : getSumSet()) {
            newTermSet.add(i.multiply(term));
        }
        return new SumOfTerms(newTermSet);
    }

    /**{@inheritDoc}*/
    @Override
    public SumOfTerms multiply(SumOfTerms other) {
        SumOfTerms sumSoFar = new SumOfTerms(new HashSet<>());
        for (CompositeTerm i : getSumSet()) {
            for (CompositeTerm j : other.getSumSet()) {
                sumSoFar = sumSoFar.plus(i.multiply(j));
            }
        }
        return sumSoFar;
    }

    /**{@inheritDoc}*/
    @Override
    public SumOfTerms asNegative() {
        HashSet<CompositeTerm> newSumSet = new HashSet<>();
        for (CompositeTerm i : getSumSet()) {
            newSumSet.add(i.asNegative());
        }
        return new SumOfTerms(newSumSet);
    }

    /**{@inheritDoc}*/
    @Override
    public SumOfTerms plus(SumOfTerms other) {
        HashSet<CompositeTerm> sumSoFar = new HashSet<>();
        HashSet<CompositeTerm> unpairedTerms = other.getSumSet();
        for (CompositeTerm x : getSumSet()) {
            if (x.getCoefficient() != 0) {
                CompositeTerm comparableTerm = other.findComparable(x);
                if (comparableTerm == null) {
                    sumSoFar.add(x);
                }
                else {
                    CompositeTerm termToAdd = x.plusComparable(comparableTerm);
                    if (termToAdd.getCoefficient() != 0) {
                        sumSoFar.add(termToAdd);
                    }
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

    /**{@inheritDoc}*/
    public SumOfTerms plus(CompositeTerm term) {
        return term.plus(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SumOfTerms otherTerm = (SumOfTerms) o;
        if (isZero() && otherTerm.isZero()) return true;
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
            return "0";
        StringBuilder sb = new StringBuilder();
        sb.append(it.next());
        it.forEachRemaining((term) -> addTermToSumString(sb, term));
        return sb.toString();
    }

    private void addTermToSumString(StringBuilder sb, CompositeTerm t) {
        if(t.getCoefficient() < 0) {
            String termWithoutMinusSign = t.toString().substring(1);
            sb.append(" - ");
            sb.append(termWithoutMinusSign);
        }
        else {
            sb.append(" + ");
            sb.append(t);
        }
    }
}
