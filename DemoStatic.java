class Demo{
    static{
        System.out.println("Static Block");
    }
    static void message(){
        System.out.println("static Method");
    }
}

    public class DemoStatic{
        public static void main(String[] args) {
           // Demo d= new Demo();
            Demo.message();
        }
    }

