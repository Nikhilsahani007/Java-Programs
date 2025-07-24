import java.util.TreeMap;

public class TreeMap_Ex {
    public static void main(String[] args) {
        // Create a TreeMap of strings
        TreeMap<Integer, String> Tmap = new TreeMap<>();
        // Add elements to the map
        Tmap.put(1, "One");
        Tmap.put(2, "Two");
        Tmap.put(5, "Five");
        Tmap.put(3, "Three");
        Tmap.put(6, "Six");
        Tmap.put(4, "Four");

        // Print the map
        System.out.println(Tmap);
        System.out.println(Tmap.get(1) + " " + Tmap.get(2) + " " + Tmap.get(3) + " " + Tmap.get(4));
        System.out.println(Tmap.keySet());
        System.out.println(Tmap.values());
    }
    
}
