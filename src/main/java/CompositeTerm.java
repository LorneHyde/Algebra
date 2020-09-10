import java.util.HashSet;
import java.util.Objects;

public class CompositeTerm implements AlgebraicExpression {

    final private int coefficient;
    final private HashSet<SimpleTerm> termSet;

    /**
     * @param symbol      A single unicode character to represent the variable in this term.
     * @param coefficient The number multiplied by this variable.
     * @param exponent    The power to which this variable is raised.
     */
    public CompositeTerm(char symbol, int coefficient, int exponent) {
        this.coefficient = coefficient;
        termSet = new HashSet<>();
        termSet.add(new SimpleTerm(symbol, exponent));
    }


    /**
     * The coefficient and exponent are assigned to 1 if not otherwise specified.
     *
     * @param symbol A single unicode character to represent the variable in this term.
     */
    public CompositeTerm(char symbol) {
        this(symbol, 1, 1);
    }


    public CompositeTerm(HashSet<SimpleTerm> termSet) {
        this(termSet, 1);
    }


    public CompositeTerm(HashSet<SimpleTerm> termSet, int coefficient) {
        this.termSet = termSet;
        this.coefficient = coefficient;
    }

    /**
     * Adds together this CompositeTerm with the given parameter, without attempting to find a comparable
     * term. This produces a new SumOfTerms object containing both.
     *
     * @throws IllegalArgumentException if the parameter is comparable to this.
     */
    private SumOfTerms plusIncomparable(CompositeTerm otherTerm) {
        if (isComparable(otherTerm)) {
            throw new IllegalArgumentException(otherTerm + " is comparable to " + this);
        }
        var sum = new HashSet<CompositeTerm>();
        sum.add(this);
        sum.add(otherTerm);
        return new SumOfTerms(sum);
    }

    /**
     * Adds this term to the parameter Term, only creating a SumOfTerms if the result cannot possibly be expressed
     * as a Term.
     */
    public AlgebraicExpression plus(CompositeTerm otherTerm) {
        if (isComparable(otherTerm)) {
            return plusComparable(otherTerm);
        } else {
            return plusIncomparable(otherTerm);
        }
    }

    /**
     * Creates a new SumOfTerms object obtained by adding this term to the given SumOfTerms parameter.
     */
    public SumOfTerms plus(SumOfTerms otherTerm) {
        var sumSoFar = new SumOfTerms();
        boolean hasOtherTermBeenAdded = false;
        for (CompositeTerm x : otherTerm.getSet()) {
            if (!hasOtherTermBeenAdded && isComparable(x)) { //Add 'otherTerm' to its comparable term
                var mergedTerm = plusComparable(x);
                sumSoFar = sumSoFar.plusIncomparable(mergedTerm);
                hasOtherTermBeenAdded = true; // If 'otherTerm' has already been added, we need not add it again
            } else {
                // Keep x unchanged in the new sum
                sumSoFar = sumSoFar.plusIncomparable(x);
            }
        }
        return sumSoFar;
    }

    /**
     * Returns a term in the product that can be added to the given parameter to produce a Term
     * (rather than a sum of terms), or returns null if no such term exists.
     */
    SimpleTerm findComparable(SimpleTerm x) {
        boolean found = false;
        SimpleTerm comparableTerm = null;
        for (SimpleTerm i : getSet()) {
            if (!found && i.isComparable(x)) {
                found = true;
                comparableTerm = i;
            }
        }
        return comparableTerm;
    }

    /**
     * Returns the result of multiplying this by the given parameter term.
     */
    CompositeTerm multiply(CompositeTerm otherTerm) {
        var newTermSet = new HashSet<SimpleTerm>();
        var unusedTerms = otherTerm.getSet();
        for (SimpleTerm t1 : getSet()) {
            var t2 = findTermWithSameSymbol(unusedTerms, t1);
            if (t2 == null) {
                newTermSet.add(t1);
            } else {
                newTermSet.add(t1.multiplyWithSameSymbol(t2));
                unusedTerms.remove(t2);
            }
        }
        newTermSet.addAll(unusedTerms);
        var newCoefficient = getCoefficient() * otherTerm.getCoefficient();
        return new CompositeTerm(newTermSet, newCoefficient);
    }

    private SimpleTerm findTermWithSameSymbol(HashSet<SimpleTerm> termSet, SimpleTerm t) {
        boolean found = false;
        SimpleTerm termWithSameSymbol = null;
        for (SimpleTerm i : termSet) {
            if (!found && i.getSymbol() == t.getSymbol()) {
                found = true;
                termWithSameSymbol = i;
            }
        }
        return termWithSameSymbol;
    }

    /**
     * Returns the number of factors in the set of terms
     */
    private int factorCount() {
        return termSet.size();
    }

    /** Returns whether the given term parameter can be added to this to create a CompositeTerm (rather
     * than a SumOfTerms)*/
    public boolean isComparable(CompositeTerm otherTerm) {
        if (factorCount() == otherTerm.factorCount()) {
            return isComparableToProduct(otherTerm);
        } else {
            return false;
        }
    }

    private boolean isComparableToProduct(CompositeTerm otherTerm) {
        var foundIncomparableTerm = false;
        var unpairedTerms = otherTerm.getSet(); // This is a new set to prevent concurrent modification
        for (SimpleTerm x : getSet()) {
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

    /** Returns the sum of this and the given parameter term, given that the parameter is comparable to this.
     * @throws IllegalArgumentException if the given parameter term is not actually comparable to this.
     * Note that comparable terms can be added together to produce a CompositeTerm rather than a
     * SumOfTerms.*/
    public CompositeTerm plusComparable(CompositeTerm otherTerm) {
        if (!isComparable(otherTerm)) {
            throw new IllegalArgumentException("plusComparable was called on incomparable term.");
        }
        return new CompositeTerm(termSet, coefficient + otherTerm.coefficient);
    }

    private HashSet<SimpleTerm> getSet() {
        return new HashSet<>(termSet);
    }

    public int getCoefficient() {
        return coefficient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositeTerm that = (CompositeTerm) o;
        return coefficient == that.coefficient &&
                Objects.equals(termSet, that.termSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(termSet, coefficient);
    }
}
