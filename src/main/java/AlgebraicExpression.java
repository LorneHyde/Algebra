import java.util.HashSet;

public interface AlgebraicExpression {
    AlgebraicExpression plus(Term s);
    AlgebraicExpression plus(SumOfTerms s);
}
