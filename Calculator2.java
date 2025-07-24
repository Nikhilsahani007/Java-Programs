import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                return;
    
                }
        System.out.printf("Result: %.2f%n", result);
    }
}
//Features of java
//1. Platform Independent
//2. Object-Oriented
//3. Robust Security
//4. Multithreading
//5. Distributed Computing
//6. Dynamic
//7. High Performance
//8. Interpreted
//9. Simple
//10. Portable
