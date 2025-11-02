//Example 5: Using as a Queue (FIFO)
import java.util.LinkedList;

public class LinkedListExample5 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");

        System.out.println("Processing tasks:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Removes and returns the head
        }
    }
}
