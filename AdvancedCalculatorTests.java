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

        assertThrowsException(ArithmeticException.class, () -> calc.power(0,-1), "Throws ArithmeticException for 0^-1")
    }
}

// Will finish up tomorrow