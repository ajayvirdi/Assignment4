import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(5.0, calculator.add(2.0, 3.0));
        assertEquals(0.0, calculator.add(-2.0, 2.0));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, calculator.subtract(3.0, 2.0));
        assertEquals(-4.0, calculator.subtract(-2.0, 2.0));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0));
        assertEquals(-4.0, calculator.multiply(-2.0, 2.0));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(6.0, 3.0));
        assertEquals(-1.0, calculator.divide(2.0, -2.0));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5.0, 0.0));
    }

    @Test
    public void testSquareRootOfPositiveNumber() {
        double result = calculator.squareRoot(16.0);
        assertEquals(4.0, result, 0.05); // Allow a small margin of error for floating-point comparisons
    }

    @Test
    public void testSquareRootOfZero() {
        double result = calculator.squareRoot(0.0);
        assertEquals(0.0, result, 0.05);
    }

    @Test
    public void testSquareRootOfNegativeNumber() {
        double result = calculator.squareRoot(-9.0);
        assertTrue(Double.isNaN(result)); // Check if the result is NaN (not-a-number)
    }
}
