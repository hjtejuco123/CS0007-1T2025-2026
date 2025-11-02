//PriorityQueue is a class that implements the Queue interface. 
//It orders elements based on their natural ordering or a custom comparator provided at construction time.
//Example 1: Basic Usage

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(20);

        System.out.println("Head of queue: " + priorityQueue.peek()); // Output: 5
        System.out.println("Processing elements:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
