package algebra;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSumOfTerms {

    @Test
    public void testPlusWhenGivenNonZeroSumOfTerms() {
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
    public void testPlusWhenGivenZeroSumOfTerms() {
        var x = new CompositeTerm('x');
        var two_x_squared = new CompositeTerm('x', 2, 2);
        var sumSet = new HashSet<CompositeTerm>();
        sumSet.add(x);
        sumSet.add(two_x_squared);
        var nonZeroSum = new SumOfTerms(sumSet);
        var zero = new SumOfTerms();
        var zeroPlusNonZero = zero.plus(nonZeroSum);
        var nonZeroPlusZero = nonZeroSum.plus(zero);
        assertEquals(nonZeroSum, nonZeroPlusZero);
        assertEquals(nonZeroSum, zeroPlusNonZero);
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
        var AlsoActualProduct = x_cubed.multiply(sumToMultiplyBy);
        assertEquals(expectedProduct, actualProduct);
        assertEquals(expectedProduct, AlsoActualProduct);
    }

    @Test
    public void testMultiplyWhenGivenSumOfTerms() {
        var x = new CompositeTerm('x');
        var y = new CompositeTerm('y');
        var two_xy = x.multiply(new CompositeTerm('y', 2, 1));
        var x_squared = x.multiply(x);
        var y_squared = y.multiply(y);
        var x_plus_y_set = new HashSet<CompositeTerm>();
        x_plus_y_set.add(x);
        x_plus_y_set.add(y);
        var x_plus_y = new SumOfTerms(x_plus_y_set);
        var expectedResult = x_squared.plus(y_squared).plus(two_xy);
        var actualResult = x_plus_y.multiply(x_plus_y);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAsNegative() {
        var three_x = new CompositeTerm('x', 3, 1);
        var two = new CompositeTerm(2);
        var minus_three_x = new CompositeTerm('x', -3, 1);
        var minus_two = new CompositeTerm(-2);
        var sumSet = new HashSet<CompositeTerm>();
        sumSet.add(three_x);
        sumSet.add(two);
        var input = new SumOfTerms(sumSet);
        var negativeSumSet = new HashSet<CompositeTerm>();
        negativeSumSet.add(minus_three_x);
        negativeSumSet.add(minus_two);
        var expectedResult = new SumOfTerms(negativeSumSet);
        var actualResult = input.asNegative();
        assertEquals(expectedResult, actualResult);
    }
}

