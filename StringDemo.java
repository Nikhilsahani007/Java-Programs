public class StringDemo {
    public static void main(String[] args) {
        String str="Hello World! ";
        String str2 = "I'm Batman";
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)); 
        } 
        System.out.println("Index of H "+str.indexOf("H"));
            System.out.println("UpperCase "+str.toUpperCase());
            System.out.println("LowerCase "+str.toLowerCase());
            System.out.println(str);
            System.out.println(str.equals(str2));
            System.out.println(str.compareTo(str2));
            System.out.println(str2);
            System.out.println(str.hashCode());
            System.out.println(str.concat(str2));
           
    }
}
