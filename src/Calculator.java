public class Calculator {
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        return number1 / number2;
    }

    public double squareRoot(double number) {
        if (number >= 0) {
            return Math.sqrt(number);
        } else {
            System.out.println("Error: Square root of a negative number is not allowed.");
            return Double.NaN;
        }
    }
}
