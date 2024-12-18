import java.util.Scanner;

public class GreaterNumber{
    static void display(int a, int b, int c){
        if((a>=b)&&(a>=c)){
            System.out.println("Greatest Number is A: "+a);
        }
        else if((b>=a)&&(b>=c)){
            System.out.println("Greatest Number is B: "+b);
        }
        else System.out.println("Greatest Number is C: "+c);
    }
    public static void main(String[] args){
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A value");
        a=sc.nextInt();
        System.out.println("Enter B value");
        b=sc.nextInt();
        System.out.println("Enter C value");
        c=sc.nextInt();
        display(a, b, c);
    }
        }