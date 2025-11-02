//ArrayDeque
//ArrayDeque is a resizable-array implementation of the Deque interface. 
//It is faster than LinkedList for most operations and does not allow null values.
//Example 1: Adding and Removing Elements
import java.util.ArrayDeque;

public class ArrayDequeExamplea {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Red");
        deque.add("Green");
        deque.add("Blue");

        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        deque.removeFirst();
        System.out.println("After removing first element: " + deque);
    }
}
