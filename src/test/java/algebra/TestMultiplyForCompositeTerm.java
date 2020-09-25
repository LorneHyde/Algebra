package algebra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static algebra.ConstantsForTests.*;

public class TestMultiplyForCompositeTerm {
    @Test
    public void testMultiplyReturnsCorrectTermWhenGivenTwoSingleVariableTermsWithSameSymbol() {
        //act
        CompositeTerm answer = two_xSquared.multiply(five_xCubed);
        CompositeTerm alsoAnswer = five_xCubed.multiply(two_xSquared);
        //assert
        assertEquals(ten_xToTheFive, answer);
        assertEquals(ten_xToTheFive, alsoAnswer);
    }

    @Test
    public void testMultiplyReturnsCorrectTermsWhenGivenTwoSingleVariableTermsWithDifferentSymbols() {
        //act
        CompositeTerm actual_result = two_xSquared.multiply(three_yCubed);
        CompositeTerm also_actual_result = three_yCubed.multiply(two_xSquared);
        //assert
        assertEquals(six_xSquared_yCubed, actual_result);
        assertEquals(six_xSquared_yCubed, also_actual_result);
    }

    @Test
    public void testMultiplyReturnsCorrectNumberWhenGivenTwoSingleVariableTermsWithSameSymbolOppositeExponents() {
        //act
        CompositeTerm answer = xSquared.multiply(three_xToThePowerOfMinus2);
        CompositeTerm alsoAnswer = three_xToThePowerOfMinus2.multiply(xSquared);
        //assert
        assertEquals(three, answer);
        assertEquals(three, alsoAnswer);
    }

    @Test
    public void TestMultiplyReturnsCorrectAnswerWhenGivenSingleVariableTermAndMultiVariableTerm() {
        //act
        CompositeTerm answer = xyCubed.multiply(six_x);
        CompositeTerm alsoAnswer = six_x.multiply(xyCubed);
        //assert
        assertEquals(six_xSquared_yCubed, answer);
        assertEquals(six_xSquared_yCubed, alsoAnswer);
    }

    @Test
    public void TestMultiplyWhenGivenTwoMultiVariableTerms() {
        //act
        CompositeTerm actualResult = two_w_xSquared_yCubed.multiply(three_x_z_yToTheEight);
        CompositeTerm alsoActualResult = three_x_z_yToTheEight.multiply(two_w_xSquared_yCubed);
        //assert
        assertEquals(w_z_xCubed_yToTheEleven, actualResult);
        assertEquals(w_z_xCubed_yToTheEleven, alsoActualResult);
    }

    @Test
    public void testMultiplyWhenGivenNumber() {
        //act
        CompositeTerm answer = x.multiply(three);
        CompositeTerm alsoAnswer = three.multiply(x);
        //assert
        assertEquals(three_x, answer);
        assertEquals(three_x, alsoAnswer);
    }

    @Test
    public void testMultiplyOnTwoNumbers() {
        //act
        CompositeTerm answer = three.multiply(four);
        CompositeTerm alsoAnswer = four.multiply(three);
        //assert
        assertEquals(twelve, answer);
        assertEquals(twelve, alsoAnswer);
    }
}
