public class Operators {
    public static void main(String[] args) {
        // Unary
        System.out.println("Unary Operator");
        int num1 = 10;
        int num2;
        System.out.println("num1= " + num1);
        // Pre Increment
        num2 = ++num1;
        System.out.println("num1= " + num1 + " " + "num2= " + num2);
        // Post Increment
        num2 = num1++;
        System.out.println("num1= " + num1 + " " + "num2= " + num2);
        // Pre Decrement
        num2 = --num1;
        System.out.println("num1= " + num1 + " " + "num2= " + num2);
        // Post Decrement
        num2 = num1--;
        System.out.println("num1= " + num1 + " " + "num2= " + num2);
        // unary operations on Char
        char ch = 'a';
        System.out.println("char= " + ch);
        // Pre Increment
        char ch1 = ++ch;
        System.out.println("Char= " + ch1);
        // Post Increment
        ch1 = ch++;
        System.out.println("Char= " + ch);
        // Pre Decrement
        ch1 = --ch;
        System.out.println("Char= " + ch);
        // Post Decrement
        ch1 = ch--;
        System.out.println("Char= " + ch);
        // operations on
        // Arithmetic Operators
        System.out.println("\n");
        System.out.println("Arithmetic Operators");
        double n1 = 10.0, n2 = 15.0;
        System.out.println("num1= 10 & num2= 15");
        // Addition
        System.out.println("Sum= " + (n1 + n2));
        // Subtraction
        System.out.println("Difference= " + (n1 - n2));
        // Multiplication
        System.out.println("Product= " + (n1 * n2));
        // Division
        System.out.println("Division= " + (n1 / n2));
        // Remainder
        System.out.println("Remainder= " + (n1 % n2));
        // Operations on
        // Relational Operators
        System.out.println("\n");
        System.out.println("Relational Operators");
        int n3 = 10, n4 = 15;
        System.out.println("num1= 10 & num2= 15");
        System.out.println("num1>num2: " + (n3 > n4));
        System.out.println("num1<num2: " + (n3 < n4));
        System.out.println("num1<=num2: " + (n3 <= n4));
        System.out.println("num1>=num2: " + (n3 >= n4));
        System.out.println("num1==num2: " + (n3 == n4));
        System.out.println("num1!=num2: " + (n3 != n4));
        // Using Char
        System.out.println("char1= 'a' char2= 'b'");
        char ch2 = 'a', ch3 = 'b';
        System.out.println("char1>char2: " + (ch2 > ch3));
        System.out.println("char1<char2: " + (ch2 < ch3));
        System.out.println("char1<=char2: " + (ch2 <= ch3));
        System.out.println("char1>=char2: " + (ch2 >= ch3));
        System.out.println("char1==char2: " + (ch2 == ch3));
        System.out.println("char1!=char2: " + (ch2 != ch3));

        //Operations using
        //Assignment Operators
        System.out.println("\nAssignment Operators");
        System.out.println("num= 10");
        int num5=10;
        System.out.println("num+=10= "+(num5+=10));
        System.out.println("num-=10= "+(num5-=10));
        System.out.println("num*=10= "+(num5*=10));
        System.out.println("num/=10= "+(num5/=10));
        System.out.println("num%=10= "+(num5%=10));
        //Operations using
        //Logical Operators
        System.out.println("\nLogical Operations");
        System.out.println("a= true, b= false");
        boolean a= true, b= false;
        System.out.println(a && b);//Logical AND
        System.out.println(a||b);//Logical OR
        System.out.println(!b);//Logical NOT
        //Operations Using
        //Bitwise Operators
        System.out.println("\nBitWise Operators");
        int c=10, d=20;
        System.out.println("c= 10, d= 20");
        System.out.println(c&d);//Bitwise AND
        System.out.println(c|d);//Bitwise OR
        System.out.println(c^d);//Bitwise XOR
        System.out.println(~c);//Complement
        System.out.println(~d);//Complement
        System.out.println(c<<2);//Right Shift
        System.out.println(c>>2);//Left Shift
        System.out.println(c>>>2);//Left Shift
        //Operations using
        //Ternary Operator
        System.out.println("\nTernary Operator");
        int val1= 20, val2=30;
        System.out.println("Val1=20, Val2= 30");
        int val=val1>val2?val1:val2;
        System.out.println(val);
    }
}