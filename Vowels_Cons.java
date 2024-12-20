import java.util.Scanner;
public class Vowels_Cons {
    static void display(char ch){
        if((ch=='a')||(ch=='e')||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
            System.out.println("Given Character is Vowel: " + ch);
        }
        else if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){
                System.out.println("Invalid character");
            }
         else System.out.println("Given Character is Consonant");
    }
    public static void main(String[] args){
        char ch;
        System.out.println("Enter a Character");
        Scanner sc= new Scanner(System.in);
        ch=sc.next().charAt(0);
        display(ch);
        sc.close();
    }
}