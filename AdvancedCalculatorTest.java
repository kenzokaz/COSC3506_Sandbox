
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {

    private AdvancedCalculator calculator;


    @BeforeEach
    public void setUp() {
        calculator = new AdvancedCalculator();
    }



    @org.junit.jupiter.api.Test
    void powerPositive() {




        assertEquals(8.0, calculator.power(2, 3), 0.0001, "Power of 2^3 should be 8");

    }

    @org.junit.jupiter.api.Test
    void powerPositiveNegative() {
        assertEquals(0.125, calculator.power(2, -3), 0.0001, "Power of 2^-3 should be 1/8");
    }

    @org.junit.jupiter.api.Test
    void powerPositiveZeroNegative() {
        //Tests if it either 0 or -1
        assertThrows(ArithmeticException.class, () -> {
`            calculator.power(0, -1);
        }, "Power of 0 with negative exponent should throw ArithmeticException");
    }


    @org.junit.jupiter.api.Test
    void squareRootPositive() {
        assertEquals(3.0, calculator.squareRoot(9), 0.0001,
                "Square root of 9 should be 3");
    }

    @org.junit.jupiter.api.Test
    void squareRootPositiveNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-4);
        }, "Square root of negative number should throw IllegalArgumentException");
    }

    @org.junit.jupiter.api.Test
    void isPrime() {
        assertTrue(calculator.isPrime(13), "13 should be prime");
        assertTrue(calculator.isPrime(29), "29 should be prime");
    }

    @org.junit.jupiter.api.Test
    void isNonPrime() {
        assertFalse(calculator.isPrime(10), "10 should not be prime");
    }

    @org.junit.jupiter.api.Test
    void isPrimeSpecial() {
        assertFalse(calculator.isPrime(1), "1 should not be considered prime");
    }


    @org.junit.jupiter.api.Test
    void factorialPositive() {
        assertEquals(120, calculator.factorial(5),
                "Factorial of 5 should be 120");

    }
    @org.junit.jupiter.api.Test
    void factorialZero() {
        assertEquals(1, calculator.factorial(0),
                "Factorial of 0 should be 1");
    }

    @org.junit.jupiter.api.Test
    void factorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-3);
        }, "Factorial of negative number should throw IllegalArgumentException");
    }


    @org.junit.jupiter.api.Test
    void factorialLarge() {

        long result = calculator.factorial(20);
        assertTrue(result > 0, "Factorial of 20 should be a positive number");
        assertEquals(2432902008176640000L, result,
                "Factorial of 20 should be correctly calculated");
    }
}