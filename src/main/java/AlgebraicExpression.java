/** Represents an algebraic expression, which may be either a composite term or a sum of terms.*/
public interface AlgebraicExpression {
    AlgebraicExpression plus(CompositeTerm s);
    AlgebraicExpression plus(SumOfTerms s);

    /** Adds together this AlgebraicExpression with the given CompositeTerm, without attempting to find a comparable
     * term. This produces a new SumOfTerms object containing both. */
    SumOfTerms plusIncomparable(CompositeTerm otherTerm);
}
