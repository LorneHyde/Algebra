package algebra;
import java.util.HashSet;

/**
 * Represents an algebraic expression, which may be either a composite term or a sum of terms.
 */
public interface AlgebraicExpression {
    /**
     * Returns the result of adding this expression to the given CompositeTerm.
     */
    AlgebraicExpression plus(CompositeTerm term);

    /**
     * Returns the result of adding this expression to the given sum of terms.
     */
    SumOfTerms plus(SumOfTerms sum);

    /**
     * Returns the result of multiplying this expression with the given CompositeTerm parameter,
     * simplifying where possible.
     */
    AlgebraicExpression multiply(CompositeTerm term);

    /**
     * Returns the result of multiplying this expression with the given SumOfTerms parameter,
     * simplifying where possible.
     */
    AlgebraicExpression multiply(SumOfTerms sum);

    /**
     * Returns the result of multiplying this expression by -1.
     */
    AlgebraicExpression asNegative();

    /**
     * Returns the set of CompositeTerms that make up this sum.
     */
    HashSet<CompositeTerm> getSumSet();

    /**
     * Returns whether the size of sumSet is NOT 1. For instance, note that expressions with empty SumSet will always
     * have isSum evaluate as true, as will expressions with multiple terms in the sumSet.
     * Any expression with only 1 element in its sumSet will have isSum() return false, regardless of whether this is a
     * CompositeTerm or a SumOfTerms.
     */
    default boolean isSum() {
        return getSumSet().size() != 1;
    }

    /**
     * Returns an arbitrary term from the sumSet. This is particularly useful if you already know the sumSet has size 1.
     */
    default CompositeTerm giveATerm() {
        return getSumSet().iterator().next();
    }

    /**
     * Returns the result of subtracting the given parameter from this expression.
     * The result may be negative.
     */
    default AlgebraicExpression subtract(AlgebraicExpression other) {
        return plus(other.asNegative());
    }

    /**
     * Returns the result of adding the given parameter to this expression.
     */
    default AlgebraicExpression plus(AlgebraicExpression other) {
        if (other.isSum()) {
            return plus((SumOfTerms) other);
        } else return plus((CompositeTerm) other);
    }

    /**
     * Returns the result of multiplying the given parameter by this expression.
     */
    default AlgebraicExpression multiply(AlgebraicExpression other) {
        if (other.isSum()) {
            return multiply((SumOfTerms) other);
        } else return multiply((CompositeTerm) other);
    }
}
