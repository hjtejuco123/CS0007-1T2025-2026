
package TN28_Module9;

//Queue

import java.util.Queue;
import java.util.LinkedList;

public class SimpleQueueExample {
    public static void main(String[] args) {
        //FIFO
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(10);//Enqueue (add elemement)
        queue.add(20);
        queue.add(30);
        
        System.out.println("List "+queue);
        //first element
        System.out.println("First Element "+queue.peek());
        //remove poll (dequeue)
        System.out.println("Remove element "+queue.poll());
        System.out.println("List "+queue);
        
        
        
        
        
    }
}
