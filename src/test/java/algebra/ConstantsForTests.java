package algebra;
import java.util.HashSet;

public class ConstantsForTests {
    public static final CompositeTerm zero = new CompositeTerm(0);
    public static final CompositeTerm one = new CompositeTerm(1);
    public static final CompositeTerm three = new CompositeTerm(3);
    public static final CompositeTerm four = new CompositeTerm(4);
    public static final CompositeTerm twelve = new CompositeTerm(12);
    public static final CompositeTerm x = new CompositeTerm('x');
    public static final CompositeTerm two_x = new CompositeTerm('x', 2, 1);
    public static final CompositeTerm three_x = new CompositeTerm('x', 3, 1);
    public static final CompositeTerm four_x = new CompositeTerm('x', 4, 1);
    public static final CompositeTerm six_x = new CompositeTerm('x', 6, 1);
    public static final CompositeTerm xSquared = new CompositeTerm('x', 1, 2);
    public static final CompositeTerm minus_xSquared = new CompositeTerm('x', -1, 2);
    public static final CompositeTerm two_xSquared = new CompositeTerm('x', 2, 2);
    public static final CompositeTerm three_xToThePowerOfMinus2 = new CompositeTerm('x', 3, -2);
    public static final CompositeTerm five_xCubed = new CompositeTerm('x', 5, 3);
    public static final CompositeTerm ten_xToTheFive = new CompositeTerm('x', 10, 5);
    public static final CompositeTerm y = new CompositeTerm('y');
    public static final CompositeTerm ySquared = new CompositeTerm('y', 1, 2);
    public static final CompositeTerm minus_ySquared = new CompositeTerm('y', -1, 2);
    public static final CompositeTerm three_yCubed = new CompositeTerm('y', 3, 3);
    public static final CompositeTerm z = new CompositeTerm('z');
    public static final CompositeTerm x_y = get_x_y();
    public static final CompositeTerm two_x_y = get_two_x_y();
    public static final CompositeTerm minus_two_x_y = get_minus_two_x_y();
    public static final CompositeTerm xyCubed = get_xyCubed();
    public static final CompositeTerm six_xSquared_yCubed = get_six_xSquared_yCubed();
    public static final CompositeTerm xySquared = get_xySquared();
    public static final CompositeTerm three_xySquared = new CompositeTerm(xySquared.getSet(), 3);
    public static final CompositeTerm four_xySquared = new CompositeTerm(xySquared.getSet(), 4);
    public static final CompositeTerm two_w_xSquared_yCubed = get_two_w_xSquared_yCubed();
    public static final CompositeTerm three_x_z_yToTheEight = get_three_x_z_yToTheEight();
    public static final CompositeTerm w_z_xCubed_yToTheEleven = get_w_z_xCubed_yToTheEleven();

    public static final SumOfTerms zeroSum = new SumOfTerms();
    public static final SumOfTerms x_plus_three = get_x_plus_three();
    public static final SumOfTerms x_plus_four = get_x_plus_four();
    public static final SumOfTerms x_plus_y = get_x_plus_y();
    public static final SumOfTerms y_plus_three_x = get_y_plus_three_x();
    public static final SumOfTerms y_plus_three_x_plus_three = get_y_plus_three_x_plus_three();
    public static final SumOfTerms x_plus_xSquared = get_x_plus_xSquared();
    public static final SumOfTerms y_plus_xSquared_plus_two_x = get_y_plus_xSquared_plus_two_x();
    public static final SumOfTerms y_plus_xSquared_plus_three_x = get_y_plus_xSquared_plus_three_x();
    public static final SumOfTerms y_plus_z_plus_xSquared_plus_three_x = get_y_plus_z_plus_xSquared_plus_two_x();
    public static final SumOfTerms x_plus_xySquared = get_x_plus_xySquared();
    public static final SumOfTerms xySquared_plus_xyCubed = get_xySquared_plus_xyCubed();
    public static final SumOfTerms y_plus_four_x_plus_xySquared = get_y_plus_four_x_plus_xySquared();
    public static final SumOfTerms xSquared_plus_ySquared_plus_two_x_y = get_xSquared_plus_ySquared_plus_two_x_y();
    public static final SumOfTerms minus_xSquared_minus_ySquared_minus_two_x_y = get_minus_xSquared_minus_ySquared_minus_two_x_y();
    public static final SumOfTerms xSquared_plus_x_y = get_xSquared_plus_x_y();

