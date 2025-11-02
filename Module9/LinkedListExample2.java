//Example 2: Adding at Specific Positions
import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<Integer> scores = new LinkedList<>();
        scores.add(10);
        scores.add(20);
        scores.add(1, 15); // Add 15 at index 1
        System.out.println("Scores: " + scores);
    }
}
