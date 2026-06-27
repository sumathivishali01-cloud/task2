import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=== Simple Calculator ===");

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter operation (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            switch (operator) {

                case '+':
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                    break;

                default:
                    System.out.println("Invalid operator! Use +, -, *, or /");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}