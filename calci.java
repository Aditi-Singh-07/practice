import java.util.Scanner;

public class calci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0; 

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue; // Skip to the next iteration of the loop
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to continue? (y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                break;
            }
        }

        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Return Not-a-Number to indicate an error
        }
        return a / b;
    }
}