import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input of rows and columns
        System.out.println("Enter no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns: ");
        int columns = sc.nextInt();

        // Declarations of matrices
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] matrix3 = new int[rows][columns];

        // Input for matrix1
        System.out.println("Enter elements of first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the element of [" + i + "] [" + j + "]");
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input for matrix 2
        System.out.println("Enter elements of second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the element of [" + i + "] [" + j + "]");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Adding matrix1 and matrix2 and storing in matrix3
        System.out.println("The result after addition of matrix1 and matrix2");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.print("\n");
        }
        sc.close();

    }
}
