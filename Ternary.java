import java.util.Scanner;
// Program 2: Find Maximum of Two Numbers Using Ternary Operator

public class Ternary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum number is: " + max);
        scanner.close();
    }
}
