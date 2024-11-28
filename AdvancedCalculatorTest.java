import org.junit.Assert;
import org.junit.Test;

public class AdvancedCalculatorTest {

    private final AdvancedCalculator calculator = new AdvancedCalculator();

    @Test
    public void powerTwoToTheThree() {
        Assert.assertEquals(8, calculator.power(2, 3), 0.0001);
    }

    @Test
    public void powerTwoToTheNegThree() {
        Assert.assertEquals(0.125, calculator.power(2, -3), 0.0001);
    }

    @Test
    public void powerZeroToTheNegOne() {
        try {
            calculator.power(0, -1);
            Assert.fail("illegal argument");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Cannot calculate power for zero with a negative exponent", e.getMessage());
        }
    }

    @Test
    public void sqrtOf9() {
        Assert.assertEquals(3, calculator.squareRoot(9), 0.0001);
    }

    @Test
    public void sqrtOfNeg4() {
        try {
            calculator.squareRoot(-4);
            Assert.fail("illegal argument");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Cannot calculate square root of a negative number", e.getMessage());
        }
    }

    @Test
    public void isPrime13() {
        Assert.assertTrue(calculator.isPrime(13));
    }

    @Test
    public void isPrime10() {
        Assert.assertFalse(calculator.isPrime(10));
    }

    @Test
    public void isPrime29() {
        Assert.assertTrue(calculator.isPrime(29));
    }

    @Test
    public void isPrime1() {
        Assert.assertFalse(calculator.isPrime(1));
    }

    @Test
    public void factorialOf5() {
        Assert.assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void factorialOf0() {
        Assert.assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void factorialOfNeg3() {
        try {
            calculator.factorial(-3);
            Assert.fail("illegal argument");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Factorial is undefined for negative numbers", e.getMessage());
        }
    }

    @Test
    public void factorialOf20() {
        Assert.assertEquals(2432902008176640000L, calculator.factorial(20));
    }
}
