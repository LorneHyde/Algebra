import java.util.ArrayList;

public class SimpleTerm implements Term {
    final private char symbol;
    final private int quantity;
    final private int exponent;

    public SimpleTerm(char symbol, int quantity, int exponent) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.exponent = exponent;
    }

    public SimpleTerm(char symbol) {
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

    public Term add(SimpleTerm other) {
        if (isComparable(other)) {
            return new SimpleTerm(symbol, quantity + other.quantity, exponent);
        } else {
            ArrayList<Term> sum = new ArrayList<Term>();
            sum.add(this);
            sum.add(other);
            return new SumOfTerms(sum);
        }
    }

    private Boolean isComparable(SimpleTerm other) {
        return other.symbol == symbol && other.exponent == exponent;
    }

    Boolean isComparable(Term other) {
        return other instanceof SimpleTerm && isComparable((SimpleTerm) other);
    }

}
