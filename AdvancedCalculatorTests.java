import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTests{

    AdvancedCalculator calc = new AdvancedCalculator();

    @Test

    void testPouvoir(){
        //For testing of positive exp

        assertEquals(8.0, calc.power(22,3),0.0001, " 2^3 should be 8");
//For testing of negative exp
        assertEquals(0.125, calc.power(2,-3),0.0001, " 2^-3 should be 8");
//For testing of base 0 with neg exp 

        assertThrowsException(ArithmeticException.class, () -> calc.power(0,-1), "Throws ArithmeticException for 0^-1");
    }
    @Test

    void testracinecarré(){
        //for testing square root

        assertEquals(3.0,calc.squareRoot(9),0.0001, "Square root of 9 should be 3");

        // for negative input

        assertThrows(IllegalArgumentException.class,() -> calc.squareRoot(-4),"This should throw Illegal Argument Exception for square root of a negative number");

    }
    @Test

    void testnombrePremier(){

        // for testing of prime number

        assertTrue(calc.testnombrePremier(11), " 11 should be a prime number");
        assertTrue(calc.testnombrePremier(7), " 7 should be a prime number");

        // for tetsing of non-prime number

        assertFalse(calc.testnombrePremier(9), " 9 should not be a prime number");
        assertFalse(calc.testnombrePremier(4), " 4 should not be a prime number");
    }

    @Test

    void testnombrefactorielle(){
        // for testing good inputs

        assertEquals(24, calc.factorial(4), "4! should be 24 ");
        assertEquals(120, calc.factorial(5), "5! should be 24 ")

        // for negative inputs

        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-3), "Should throw Illegal Argument Exception for factorial of a negative number");

        // for large value input

        assertEquals(2432902008176640000L, calc.factorial(20), 
                "20! should be 2432902008176640000");
}

// Will finish up tomorrow
// Will check up on the code again before the deadline tomorrow