
package TN28_Module9;

import java.util.Deque;
import java.util.ArrayDeque;

public class SimpleDequeExample {
    public static void main(String[] args) {
        Deque<String> taskQueue = new ArrayDeque<>();
        
        //add elements
        taskQueue.addLast("Task 1 - End");
        taskQueue.addLast("Task 2 - End");
        taskQueue.addFirst("Task 3 - Start");
        taskQueue.addFirst("Task 4 - Start");
        
        System.out.println("Elements "+taskQueue);
        
        System.out.println(taskQueue.removeFirst());
        System.out.println("Elements "+taskQueue);
//        System.out.println(taskQueue.removeFirst());
//        System.out.println("Elements "+taskQueue);
        System.out.println(taskQueue.removeLast());
        System.out.println("Elements "+taskQueue);



        
    }
}
