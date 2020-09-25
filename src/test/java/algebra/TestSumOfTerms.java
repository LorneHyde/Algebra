package algebra;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static algebra.ConstantsForTests.*;

public class TestSumOfTerms {

    @Test
    public void testPlusWhenGivenNonZeroSumOfTerms() {
        //act
        SumOfTerms answer = y_plus_three_x.plus(x_plus_xySquared);
        SumOfTerms alsoAnswer = x_plus_xySquared.plus(y_plus_three_x);
        //assert
        assertEquals(y_plus_four_x_plus_xySquared, answer);
        assertEquals(y_plus_four_x_plus_xySquared, alsoAnswer);
    }

    @Test
    public void testPlusWhenGivenZeroSumOfTerms() {
        //act
        SumOfTerms answer = x_plus_xySquared.plus(zeroSum);
        SumOfTerms alsoAnswer = zeroSum.plus(x_plus_xySquared);
        //assert
        assertEquals(x_plus_xySquared, answer);
        assertEquals(x_plus_xySquared, alsoAnswer);
    }

    @Test
    public void testMultiplyWhenGivenCompositeTerm() {
        //act
        SumOfTerms answer = x_plus_y.multiply(x);
        SumOfTerms alsoAnswer = x.multiply(x_plus_y);
        //assert
        assertEquals(xSquared_plus_x_y, answer);
        assertEquals(xSquared_plus_x_y, alsoAnswer);
    }

    @Test
    public void testMultiplyWhenGivenSumOfTerms() {
        //act
        SumOfTerms actualResult = x_plus_y.multiply(x_plus_y);
        //assert
        assertEquals(xSquared_plus_ySquared_plus_two_x_y, actualResult);
    }

    @Test
    public void testAsNegative() {
        //act
        SumOfTerms answer = xSquared_plus_ySquared_plus_two_x_y.asNegative();
        //assert
        assertEquals(minus_xSquared_minus_ySquared_minus_two_x_y, answer);
    }
}

