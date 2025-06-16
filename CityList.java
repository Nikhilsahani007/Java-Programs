import java.util.ArrayList;
import java.util.Scanner;

public class CityList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding cities to the list
        System.out.println("Enter city names (type 'exit' to stop):");
        while (true) {
            String city = scanner.nextLine();
            if (city.equalsIgnoreCase("exit")) break;
            cities.add(city);
        }

        // Displaying the list of cities
        System.out.println("\nList of Cities:");
        for (String city : cities) {
            System.out.println(city);
        }

        scanner.close();
    }
}
