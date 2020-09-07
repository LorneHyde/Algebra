import java.util.ArrayList;

public class VariableTerm implements Term {
    final private char symbol;
    final private int quantity;

    public VariableTerm(char symbol, int quantity) {
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public VariableTerm(char symbol) {
        this.symbol = symbol;
        this.quantity = 1;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public Term add(VariableTerm other) {
        if (other.symbol == symbol) {
            return new VariableTerm(symbol, quantity + other.quantity);
        } else {
            ArrayList<Term> sum = new ArrayList<Term>();
            sum.add(this);
            sum.add(other);
            return new SumOfTerms(sum);
        }
    }
}
