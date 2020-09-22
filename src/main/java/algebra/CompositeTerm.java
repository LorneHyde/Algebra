package algebra;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**The product of one or more variables with exponents, with a coefficient.*/
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


    /**
     * The coefficient is assigned to 1 if not otherwise specified.
     *
     * @param termSet A hashset of constituent SimpleTerm objects which are multiplied together
     *                to create this CompositeTerm.
     */
    public CompositeTerm(HashSet<SimpleTerm> termSet) {
        this(termSet, 1);
    }

    /**
     * @param termSet A hashset of constituent SimpleTerm objects which are multiplied together
     *                to create this CompositeTerm.
     */
    public CompositeTerm(HashSet<SimpleTerm> termSet, int coefficient) {
        this.coefficient = coefficient;
        this.termSet = termSet;
    }

    /**
     * Creates a new CompositeTerm to represent an integer.
     *
     * @param i The integer that this CompositeTerm will represent.
     */
    public CompositeTerm(int i) {
        this('x', i, 0);
    }


    /**
     * Returns whether this is simply a number (rather than a term with variables)
     */
    public boolean isNumber() {
        var foundNonZeroExponent = false;
        for (SimpleTerm i : termSet) {
            if (i.getExponent() != 0) {
                foundNonZeroExponent = true;
                break;
            }
        }
        return !foundNonZeroExponent;
    }

    /**
     * Returns whether the given term parameter can be added to this to create a CompositeTerm (rather
     * than a SumOfTerms)
     */
    public boolean isComparable(CompositeTerm otherTerm) {
        if (factorCount() == otherTerm.factorCount()) {
            return isComparableToProduct(otherTerm);
        } else {
            return false;
        }
    }

    /**
     * Returns the set of CompositeTerms that make up this sum.
     * A CompositeTerm will always have sumSet of size 1.
     */
    @Override
    public HashSet<CompositeTerm> getSumSet() {
        var set = new HashSet<CompositeTerm>();
        set.add(this);
        return set;
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
     * Returns the sum of this and the given parameter term, given that the parameter is comparable to this.
     *
     * @throws IllegalArgumentException if the given parameter term is not actually comparable to this.
     *                                  Note that comparable terms can be added together to produce a CompositeTerm rather than a
     *                                  SumOfTerms.
     */
    public CompositeTerm plusComparable(CompositeTerm otherTerm) {
        if (!isComparable(otherTerm)) {
            throw new IllegalArgumentException("plusComparable was called on incomparable term.");
        }
        return new CompositeTerm(termSet, coefficient + otherTerm.coefficient);
    }


    /**
     * Returns the result of adding the given parameter to this expression.
     * The result will only be a SumOfTerms if the result cannot possibly be expressed as a CompositeTerm.
     */
    @Override
    public AlgebraicExpression plus(CompositeTerm otherTerm) {
        if (otherTerm.coefficient == 0) {
            return this;
        } else if (coefficient == 0) {
            return otherTerm;
        } else if (isComparable(otherTerm)) {
            return plusComparable(otherTerm);
        } else if (isNumber() && otherTerm.isNumber()) {
            return new CompositeTerm(coefficient + otherTerm.coefficient);
        } else {
            return plusIncomparable(otherTerm);
        }
    }

    private SumOfTerms plusIncomparableSum(SumOfTerms incomparableSum) {
        if (coefficient == 0) {
            return incomparableSum;
        } else {
            var newSet = incomparableSum.getSumSet();
            newSet.add(this);
            return new SumOfTerms(newSet);
        }
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public SumOfTerms plus(SumOfTerms otherSum) {
        if (coefficient == 0) {
            return otherSum;
        } else if (isNumber()) {
            return numberPlus(otherSum);
        } else {
            var sumSoFar = new SumOfTerms();
            boolean hasThisTermBeenAdded = false;
            for (CompositeTerm x : otherSum.getSumSet()) {
                if (x.coefficient != 0) {
                    if (!hasThisTermBeenAdded && isComparable(x)) { //Add this to its comparable term
                        var mergedTerm = plusComparable(x);
                        sumSoFar = mergedTerm.plusIncomparableSum(sumSoFar);
                        hasThisTermBeenAdded = true; // If 'otherSum' has already been added, we need not add it again
                    } else {
                        // Keep x unchanged in the new sum
                        sumSoFar = x.plusIncomparableSum(sumSoFar);
                    }
                }
            }
            if (!hasThisTermBeenAdded) {
                sumSoFar = plusIncomparableSum(sumSoFar);
            }
            return sumSoFar;
        }
    }

    private SumOfTerms numberPlus(SumOfTerms otherSum) {
        if (isNumber()) {
            var sumSoFar = new SumOfTerms();
            boolean hasThisTermBeenAdded = false;
            for (CompositeTerm x : otherSum.getSumSet()) {
                if (x.coefficient != 0) {
                    if (!hasThisTermBeenAdded && x.isNumber()) { //Add this to its comparable term
                        var mergedTerm = new CompositeTerm(coefficient + x.coefficient);
                        sumSoFar = mergedTerm.plusIncomparableSum(sumSoFar);
                        hasThisTermBeenAdded = true; // If 'otherTerm' has already been added, we need not add it again
                    } else {
                        // Keep x unchanged in the new sum
                        sumSoFar = x.plusIncomparableSum(sumSoFar);
                    }
                }
            }
            if (!hasThisTermBeenAdded) {
                sumSoFar = plusIncomparableSum(sumSoFar);
            }
            return sumSoFar;
        } else {
            throw new IllegalArgumentException(this + " is a term, not a number.");
        }
    }

    /**
     * Returns a term in the product that can be added to the given parameter to produce a Term
     * (rather than a sum of terms), or returns null if no such term exists.
     */
    SimpleTerm findComparable(SimpleTerm term) {
        boolean found = false;
        SimpleTerm comparableTerm = null;
        for (SimpleTerm i : getSet()) {
            if (!found && i.isComparable(term)) {
                found = true;
                comparableTerm = i;
            }
        }
        return comparableTerm;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public CompositeTerm asNegative() {
        return new CompositeTerm(getSet(), coefficient * -1);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public CompositeTerm multiply(CompositeTerm otherTerm) {
        var newTermSet = new HashSet<SimpleTerm>();
        var unusedTerms = otherTerm.getSet();
        for (SimpleTerm t1 : getSet()) {
            var t2 = findTermWithSameSymbol(unusedTerms, t1);
            if (!isNumber() && t2 == null) {
                newTermSet.add(t1);
            } else if (t2 != null) {
                newTermSet.add(t1.multiplyWithSameSymbol(t2));
                unusedTerms.remove(t2);
            }
        }
        for (SimpleTerm i : unusedTerms) {
            if (i.notSimpleNumber()) {
                newTermSet.add(i);
            }
        }
        var newCoefficient = getCoefficient() * otherTerm.getCoefficient();
        return new CompositeTerm(newTermSet, newCoefficient);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public SumOfTerms multiply(SumOfTerms otherSum) {
        return otherSum.multiply(this);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public AlgebraicExpression multiply(AlgebraicExpression other) {
        if (other.isSum()) {
            return multiply((SumOfTerms) other);
        } else {
            return multiply(other.giveATerm());
        }
    }

    private SimpleTerm findTermWithSameSymbol(HashSet<SimpleTerm> termSet, SimpleTerm term) {
        boolean found = false;
        SimpleTerm termWithSameSymbol = null;
        for (SimpleTerm i : termSet) {
            if (!found && i.getSymbol() == term.getSymbol()) {
                found = true;
                termWithSameSymbol = i;
            }
        }
        return termWithSameSymbol;
    }

    /**
     * Returns the set of all SimpleTerms that are multiplied together to create this CompositeTerm.
     * Note that the coefficient is NOT part of this set.
     */
    public HashSet<SimpleTerm> getSet() {
        return new HashSet<>(termSet);
    }

    /**
     * Returns the coefficient of this term.
     */
    public int getCoefficient() {
        return coefficient;
    }

    /**
     * Returns the number of factors in the set of terms
     */
    private int factorCount() {
        var count = 0;
        for (SimpleTerm i : termSet) {
            if (i.notSimpleNumber()) {
                count += 1;
            }
        }
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositeTerm that = (CompositeTerm) o;
        if (isNumber() && that.isNumber()) {
            return this.coefficient == that.coefficient;
        } else {
            return coefficient == that.coefficient &&
                    Objects.equals(termSet, that.termSet);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(termSet, coefficient);
    }

    @Override
    public String toString() {
        String coefficientString = String.valueOf(coefficient);
        if (isNumber()) {
            return coefficientString;
        } else if (coefficient == 1) {
            return termSetString();
        } else if (coefficient == -1) {
            return '-' + termSetString();
        } else {
            return coefficientString + termSetString();
        }
    }

    private String termSetString() {
        Iterator<SimpleTerm> it = termSet.iterator();
        if (!it.hasNext())
            return "";
        StringBuilder sb = new StringBuilder();
        for (; ; ) {
            SimpleTerm e = it.next();
            sb.append(e);
            if (!it.hasNext())
                return sb.toString();
            sb.append('*');
        }
    }
}
