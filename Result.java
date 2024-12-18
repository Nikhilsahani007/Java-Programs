import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;
        int numberOfSubjects = 5;

        // Input marks for 5 subjects
        System.out.println("Enter the marks for 5 subjects (0-100):");
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        int averageMarks = totalMarks / numberOfSubjects;
        String grade;
        switch (averageMarks / 10) {
            case 10:
                grade = "A+";
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B+";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
                grade = "C";
                break;
            case 5:
                grade = "D";
                break;
            default:
                grade = "F"; 
        }

        // Output the average and grade
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
