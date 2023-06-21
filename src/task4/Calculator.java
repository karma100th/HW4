package task4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number (а): ");
        double number1 = 1;
        double number2 = 1;
        try {
            number1 = scanner.nextDouble();
            System.out.println("Enter the second number (b): ");
            number2 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid value. Only numbers must be there. Try again.");
            scanner.close();
        }
        scanner.nextLine();
        System.out.println("select an arithmetic operation: +, -, /, * :");
        String operation = scanner.nextLine();
        scanner.close();
        if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
            throw new InputMismatchException(
                    "Invalid value. Must be only '+', '-', '/' or '*'."
            );
        }
        System.out.println("Result of arithmetic operation: " + getResultOperation(operation, number1, number2));
    }
    private static double getResultOperation(String operation, double number1, double number2) {
        if (operation.equals("+")) {
            return number1 + number2;
        }
        if (operation.equals("-")) {
            return number1 - number2;
        }
        if (operation.equals("/")) {
            if (number2 == 0) {
                throw new ArithmeticException(
                        "Divide by zero"
                );
            }
            return number1 / number2;
        }
        return number1 * number2;
    }
}
