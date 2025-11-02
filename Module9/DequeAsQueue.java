//Deque (Double-Ended Queue)
//The Deque interface extends the Queue interface and allows insertion and removal of elements from both ends. 
//This makes it versatile for implementing stacks or queues.

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsQueue {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Task1");
        deque.add("Task2");
        deque.add("Task3");

        System.out.println("Processing tasks (FIFO):");
        while (!deque.isEmpty()) {
            System.out.println(deque.poll());
        }
    }
}
