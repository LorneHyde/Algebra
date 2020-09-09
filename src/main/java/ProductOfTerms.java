import java.util.HashSet;
import java.util.Objects;

//TODO: Then, add some multiplication function in AlgebraicExpression
public class ProductOfTerms implements Term, TermSet {
    final private HashSet<SimpleTermWithoutExponent> termSet;
    final private int coefficient;

    public ProductOfTerms(HashSet<SimpleTermWithoutExponent> termSet, int coefficient) {
        this.termSet = termSet;
        this.coefficient = coefficient;
    }

    public ProductOfTerms(HashSet<SimpleTerm> termSet) {
        var constituentSet = new HashSet<SimpleTermWithoutExponent>();
        var totalCoefficient = 1;
        for (SimpleTerm i : termSet) {
            constituentSet.add(new SimpleTermWithoutExponent(i.getSymbol(), i.getExponent()));
            totalCoefficient *= i.getCoefficient();
        }
        this.termSet = constituentSet;
        this.coefficient = totalCoefficient;
    }

    public final int factorCount() {
        return termSet.size();
    }

    public boolean isComparable(Term otherTerm) {
        if (factorCount() == otherTerm.factorCount()) {
            return isComparableToProduct(otherTerm);
        } else {
            return false;
        }
    }

    private boolean isComparableToProduct(Term otherTerm) {
        var foundIncomparableTerm = false;
        var unpairedTerms = new HashSet<>(otherTerm.getSet()); // This is a new set to prevent concurrent modification
        for (SimpleTermWithoutExponent x : getSet()) {
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
        if (!isComparable(otherTerm)) {
            throw new IllegalArgumentException("plusComparable was called on incomparable term.");
        }
        var theOtherTerm = (ProductOfTerms) otherTerm;
        return new ProductOfTerms(termSet, coefficient + theOtherTerm.coefficient);
    }

    public HashSet<SimpleTermWithoutExponent> getSet() {
        return termSet;
    }

    public int getCoefficient() {
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
