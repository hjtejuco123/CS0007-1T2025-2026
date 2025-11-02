//Example 3: Removing Elements
import java.util.LinkedList;

public class LinkedListExample3 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.removeFirst(); // Remove first element
        System.out.println("Fruits after removal: " + fruits);
    }
}
