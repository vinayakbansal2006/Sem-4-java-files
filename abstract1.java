abstract class shape{
    abstract void draw();
    void message(){
        System.out.println("this is a shape");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("drawing a circle");
    }
}
public class abstract1 {
    public static void main(String[] args) {
        shape s = new circle();
        s.message();  
        s.draw();
    }
}
