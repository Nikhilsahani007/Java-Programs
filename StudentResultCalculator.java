import java.util.Scanner;

public class StudentResultCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        int maxMarks = numSubjects * 100; // Assuming each subject is out of 100

        // Input marks for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculate percentage
        double percentage = (totalMarks / (double) maxMarks) * 100;

        // Display results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        scanner.close();
    }
}
