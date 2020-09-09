import java.util.HashSet;

public interface Term extends AlgebraicExpression {
    /**
     * Returns whether the other term is comparable to this term. Comparable terms can be added together by simply
     * adding their coefficients, rather than making a SumOfTerms object.
     */
    boolean isComparable(Term otherTerm);

    /**
     * Adds this term to a comparable Term of the same class. Should only be called if we are certain that isComparable
     * would return true.
     */
    Term plusComparable(Term comparableTerm);

    int factorCount();

    default SumOfTerms plusIncomparable(Term otherTerm) {
        var sum = new HashSet<Term>();
        sum.add(this);
        sum.add(otherTerm);
        return new SumOfTerms(sum);
    }

    /**
     * Adds this term to the parameter Term, only creating a SumOfTerms if the result cannot possibly be expressed
     * as a Term.
     */
    default AlgebraicExpression plus(Term otherTerm) {
        if (isComparable(otherTerm)) {
            return plusComparable(otherTerm);
        } else {
            return plusIncomparable(otherTerm);
        }
    }

    /**
     * Creates a new SumOfTerms object obtained by adding this term to the given SumOfTerms parameter.
     */
    default SumOfTerms plus(SumOfTerms otherTerm) {
        var sumSoFar = new SumOfTerms();
        boolean hasOtherTermBeenAdded = false;
        for (Term x : otherTerm.getSet()) {
            if (!hasOtherTermBeenAdded && isComparable(x)) { //Add 'otherTerm' to its comparable term
                var mergedTerm = plusComparable(x);
                sumSoFar = sumSoFar.plusIncomparable(mergedTerm);
                hasOtherTermBeenAdded = true; // If 'otherTerm' has already been added, we need not add it again
            } else {
                // Keep x unchanged in the new sum
                sumSoFar = sumSoFar.plusIncomparable(x);
            }
        }
        return sumSoFar;
    }

    HashSet<SimpleTermWithoutExponent> getSet();

    default SimpleTermWithoutExponent findComparable(SimpleTermWithoutExponent x) {
        boolean found = false;
        SimpleTermWithoutExponent comparableTerm = null;
        for (SimpleTermWithoutExponent i : getSet()) {
            if (!found && i.isComparable(x)) {
                found = true;
                comparableTerm = i;
            }
        }
        return comparableTerm;
    }
}
