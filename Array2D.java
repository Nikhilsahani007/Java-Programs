import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter no of columns: ");
        int col = sc.nextInt();
        
        int[][] arr = new int[row][col];
        System.out.println("Enter elements of the array: ");

        // Taking input from the user
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element of [" + i + "] [" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        // Printing the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        sc.close();

    }
}
