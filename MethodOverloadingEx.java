class Calculators {
    // Method to calculate the product of two integers
    public int product(int a, int b) {
        return a * b;
    }

    // Method to calculate the product of three integers
    public int product(int a, int b, int c) {
        return a * b * c;
    }

    // Method to calculate the product of two double values
    public double product(double a, double b) {
        return a * b;
    }

}

public class MethodOverloadingEx {
    public static void main(String[] args) {
        Calculators calc = new Calculators();

        // Using the overloaded methods
        System.out.println("Product of 5 and 10: " + calc.product(5, 10)); // Two integers
        System.out.println("Product of 2, 3, and 4: " + calc.product(2, 3, 4)); // Three integers
        System.out.println("Product of 5.5 and 2.2: " + calc.product(5.5, 2.2)); // Two double values

    }
}
