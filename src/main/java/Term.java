public interface Term extends AlgebraicExpression {
    boolean isComparable(Term otherTerm);

    Term plusComparable(Term comparableTerm);
}
