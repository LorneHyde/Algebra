import java.util.HashSet;
import java.util.Objects;

//TODO: Then, add comments everywhere
//TODO: Then, add some multiplication function in AlgebraicExpression
public class ProductOfTerms implements Term, TermSet {
    final private HashSet<Term> termSet;
    final private int coefficient;

    public ProductOfTerms(HashSet<Term> termSet, int coefficient) {
        this.termSet = termSet;
        this.coefficient = coefficient;
    }

    public ProductOfTerms(HashSet<Term> termSet) {
        this.termSet = termSet;
        this.coefficient = 1;
    }

    final int termCount() {
        return termSet.size();
    }

    public boolean isComparable(Term otherTerm) {
        if (otherTerm instanceof ProductOfTerms && (termCount() == ((ProductOfTerms) otherTerm).termCount())) {
            return isComparableToProduct((ProductOfTerms) otherTerm);
        } else {
            return false;
        }
    }

    private boolean isComparableToProduct(ProductOfTerms otherTerm) {
        var foundIncomparableTerm = false;
        var unpairedTerms = new HashSet<>(otherTerm.getSet()); // This is a new set to prevent concurrent modification
        for (Term x : getSet()) {
            var comparableTerm = otherTerm.findComparable(x);
            if (comparableTerm == null) {
                foundIncomparableTerm = true;
                break;
            } else {
                unpairedTerms.remove(comparableTerm);
            }
        }
        return !foundIncomparableTerm && unpairedTerms.isEmpty();
    }

    public ProductOfTerms plusComparable(Term otherTerm) {
        if (!(otherTerm instanceof ProductOfTerms)) {
            throw new IllegalArgumentException("otherTerm must be an instance of ProductOfTerms to be comparable.");
        }
        var theOtherTerm = (ProductOfTerms) otherTerm;
        return new ProductOfTerms(termSet, coefficient + theOtherTerm.coefficient);
    }

    public HashSet<Term> getSet() {
        return termSet;
    }

    public int getcoefficient() {
        return coefficient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductOfTerms that = (ProductOfTerms) o;
        return coefficient == that.coefficient &&
                Objects.equals(termSet, that.termSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(termSet, coefficient);
    }
}
