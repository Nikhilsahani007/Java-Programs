import java.util.Scanner;

public class VowelsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of characters: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        char[] charArray = new char[size];

        System.out.println("Enter the characters:");
        for (int i = 0; i < size; i++) {
            charArray[i] = scanner.nextLine().charAt(0);
        }

        System.out.println("\nVowels in the array:");
        for (char c : charArray) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.print(c + " ");
            }
        }

        scanner.close();
    }
}
