class Debugging{
    public static void display(){
        int x = 123456;
        float f = 100.12f;
        System.out.println("Float : "+ f);
    }
    public static void display1(int x1){
        
        if(x1 >=5){
          int  y = x1;
            System.out.println("Value of y : "+ y);
        }
        

    }

    public static void calculate(){
        final float pi = 3.14f;
        System.out.println("Pi value :" + pi);
    }

    public static void convert(){
        int i = 1234;
        byte b = (byte) i;
        System.out.println("Value of Byte b :" + b);
    }
    public static void main(String args[]){
        display();
        display1(10);
        calculate();
        convert();

        //Scope
        int m = 10;{
             m = 20;
             System.out.println(m);
        }
        System.out.println(m);
    }
}