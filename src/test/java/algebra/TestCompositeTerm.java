package algebra;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static algebra.ConstantsForTests.*;

public class TestCompositeTerm {
    @Test
    public void testPlusOnTwoSingleVariableTermsWithSameSymbol() {
        //act:
        var answer = x.plus(two_x);
        var alsoAnswer = two_x.plus(x);
        //assert:
        assertEquals(three_x, answer);
        assertEquals(three_x, alsoAnswer);
    }

    @Test
    public void testPlusOnTwoSingleVariableTermsWithDifferentSymbols() {
        //act
        var answer = x.plus(y);
        var alsoAnswer = y.plus(x);
        //assert
        assertEquals(x_plus_y, answer);
        assertEquals(x_plus_y, alsoAnswer);
    }

    @Test
    public void testPlusOnTwoSingleVariableTermsWithDifferentExponents() {
        //act
        var sum = x.plus(xSquared);
        //assert
        assertEquals(x_plus_xSquared, sum);
    }

    @Test
    public void testPlusOnSingleVariableTermWithComparableSumOfTerms() {
        //act
        var answer = x.plus(y_plus_xSquared_plus_two_x);
        var alsoAnswer = y_plus_xSquared_plus_two_x.plus(x);
        //assert
        assertEquals(y_plus_xSquared_plus_three_x, answer);
        assertEquals(y_plus_xSquared_plus_three_x, alsoAnswer);
    }

    @Test
    public void testPlusOnSingleVariableTermWithIncomparableSumOfTerms() {
        //act
        var answer = z.plus(y_plus_xSquared_plus_two_x);
        var alsoAnswer = y_plus_xSquared_plus_two_x.plus(z);
        //assert
        assertEquals(y_plus_z_plus_xSquared_plus_three_x, answer);
        assertEquals(y_plus_z_plus_xSquared_plus_three_x, alsoAnswer);
    }

    @Test
    public void testPlusWhenGivenTwoComparableMultivariableTerms() {
        //act
        var answer = xySquared.plus(three_xySquared);
        var alsoAnswer = three_xySquared.plus(xySquared);
        //assert
        assertEquals(four_xySquared, answer);
        assertEquals(four_xySquared, alsoAnswer);
    }

    @Test
    public void testPlusWhenGivenSingleVariableTermAndMultiVariableTerm() {
        //act
        var answer = xySquared.plus(x);
        var alsoAnswer = x.plus(xySquared);
        //assert
        assertEquals(x_plus_xySquared, answer);
        assertEquals(x_plus_xySquared, alsoAnswer);
    }

    @Test
    public void testPlusWhenGivenTwoIncomparableMultiVariableTerms() {
        //act
        var answer = xySquared.plus(xyCubed);
        var alsoAnswer = xyCubed.plus(xySquared);
        //assert
        assertEquals(answer, xySquared_plus_xyCubed);
        assertEquals(alsoAnswer, xySquared_plus_xyCubed);
    }

    @Test
    public void testPlusWhenGivenNumberAndSingleVariableTerm() {
        //act
        var answer = x.plus(three);
        var alsoAnswer = three.plus(x);
        //assert
        assertEquals(x_plus_three, answer);
        assertEquals(x_plus_three, alsoAnswer);
    }

    @Test
    public void testPlusWhenGivenTwoNumbers() {
        //act
        var answer = three.plus(one);
        var alsoAnswer = one.plus(three);
        //assert
        assertEquals(four, answer);
        assertEquals(four, alsoAnswer);
    }

    @Test
    public void testPlusOnNumberWithComparableSumOfTerms() {
        //act
        var answer = one.plus(x_plus_three);
        var alsoAnswer = x_plus_three.plus(one);
        //assert
        assertEquals(x_plus_four, answer);
        assertEquals(x_plus_four, alsoAnswer);
    }

    @Test
    public void testPlusOnNumberWithIncomparableSumOfTerms() {
        //act
        var answer = three.plus(y_plus_three_x);
        var alsoAnswer = y_plus_three_x.plus(three);
        //assert
        assertEquals(y_plus_three_x_plus_three, answer);
        assertEquals(y_plus_three_x_plus_three, alsoAnswer);
    }

    @Test
    public void testPlusOnTwoZeroTerms() {
        //act
        var answer = zero.plus(zero);
        //assert
        assertEquals(zero, answer);
    }

    @Test
    public void testPlusOnZeroTermWithNonZeroTerm() {
        //act
        var answer = zero.plus(x);
        var alsoAnswer = x.plus(zero);
        //assert
        assertEquals(x, answer);
        assertEquals(x, alsoAnswer);
    }

    @Test
    public void testPlusOnZeroTermWhenGivenNonZeroSumOfTerms() {
        //act
        var answer = zero.plus(x_plus_three);
        var alsoAnswer = x_plus_three.plus(zero);
        //assert
        assertEquals(x_plus_three, answer);
        assertEquals(x_plus_three, alsoAnswer);
    }

    @Test
    public void testEqualsReturnsFalseWhenGivenSingleVariableTermsWithDifferentSymbols() {
        assertNotEquals(x, y);
    }

    @Test
    public void testEqualsReturnsFalseWhenGivenSingleVariableTermsWithDifferentExponents() {
        assertNotEquals(x, xSquared);
    }

    @Test
    public void testEqualsReturnsFalseWhenGivenSingleVariableTermsWithDifferentQuantities() {
        assertNotEquals(x, two_x);
    }
}