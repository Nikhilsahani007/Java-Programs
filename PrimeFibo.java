import java.util.Scanner;

public class PrimeFibo {

 static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Check if a number is Fibonacci using formula
    // A number is Fibonacci if and only if (5*n^2 + 4) or (5*n^2 - 4) is a perfect square
    static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    // Helper function to check for perfect square
    static boolean isPerfectSquare(int x) {
        int s = (int)Math.sqrt(x);
        return s * s == x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input lower and upper range
        System.out.print("Enter lower range: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper range: ");
        int upper = sc.nextInt();

        System.out.println("PrimeFibo numbers between " + lower + " and " + upper + ":");

        for (int i = lower; i <= upper; i++) {
            if (isPrime(i) && isFibonacci(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}