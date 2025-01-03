import java.util.Scanner;

public class SortArray {

    // Method to sort an array
    public static void sortArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                
            }
        }
        for(int i = 0; i < size ; i++){
            System.out.print(array[i] + " ");
        }
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
        // Call the method to sort the array
        sortArray(array);
        scanner.close();
    }
}
