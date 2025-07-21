import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class DailyCompoundingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getNumberInstance(new Locale("en", "IN")); // Indian number format

        // Input: Principal amount
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        // Input: Daily interest rate in percentage
        System.out.print("Enter the daily interest rate (in %): ");
        double dailyRate = scanner.nextDouble();

        // Input: Duration in years, months, and days
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        // Convert the total duration into days
        int totalDays = (years * 365) + (months * 365 / 12) + days;

        // Convert daily rate from % to decimal
        dailyRate = dailyRate / 100.0;

        // Input: Daily reinvestment rate
        System.out.print("Enter the daily reinvestment rate (as % of interest earned, e.g., 100 for 100%): ");
        double reinvestRate = scanner.nextDouble() / 100.0;

        // Calculate compound interest daily
        System.out.println("\nDaily Compounding Details:");
        double currentAmount = principal;

        for (int i = 1; i <= totalDays; i++) {
            double interestEarned = currentAmount * dailyRate;
            double reinvestedInterest = interestEarned * reinvestRate;
            currentAmount += reinvestedInterest;

            // Display details every day
            System.out.println("Day " + i + ": " + formatter.format(currentAmount));
        }

        // Output the final future value
        System.out.printf("\nThe future value after %d days is: %s%n", totalDays, formatter.format(currentAmount));

        scanner.close();
    }
}
