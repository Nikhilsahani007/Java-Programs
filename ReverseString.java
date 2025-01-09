import java.util.Scanner;

public class ReverseString {
    void Rev(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseString Reverse = new ReverseString();
        System.out.println("Enter a string");
        String str = sc.nextLine();
        Reverse.Rev(str);
        sc.close();
    }
}
