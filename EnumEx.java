// Define an enum
enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumEx {
    public static void main(String[] args) {
        // Print all values of the enum
        System.out.println("Days of the week:");
        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }
}
