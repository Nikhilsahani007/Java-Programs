import java.util.Scanner;

public class Swap {
    static void swap(int a, int b) {
        System.out.println("Before Swapping a = " + a + "\nb = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping a = " + a + "\nb = " + b);
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        swap(a, b);

    }
}