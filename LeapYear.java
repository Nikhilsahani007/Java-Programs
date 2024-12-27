// Program 1
// Check whether the given year is leap year or not using if else statements

    import java.util.Scanner;

    public class LeapYear {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Creating a Scanner for user input
            System.out.print("Enter a year: ");
            int year = scanner.nextInt(); // Take the year as input from the user
    
            // Checking if the year is a leap year by using if else condition
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
            scanner.close(); // Close the scanner
        }
    }
    