import java.util.ArrayList;
import java.util.HashSet;

public class ProductOfTerms implements Term{
    final private HashSet<Term> theProduct;

    public ProductOfTerms(HashSet<Term> theProduct) {
        this.theProduct = theProduct;
    }

    final HashSet<Term> getSet() {
        return theProduct;
    }

    @Override
    public boolean isComparable(Term other) {
        return false; /*TODO: We need other to be a ProductOfTerms, and each element of this must pair up as
        comparable with a respective element of other.
        */
    }
}
