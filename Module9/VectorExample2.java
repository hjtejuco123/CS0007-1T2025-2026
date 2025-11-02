//Example 2: Accessing Elements

import java.util.Vector;

public class VectorExample2 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("First number: " + numbers.firstElement());
    }
}
