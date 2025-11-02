//Example 2: Custom Comparator
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueCustomComparator {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add("Apple");
        priorityQueue.add("Banana");
        priorityQueue.add("Cherry");

        System.out.println("Processing elements in reverse order:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
