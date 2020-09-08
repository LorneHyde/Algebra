import java.util.HashSet;

public class ProductOfTerms implements Term, TermSet {
    final private HashSet<Term> termSet;
    final private int quantity;
    final int termCount() {
        return termSet.size();
    }

    public ProductOfTerms(HashSet<Term> termSet, int quantity) {
        this.termSet = termSet;
        this.quantity = quantity;
    }

    public ProductOfTerms(HashSet<Term> termSet) {
        this.termSet = termSet;
        this.quantity = 1;
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
        var unpairedTerms = otherTerm.getSet();
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
            throw new IllegalArgumentException("otherTerm must be an instance of SimpleTerm to be comparable.");
        }
        var theOtherTerm = (ProductOfTerms) otherTerm;
        return new ProductOfTerms(termSet, quantity + theOtherTerm.quantity);
    }

    public HashSet<Term> getSet() {
        return termSet;
    }

    public int getQuantity() {
        return quantity;
    }
}
