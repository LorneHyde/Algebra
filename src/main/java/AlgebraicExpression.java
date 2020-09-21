import java.util.HashSet;

/**
 * Represents an algebraic expression, which may be either a composite term or a sum of terms.
 */
public interface AlgebraicExpression {
    /**
     * Returns the result of adding this expression to the given CompositeTerm, only creating a SumOfTerms if the result
     * cannot possibly be expressed as a CompositeTerm.
     */
    AlgebraicExpression plus(CompositeTerm t);

    /**
     * Returns the result of adding this expression to the given sum of terms.
     */
    SumOfTerms plus(SumOfTerms s);


    AlgebraicExpression multiply(CompositeTerm t);

    AlgebraicExpression multiply(SumOfTerms s);

    AlgebraicExpression asNegative();

    HashSet<CompositeTerm> getSumSet();

    default boolean isSum() {
        return getSumSet().size() != 1;
    }

    default CompositeTerm giveATerm() {
        return getSumSet().iterator().next();
    }

    default AlgebraicExpression subtract(AlgebraicExpression r) {
        return plus(r.asNegative());
    }


    default AlgebraicExpression plus(AlgebraicExpression r) {
        if (r.isSum()) {
            return plus((SumOfTerms) r);
        } else return plus((CompositeTerm) r);
    }

    default AlgebraicExpression multiply(AlgebraicExpression r) {
        if (r.isSum()) {
            return multiply((SumOfTerms) r);
        } else return multiply((CompositeTerm) r);
    }
}
