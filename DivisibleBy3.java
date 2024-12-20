import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args){
        int i,num;
        System.out.println("Enter the numbers");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        sc.close();
        System.out.print("Numbers Divisible by 3 are: ");
        for(i=1;i<=num;i++){
            if(i%3==0){
                System.out.print(i+" ");
            }
        }
        
    }
}
