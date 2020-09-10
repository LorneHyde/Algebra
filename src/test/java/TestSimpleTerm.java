import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestSimpleTerm {
    @Test
    public void testMultiplyWithSameSymbolWorksForSimpleTermWithSameSymbol() {
        var t1 = new SimpleTerm('x', 1);
        var t2 = new SimpleTerm('x', 3);
        var expected_result = new SimpleTerm('x', 4);
        var actual_result = t1.multiplyWithSameSymbol(t2);
        var also_actual_result = t2.multiplyWithSameSymbol(t1);
        assertEquals(expected_result, actual_result);
        assertEquals(expected_result, also_actual_result);
    }

    @Test
    public void testMultiplyWithSameSymbolThrowsExceptionWhenGivenSimpleTermWithDifferentSymbol() {
        var t1 = new SimpleTerm('x');
        var t2 = new SimpleTerm('y');
        assertThrows(IllegalArgumentException.class, () -> t1.multiplyWithSameSymbol(t2));
    }
}
