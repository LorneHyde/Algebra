import java.util.HashSet;

/**
 * Represents an algebraic expression, which may be either a composite term or a sum of terms.
 */
public interface AlgebraicExpression {
    AlgebraicExpression plus(CompositeTerm t);

    AlgebraicExpression plus(SumOfTerms s);

    AlgebraicExpression multiply(CompositeTerm t);

    AlgebraicExpression multiply(SumOfTerms s);

    AlgebraicExpression asNegative();

    AlgebraicExpression subtract(CompositeTerm t);

    AlgebraicExpression subtract(SumOfTerms s);

    HashSet<CompositeTerm> getSumSet();

    default boolean isSum() {
        return getSumSet().size() != 1;
    }

    default CompositeTerm giveATerm() {
        return getSumSet().iterator().next();
    }

    default AlgebraicExpression subtract(AlgebraicExpression r) {
        if (isSum()) {
            return subtract((SumOfTerms) r);
        } else return subtract((CompositeTerm) r);
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
