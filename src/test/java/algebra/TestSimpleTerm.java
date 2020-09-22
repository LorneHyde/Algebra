package algebra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestSimpleTerm {
    final private static SimpleTerm x = new SimpleTerm('x');
    final private static SimpleTerm xCubed = new SimpleTerm('x', 3);
    final private static SimpleTerm xToTheFour = new SimpleTerm('x', 4);
    final private static SimpleTerm y = new SimpleTerm('y');
    @Test
    public void testMultiplyWithSameSymbolWorksForSimpleTermWithSameSymbol() {
        //act
        var answer = x.multiplyWithSameSymbol(xCubed);
        var alsoAnswer = xCubed.multiplyWithSameSymbol(x);
        //assert
        assertEquals(xToTheFour, answer);
        assertEquals(xToTheFour, alsoAnswer);
    }

    @Test
    public void testMultiplyWithSameSymbolThrowsExceptionWhenGivenSimpleTermWithDifferentSymbol() {
        assertThrows(IllegalArgumentException.class, () -> x.multiplyWithSameSymbol(y));
        assertThrows(IllegalArgumentException.class, () -> y.multiplyWithSameSymbol(x));
    }
}
