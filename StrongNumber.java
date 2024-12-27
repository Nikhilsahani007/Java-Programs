import java.util.Scanner;

public class StrongNumber {
    // Method to calculate factorial of a number
    public static int factorial(int num) {
        int fact = 1;//Declaration of Factorial of a number as fact
        for (int i = 1; i <= num; i++) { // Start of for loop
            fact *= i; 
        }// end of for loop
        return fact; // Return Statement
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Input number from user

        int temp = number; // Storing original number in a temporary variable
        int sum = 0; // Initializing sum of factorials

        while (temp > 0) { // Start of While loop
            int digit = temp % 10; // Extract last digit
            sum += factorial(digit); // Add factorial of digit to sum
            temp /= 10; // Remove the last digit
        } // End of while loop

        // Check if the sum of factorials equals the original number
        if (sum == number) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }

        scanner.close(); // Close the scanner
    }
}
