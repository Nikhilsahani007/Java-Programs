import java.util.Scanner;

public class RotationArray {

    // Method to perform rotation
    public static void arrayRotation(int[] array) {
        int size = array.length;

        // Store the last element
        int temp = array[size - 1];

        // Shift all elements one step
        for (int i = size - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        // Place the last element at the first position
        array[0] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        arrayRotation(array);

        System.out.println("Array after rotation:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
