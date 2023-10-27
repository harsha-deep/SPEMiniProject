import java.lang.Math;

import org.example.Calculator;
import org.junit.Assert;
// import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    // private Calculator cal;
    // Math.abs(expected - actual) <= epsilon
    private static final double DELTA = 1e-15;

    // @Before
    // public void setUp() {
    // cal = new Calculator();
    // }

    @Test
    public void test_square_root() {
        double num = 81;
        double expectedResult = 9;
        Assert.assertEquals(expectedResult, Calculator.squareRoot(num), DELTA);
    }

    @Test
    public void test_logarithm() {
        double num = Math.E;
        double expectedResult = 1;
        Assert.assertEquals(expectedResult, Calculator.log(num), DELTA);
    }

    @Test
    public void test_factorial() {
        double num = 5;
        double expectedResult = 120;
        Assert.assertEquals(expectedResult, Calculator.factorial(num), DELTA);
    }

    @Test
    public void test_exponent() {
        double a = 9;
        double num = 2;
        double expectedResult = 81;
        Assert.assertEquals(expectedResult, Calculator.exponent(a, num), DELTA);
    }
}