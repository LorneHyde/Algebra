/** Represents an algebraic expression, which may be either a composite term or a sum of terms.*/
public interface AlgebraicExpression {
    AlgebraicExpression plus(CompositeTerm s);
    AlgebraicExpression plus(SumOfTerms s);
}
