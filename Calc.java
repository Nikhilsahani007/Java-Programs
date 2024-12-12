public class Calc {
    int num1,num2;
    //No parameters with no return type
    void sum(){
        int sum=num1+num2;
        System.out.println("Sum= "+sum);
    }
    //No Parameters with return type
    int difference(){
        int difference=num1-num2;
        return difference;
    }
    //parameters with no return type
    void product(int a, int b){
        int product=a*b;
        System.out.println("Product= "+product);
    }
    //Parameters with return type
    int division(int a, int b){
        int quotient=a/b;
        return quotient;
    }
    public static void main(String[] args) {
        Calc calc=new Calc();
        calc.num1=10;
        calc.num2=20;
        calc.sum();
        System.out.println("Difference= "+calc.difference());
        calc.product(20,30);
        System.out.println("Division= "+calc.division(20,30));

    }

}
