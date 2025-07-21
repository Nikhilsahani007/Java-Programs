import java.util.ArrayList;
import java.util.List;

public class List_EX {
    public static void main(String[] args) {
    //Features of List
    //1. List is an ordered collection of elements
    //2. List allows duplicate elements
    //3. List allows null elements
    //4. List is index based
    //5. List is a part of Java Collection Framework
    //6. List is an interface
    //7. List is implemented by ArrayList, LinkedList, Vector and Stack classes
    //8. List is a generic interface
    //9. List interface is found in java.util package
    //10. List interface extends Collection interface
        
        // Create a list of strings
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Alice");
        names.add("Bob");
        names.add("Bob");
        names.add("");
        names.add("Charlie");
        names.add("David");

        // Print the list
        System.out.println(names);
        
        // Create a list of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(30);
        numbers.add(70);

        // Print the list
        System.out.println(numbers);
    }
}
