import java.util.ArrayList;

public class VariableTerm implements Term {
    final private char symbol;
    final private int quantity;
    final private int exponent;

    public VariableTerm(char symbol, int quantity, int exponent) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.exponent = exponent;
    }

    public VariableTerm(char symbol) {
        this.symbol = symbol;
        this.quantity = 1;
        this.exponent = 1;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getExponent() {
        return exponent;
    }

    public Term add(VariableTerm other) {
        if (other.symbol == symbol && exponent == other.exponent) {
            return new VariableTerm(symbol, quantity + other.quantity, exponent);
        } else {
            ArrayList<Term> sum = new ArrayList<Term>();
            sum.add(this);
            sum.add(other);
            return new SumOfTerms(sum);
        }
    }
}
