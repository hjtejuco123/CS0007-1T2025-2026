//Example 3: Removing Elements

import java.util.Vector;

public class VectorExample3 {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.remove("Banana");
        System.out.println("Fruits after removal: " + fruits);
    }
}
