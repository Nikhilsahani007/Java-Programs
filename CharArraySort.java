import java.util.Scanner;

public class CharArraySort {
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
        System.out.println("Original array");
        for(char c: charArray){
            System.out.print(c+" ");
        }
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        scanner.close();
    }
       
}
