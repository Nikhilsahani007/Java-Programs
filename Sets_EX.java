import java.util.HashSet;
import java.util.Set;

public class Sets_EX {
    public static void main(String[] args) {
        // Create a set of strings
        Set<String> set = new HashSet<>();
        // Add elements to the set
        set.add("apple");
        set.add("banana");
        set.add("");
        set.add("apple"); // Adding duplicate element
        set.add("fig");
        set.add("grape");

        // Print the set
        System.out.println(set);

        // Creare a set of numbers

        Set<Integer> numbers = new HashSet<>();
       numbers.add(10);
         numbers.add(20);
            numbers.add(30);
            numbers.add(40);
            numbers.add(50);
            numbers.add(30);
            numbers.add(70);

        // Print the set
        System.out.println(numbers);
        Set<Integer> num = new HashSet<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(10);

        // Print the set
        System.out.println(num);

        
    }
}
