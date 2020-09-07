public class TermWithExponent implements Term {

    final private VariableTerm termInside;
    final private int exponent;

    public TermWithExponent(VariableTerm termInside, int exponent) {
        this.termInside = termInside;
        this.exponent = exponent;
    }

    public VariableTerm getTermInside() {
        return termInside;
    }

    public int getExponent() {
        return exponent;
    }
}
