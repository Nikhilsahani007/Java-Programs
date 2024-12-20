import java.util.Scanner;

public class PrintNum {
    //Printing Numbers in range without multiples of 5
    void printNums(int range)
    {
        System.out.println("Number in range without multiples of 5");
        for(int i=1;i<=range;i++)
        {
            if(i%5==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
    //Printing half range of the given range
    static void printHalf(int range)
    {
        System.out.println("\nHalf of the range");
        for(int i=1;i<=range/2;i++)
        {
           if(i==range+1/2){
           break;
           }
           System.out.print(i+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        PrintNum obj = new PrintNum();
        obj.printNums(range);
        System.out.print("\n\n");
        printHalf(range);
        }
    }

