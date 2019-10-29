public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int SecondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + SecondOperand;
            case SUBTRACTION:
                return firstOperand - SecondOperand;
            case MULTIPLICATION:
                return firstOperand * SecondOperand;
            case DIVISION:
                if (SecondOperand != 0)
                    return firstOperand / SecondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}