abstract class car {
    abstract void speed();
    void message(){
        System.out.println("this is a car");
    }
}
class audi extends car1{
    void speed(){
        System.out.println("audi speed is 200km/hr");
    }
}

public class inheritance9 {
    public static void main(String[] args) {
        audi a = new audi();
        a.message();
        a.speed();
    }
}
