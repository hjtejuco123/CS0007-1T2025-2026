//Example 4: Checking Capacity
import java.util.Vector;

public class VectorExample4 {
    public static void main(String[] args) {
        Vector<Integer> scores = new Vector<>(5); // Initial capacity 5
        scores.add(10);
        scores.add(20);
        System.out.println("Current capacity: " + scores.capacity());
    }
}
