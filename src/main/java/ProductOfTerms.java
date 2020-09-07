import java.util.ArrayList;

public class ProductOfTerms {
    final private ArrayList<Term> theProduct;

    public ProductOfTerms(ArrayList<Term> theProduct) {
        this.theProduct = theProduct;
    }

    final ArrayList<Term> getList() {
        return theProduct;
    }
}
