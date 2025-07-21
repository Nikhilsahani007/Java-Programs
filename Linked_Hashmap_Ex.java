import java.util.LinkedHashMap;

public class Linked_Hashmap_Ex {
    
    public static void main(String[] args) {
        // Create a linked hashmap
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        // Add elements to the map
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");
        map.put("D", "Date");
        map.put("E", "Elderberry");

        // Print the map
        System.out.println(map);
        System.out.println(map.get("A") + " " + map.get("B") + " " + map.get("C") + " " + map.get("D") + " " + map.get("E"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        // Remove an element from the map
        map.remove("C");
        System.out.println(map);
            }
}
