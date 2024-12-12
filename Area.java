import java.util.Scanner;

public class Area {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double areaRec = length * width;
        double perimeterRec = 2 * (length + width);

        System.out.println("Area of the rectangle: " + areaRec);
        System.out.println("Perimeter of the rectangle: " + perimeterRec);

        System.out.print("\nEnter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double areaCir = 2 * 3.14 * radius * radius;
        double perimeterCir = 2 * 3.14 * radius;

        System.out.println("Area of the circle: " + areaCir);
        System.out.println("Perimeter of the circle: " + perimeterCir);
    }
}