    private static SumOfTerms get_x_plus_y() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(x);
        sumSet.add(y);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_y_plus_three_x() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(three_x);
        sumSet.add(y);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_y_plus_four_x_plus_xySquared() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(four_x);
        sumSet.add(y);
        sumSet.add(xySquared);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_y_plus_three_x_plus_three() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(three_x);
        sumSet.add(y);
        sumSet.add(three);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_x_plus_xSquared() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(x);
        sumSet.add(xSquared);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_y_plus_xSquared_plus_two_x() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(y);
        sumSet.add(two_x);
        sumSet.add(xSquared);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_y_plus_xSquared_plus_three_x() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(y);
        sumSet.add(xSquared);
        sumSet.add(three_x);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_y_plus_z_plus_xSquared_plus_two_x() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(y);
        sumSet.add(two_x);
        sumSet.add(xSquared);
        sumSet.add(z);
        return new SumOfTerms(sumSet);
    }

    private static CompositeTerm get_xySquared() {
        HashSet<SimpleTerm> termSet = new HashSet<>();
        termSet.add(new SimpleTerm('x'));
        termSet.add(new SimpleTerm('y', 2));
        return new CompositeTerm(termSet);
    }

    private static SumOfTerms get_x_plus_xySquared() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(xySquared);
        sumSet.add(x);
        return new SumOfTerms(sumSet);
    }

    private static CompositeTerm get_xyCubed() {
        HashSet<SimpleTerm> termSet = new HashSet<>();
        termSet.add(new SimpleTerm('x'));
        termSet.add(new SimpleTerm('y', 3));
        return new CompositeTerm(termSet);
    }

    private static CompositeTerm get_six_xSquared_yCubed() {
        HashSet<SimpleTerm> termSet = new HashSet<>();
        termSet.add(new SimpleTerm('x', 2));
        termSet.add(new SimpleTerm('y', 3));
        return new CompositeTerm(termSet, 6);
    }

    private static SumOfTerms get_xySquared_plus_xyCubed() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(xySquared);
        sumSet.add(xyCubed);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_xSquared_plus_x_y() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(xSquared);
        sumSet.add(x_y);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_x_plus_three() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(three);
        sumSet.add(x);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_x_plus_four() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(four);
        sumSet.add(x);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_xSquared_plus_ySquared_plus_two_x_y() {
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(xSquared);
        sumSet.add(ySquared);
        sumSet.add(two_x_y);
        return new SumOfTerms(sumSet);
    }

    private static SumOfTerms get_minus_xSquared_minus_ySquared_minus_two_x_y(){
        HashSet<CompositeTerm> sumSet = new HashSet<>();
        sumSet.add(minus_xSquared);
        sumSet.add(minus_ySquared);
        sumSet.add(minus_two_x_y);
        return new SumOfTerms(sumSet);
    }

    private static CompositeTerm get_two_w_xSquared_yCubed() {
        HashSet<SimpleTerm> termSet = new HashSet<>();
        termSet.add(new SimpleTerm('w'));
        termSet.add(new SimpleTerm('x', 2));
        termSet.add(new SimpleTerm('y', 3));
        return new CompositeTerm(termSet, 2);
    }

    private static CompositeTerm get_three_x_z_yToTheEight() {
        HashSet<SimpleTerm> termSet = new HashSet<>();
        termSet.add(new SimpleTerm('x'));
        termSet.add(new SimpleTerm('y', 8));
        termSet.add(new SimpleTerm('z'));
        return new CompositeTerm(termSet, 3);
    }

    private static CompositeTerm get_w_z_xCubed_yToTheEleven() {
        HashSet<SimpleTerm> termSet = new HashSet<>();
        termSet.add(new SimpleTerm('w'));
        termSet.add(new SimpleTerm('x', 3));
        termSet.add(new SimpleTerm('y', 11));
        termSet.add(new SimpleTerm('z'));
        return new CompositeTerm(termSet, 6);
    }

    private static CompositeTerm get_x_y() {
        HashSet<SimpleTerm> termSet = new HashSet<>();
        termSet.add(new SimpleTerm('x'));
        termSet.add(new SimpleTerm('y'));
        return new CompositeTerm(termSet);
    }

    private static CompositeTerm get_two_x_y() {
        HashSet<SimpleTerm> termSet = new HashSet<>();
        termSet.add(new SimpleTerm('x'));
        termSet.add(new SimpleTerm('y'));
        return new CompositeTerm(termSet, 2);
    }

    private static CompositeTerm get_minus_two_x_y() {
        HashSet<SimpleTerm> termSet = new HashSet<>();
        termSet.add(new SimpleTerm('x'));
        termSet.add(new SimpleTerm('y'));
        return new CompositeTerm(termSet, -2);
    }
}