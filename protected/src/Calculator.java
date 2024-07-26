/**
 * This class represents a simple calculator.
 */
public class Calculator {

    /**
     * Adds two numbers.
     * @param a The first number.
     * @param b The second number.
     * @return The sum of the two numbers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one number from another.
     * @param a The number to subtract from.
     * @param b The number to subtract.
     * @return The result of subtracting b from a.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * @param a The first number.
     * @param b The second number.
     * @return The product of the two numbers.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one number by another.
     * @param a The dividend.
     * @param b The divisor (must be non-zero).
     * @return The result of dividing a by b.
     * @throws IllegalArgumentException if the divisor is zero.
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return (double) a / b;
    }
}

