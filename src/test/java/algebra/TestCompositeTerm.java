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
        AlgebraicExpression answer = x.plus(two_x);
        AlgebraicExpression alsoAnswer = two_x.plus(x);
        //assert:
        assertEquals(three_x, answer);
        assertEquals(three_x, alsoAnswer);
    }

    @Test
    public void testPlusOnTwoSingleVariableTermsWithDifferentSymbols() {
        //act
        AlgebraicExpression answer = x.plus(y);
        AlgebraicExpression alsoAnswer = y.plus(x);
        //assert
        assertEquals(x_plus_y, answer);
        assertEquals(x_plus_y, alsoAnswer);
    }

    @Test
    public void testPlusOnTwoSingleVariableTermsWithDifferentExponents() {
        //act
        AlgebraicExpression sum = x.plus(xSquared);
        //assert
        assertEquals(x_plus_xSquared, sum);
    }

    @Test
    public void testPlusOnSingleVariableTermWithComparableSumOfTerms() {
        //act
        SumOfTerms answer = x.plus(y_plus_xSquared_plus_two_x);
        SumOfTerms alsoAnswer = y_plus_xSquared_plus_two_x.plus(x);
        //assert
        assertEquals(y_plus_xSquared_plus_three_x, answer);
        assertEquals(y_plus_xSquared_plus_three_x, alsoAnswer);
    }

    @Test
    public void testPlusOnSingleVariableTermWithIncomparableSumOfTerms() {
        //act
        SumOfTerms answer = z.plus(y_plus_xSquared_plus_two_x);
        SumOfTerms alsoAnswer = y_plus_xSquared_plus_two_x.plus(z);
        //assert
        assertEquals(y_plus_z_plus_xSquared_plus_three_x, answer);
        assertEquals(y_plus_z_plus_xSquared_plus_three_x, alsoAnswer);
    }

    @Test
    public void testPlusWhenGivenTwoComparableMultivariableTerms() {
        //act
        AlgebraicExpression answer = xySquared.plus(three_xySquared);
        AlgebraicExpression alsoAnswer = three_xySquared.plus(xySquared);
        //assert
        assertEquals(four_xySquared, answer);
        assertEquals(four_xySquared, alsoAnswer);
    }

    @Test
    public void testPlusWhenGivenSingleVariableTermAndMultiVariableTerm() {
        //act
        AlgebraicExpression answer = xySquared.plus(x);
        AlgebraicExpression alsoAnswer = x.plus(xySquared);
        //assert
        assertEquals(x_plus_xySquared, answer);
        assertEquals(x_plus_xySquared, alsoAnswer);
    }

    @Test
    public void testPlusWhenGivenTwoIncomparableMultiVariableTerms() {
        //act
        AlgebraicExpression answer = xySquared.plus(xyCubed);
        AlgebraicExpression alsoAnswer = xyCubed.plus(xySquared);
        //assert
        assertEquals(answer, xySquared_plus_xyCubed);
        assertEquals(alsoAnswer, xySquared_plus_xyCubed);
    }

    @Test
    public void testPlusWhenGivenNumberAndSingleVariableTerm() {
        //act
        AlgebraicExpression answer = x.plus(three);
        AlgebraicExpression alsoAnswer = three.plus(x);
        //assert
        assertEquals(x_plus_three, answer);
        assertEquals(x_plus_three, alsoAnswer);
    }

    @Test
    public void testPlusWhenGivenTwoNumbers() {
        //act
        AlgebraicExpression answer = three.plus(one);
        AlgebraicExpression alsoAnswer = one.plus(three);
        //assert
        assertEquals(four, answer);
        assertEquals(four, alsoAnswer);
    }

    @Test
    public void testPlusOnNumberWithComparableSumOfTerms() {
        //act
        SumOfTerms answer = one.plus(x_plus_three);
        SumOfTerms alsoAnswer = x_plus_three.plus(one);
        //assert
        assertEquals(x_plus_four, answer);
        assertEquals(x_plus_four, alsoAnswer);
    }

    @Test
    public void testPlusOnNumberWithIncomparableSumOfTerms() {
        //act
        SumOfTerms answer = three.plus(y_plus_three_x);
        SumOfTerms alsoAnswer = y_plus_three_x.plus(three);
        //assert
        assertEquals(y_plus_three_x_plus_three, answer);
        assertEquals(y_plus_three_x_plus_three, alsoAnswer);
    }

    @Test
    public void testPlusOnTwoZeroTerms() {
        //act
        AlgebraicExpression answer = zero.plus(zero);
        //assert
        assertEquals(zero, answer);
    }

    @Test
    public void testPlusOnZeroTermWithNonZeroTerm() {
        //act
        AlgebraicExpression answer = zero.plus(x);
        AlgebraicExpression alsoAnswer = x.plus(zero);
        //assert
        assertEquals(x, answer);
        assertEquals(x, alsoAnswer);
    }

    @Test
    public void testPlusOnZeroTermWhenGivenNonZeroSumOfTerms() {
        //act
        AlgebraicExpression answer = zero.plus(x_plus_three);
        SumOfTerms alsoAnswer = x_plus_three.plus(zero);
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