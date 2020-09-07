import java.util.ArrayList;
import java.util.HashSet;

public class ProductOfTerms {
    final private HashSet<Term> theProduct;

    public ProductOfTerms(HashSet<Term> theProduct) {
        this.theProduct = theProduct;
    }

    final HashSet<Term> getSet() {
        return theProduct;
    }
}
