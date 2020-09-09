import java.util.HashSet;

public interface TermSet {
    /** Returns a HashSet containing the members of this set of terms*/
    HashSet<Term> getSet();

    /**
     * Returns the first term in the set that is comparable to the parameter Term x, or returns null if no such term
     * exists.
     */
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
