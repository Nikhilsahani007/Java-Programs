import java.util.Scanner;

public class PrimeNumbersInRange {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) { // Numbers less than or equal to 1 are not prime
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisors up to the square root of the number
            if (num % i == 0) {
                return false; // If divisible, not a prime number
            }
        }
        return true; // If no divisors found, it's a prime number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for input
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt(); // Input start of the range
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt(); // Input end of the range

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) { // Start of for loop in range
            if (isPrime(i)) { // Check if the number is prime
                System.out.print(i + " "); // Print the prime number
            } // End of for loop
        }
        scanner.close(); // Close the scanner
    }
}
