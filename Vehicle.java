public class Vehicle {
    int wheels;
    int speed;
    String name;
    void setvalues(int w, int s, String n){
        wheels = w;
        speed = s;
        name = n;
    }
    void getValues(){
        System.out.println("Vehicles Details: "+wheels+", "+speed+", "+name);
    }
}
