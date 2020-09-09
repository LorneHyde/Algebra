public interface AlgebraicExpression {
    AlgebraicExpression plus(CompositeTerm s);
    AlgebraicExpression plus(SumOfTerms s);
}
