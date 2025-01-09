import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to lowercase to ignore case sensitivity
        String str = input.toLowerCase();

        // Check if the string is a palindrome
        boolean isPalindrome = true;
        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
