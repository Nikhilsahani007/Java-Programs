import java.util.HashMap;
import java.util.Map;

public class HashMap_Ex {
    // Features of HashMap
    // 1. HashMap is a part of Java Collection Framework
    // 2. HashMap is a class
    // 3. HashMap is a generic class
    // 4. HashMap is found in java.util package
    // 5. HashMap is a part of Java Collection Framework
    public static void main(String[] args) {
        // Create a HashMap of strings
        Map<Integer, String> map = new HashMap<>();
        // Add elements to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        // Print the map
        System.out.println(map);
        System.out.println(map.get(1) + " " + map.get(2) + " " + map.get(3) + " " + map.get(4));
        System.out.println(map.keySet());
        System.out.println(map.values());

        //What is abstract class

        
    }
}
