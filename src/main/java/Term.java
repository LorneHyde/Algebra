import java.util.HashSet;

public interface Term extends AlgebraicExpression {
    boolean isComparable(Term otherTerm);

    Term plusComparable(Term comparableTerm);

    int factorCount();

    default SumOfTerms plusIncomparable(Term otherTerm) {
        var sum = new HashSet<Term>();
        sum.add(this);
        sum.add(otherTerm);
        return new SumOfTerms(sum);
    }

    default AlgebraicExpression plus(Term otherTerm) {
        if (isComparable(otherTerm)) {
            return plusComparable(otherTerm);
        } else {
            return plusIncomparable(otherTerm);
        }
    }

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

    default AlgebraicExpression plus(AlgebraicExpression otherExpression) {
        AlgebraicExpression sum;
        if (otherExpression instanceof SumOfTerms) {
            sum = plus((SumOfTerms) otherExpression);
        } else if (otherExpression instanceof Term) {
            sum = ((Term) otherExpression).plus(this);
        } else {
            throw new IllegalArgumentException("An algebraic expression should only ever be either a Term" +
                    "or a sum of terms.");
        }
        return sum;
    }


}
