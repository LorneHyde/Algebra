import java.util.HashSet;

/** Represents an algebraic expression, which may be either a composite term or a sum of terms.*/
public interface AlgebraicExpression {
    AlgebraicExpression plus(CompositeTerm t);
    AlgebraicExpression plus(SumOfTerms s);
    AlgebraicExpression multiply(CompositeTerm t);
    AlgebraicExpression multiply(SumOfTerms s);
    HashSet<CompositeTerm> getSumSet();
    default boolean isSum() {
        return getSumSet().size() > 1;
    }
    default CompositeTerm giveATerm() {
        return getSumSet().iterator().next();
    }
}
