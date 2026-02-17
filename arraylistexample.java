import java.util.ArrayList;

public class arraylistexample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("cherry");
        System.out.println(fruits);
        fruits.remove("banana");
        System.out.println(fruits);
        System.out.println("Size of the ArrayList: " + fruits.size());
        System.out.println("contains apple? " + fruits.contains("Apple"));
    }
}
