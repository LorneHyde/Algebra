import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSumOfTerms {

    @Test
    public void testPlusWhenGivenSumOfTerms() {
        var x = new CompositeTerm('x');
        var two_x_squared = new CompositeTerm('x', 2, 2);
        var x_squared = new CompositeTerm('x', 1, 2);
        var y = new CompositeTerm('y');
        var three_x_squared = new CompositeTerm('x', 3, 2);

        var termSet1 = new HashSet<CompositeTerm>();
        termSet1.add(x);
        termSet1.add(two_x_squared);
        var termSet2 = new HashSet<CompositeTerm>();
        termSet2.add(x_squared);
        termSet2.add(y);
        var expectedSet = new HashSet<CompositeTerm>();
        expectedSet.add(three_x_squared);
        expectedSet.add(x);
        expectedSet.add(y);
        var sumOfTerms1 = new SumOfTerms(termSet1);
        var sumOfTerms2 = new SumOfTerms(termSet2);
        var expectedSum = new SumOfTerms(expectedSet);
        var actualSum = sumOfTerms1.plus(sumOfTerms2);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testMultiplyWhenGivenCompositeTerm() {
        var x_cubed = new CompositeTerm('x', 2, 3);
        var y = new CompositeTerm('y');
        var x = new CompositeTerm('x');
        CompositeTerm xy = x.multiply(y);
        var sumToMultiplyBy = x.plus(y).plus(xy);
        var expectedProduct = (x_cubed.multiply(y).plus
                (new CompositeTerm('x', 2, 4)).plus
                (x_cubed.multiply(xy)));
        var actualProduct = sumToMultiplyBy.multiply(x_cubed);
        var also_actual_product = x_cubed.multiply(sumToMultiplyBy);
        assertEquals(expectedProduct, actualProduct);
        assertEquals(expectedProduct, also_actual_product);
    }
}

