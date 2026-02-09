class Animal {
    Animal() {
        System.out.println("Animal makes a sound");
    }
}
class dog extends Animal {
    dog() {
        System.out.println("my name is dog");
    }

}
public class pracrtise1 {
    public static void main(String[] args) {
        dog d = new dog();
    }
}
