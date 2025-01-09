import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create a StringTokenizer to tokenize the input string
        StringTokenizer tokenizer = new StringTokenizer(input);
        int tokenCount = tokenizer.countTokens(); // Get the number of tokens

        System.out.println("Number of tokens: " + tokenCount);
        System.out.println("Reversed tokens:");

        // Reverse each token and print it
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            String reversedToken = new StringBuilder(token).reverse().toString();
            System.out.println(reversedToken);
        }

        scanner.close();
    }
}
