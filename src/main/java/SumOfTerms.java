import java.util.ArrayList;

public class SumOfTerms implements Term {
    final private ArrayList<Term> theSum;

    public SumOfTerms(ArrayList<Term> theSum) {
        this.theSum = theSum;
    }

    final ArrayList<Term> getAll() {
        return theSum;
    }

    public SumOfTerms add(SimpleTerm other) {
        return other.add(this);
    }
}
