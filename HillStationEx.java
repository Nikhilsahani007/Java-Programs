class HillStations {
    // Method to display location
    public void location() {
        System.out.println("This is a hill station.");
    }

    // Method to display what the hill station is famous for
    public void famousFor() {
        System.out.println("Famous for its natural beauty.");
    }
}

// Subclass: Manali
class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali is famous for its snow-covered mountains.");
    }
}

// Subclass: Mussoorie
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand.");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its beautiful views of the Mountains.");
    }
}

// Subclass: Gulmarg
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir.");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for skiing and its cable car rides.");
    }
}

// Main Class
public class HillStationEx {
    public static void main(String[] args) {
        // Parent class reference pointing to the child class objects
        HillStations hill1 = new Manali();
        HillStations hill2 = new Mussoorie();
        HillStations hill3 = new Gulmarg();

        // Calling overridden methods using parent class reference
        System.out.println("Calling methods using Parent class reference:");
        hill1.location();
        hill1.famousFor();

        hill2.location();
        hill2.famousFor();

        hill3.location();
        hill3.famousFor();

        System.out.println("\nCalling methods using objects:");

        // Calling overridden methods using objects
        Manali manali = new Manali();
        manali.location();
        manali.famousFor();

        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();

        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }
}
