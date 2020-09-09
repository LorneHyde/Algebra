import java.util.HashSet;

public interface AlgebraicExpression {
    AlgebraicExpression plus (AlgebraicExpression otherExpression);
    HashSet<Term> getSet();

    default Term findComparable(Term x) {
        boolean found = false;
        Term comparableTerm = null;
        for (Term i : getSet()) {
            if (!found && i.isComparable(x)) {
                found = true;
                comparableTerm = i;
            }
        }
        return comparableTerm;
    }
}
