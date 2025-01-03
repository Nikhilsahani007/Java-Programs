// Method Overloading program
public class Calculator {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    void add(int a, int b, int c){
        System.out.println("Sum: " + (a + b + c));
    }
    void add(double a, double b){
        System.out.println("Sum: " + (a + b));
    }
    void add(double a, double b, double c){
        System.out.println("Sum: " + (a + b + c));
    }
    void product(int a, int b){
        System.out.println("Product: " + (a * b));
    }
    void product(int a, int b, int c){
        System.out.println("Product: " + (a * b*c));
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10, 20);
        calculator.add(10, 20, 30);
        calculator.add(500, 600);
        calculator.add(656856,6475654,45684654);
        calculator.product(50, 60);
        calculator.product(50, 60,20);
    }
}
