import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerScores {
    public static void main(String[] args) {
        // Creating a HashMap to store cricketer names and their scores
        Map<String, Integer> cricketers = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Adding some cricketers and their scores
        cricketers.put("Virat", 12000);
        cricketers.put("Sachin", 18426);
        cricketers.put("Dhoni", 10500);
        cricketers.put("Rohit", 9800);
        cricketers.put("Gill", 9577);

        // Displaying the list of cricketers
        System.out.println("Cricketer Scores Database:");
        for (Map.Entry<String, Integer> entry : cricketers.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " runs");
        }

        // Searching for a cricketer’s score
        System.out.print("\nEnter the cricketer's name to search: ");
        String name = scanner.nextLine();

        // Checking if the cricketer exists in the map
        if (cricketers.containsKey(name)) {
            System.out.println(name + " has scored " + cricketers.get(name) + " runs.");
        } else {
            System.out.println("Cricketer not found in the records.");
        }

        scanner.close();
    }
}
