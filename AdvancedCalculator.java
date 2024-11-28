public class AdvancedCalculator {

    // Calculates the power of a number
    public double power(double base, int exponent) {

        // handles division by zero
        if (base == 0 && exponent < 0) {
            throw new IllegalArgumentException("Cannot calculate power for zero with a negative exponent");
        }

        if (exponent < 0) {
            return 1 / Math.pow(base, -exponent);
        }
        return Math.pow(base, exponent);
    }

    // Calculates the square root of a number
    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number);
    }

    // Checks if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Calculates the factorial of a number
    // changed return type from int to long
    // 20! exceeds the range of int
    public long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }
        // changed variable type from int to long
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}