import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSimpleTerm {
    @Test
    public void testAdd() throws Throwable {
        var two_x = new SimpleTerm('x', 2, 1);
        var y = new SimpleTerm('y', 3, 1);
        var x = new SimpleTerm('x');
    }

    @Test
    public void testAddTwoSimpleTermsWithSameSymbol() throws Throwable {
        var two_x = new SimpleTerm('x', 2, 1);
        var x = new SimpleTerm('x');
        var sum = x.sumWith(two_x);
        assertTrue(sum instanceof SimpleTerm);
        assertEquals(((SimpleTerm) sum).getQuantity(), 3);
    }

    @Test
    public void testAddTwoSimpleTermsWithDifferentSymbols() throws Throwable {
        var x = new SimpleTerm('x');
        var y = new SimpleTerm('y');
        var sum = x.sumWith(y);
        HashSet<Term> termList;
        if (sum instanceof SumOfTerms) {
            termList = ((SumOfTerms) sum).getSet();
        }
        else termList = null;
        assertTrue(sum instanceof SumOfTerms);
        assertTrue((termList.contains(x) && termList.contains(y) && termList.size() == 2));
    }

    @Test
    public void testAddTwoSimpleTermsWithDifferentExponents() throws Throwable {
        var x = new SimpleTerm('x');
        var xSquared = new SimpleTerm('x', 1, 2);
        var sum = x.sumWith(xSquared);

        HashSet<Term> termList;
        if (sum instanceof SumOfTerms) {
            termList = ((SumOfTerms) sum).getSet();
        }
        else termList = null;

        assertTrue(sum instanceof SumOfTerms);
        assertTrue((termList.contains(x) && termList.contains(xSquared) && termList.size() == 2));
    }
}
