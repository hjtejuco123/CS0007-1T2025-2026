
package TN28_Module9;

import java.util.PriorityQueue;
public class SimplePriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQue = new PriorityQueue<>();
        //add
        priorityQue.add(30);
        priorityQue.add(10);
        priorityQue.add(20);
        priorityQue.add(40);
        
        System.out.println("list "+priorityQue);
        System.out.println("remove priority order");
        while(!priorityQue.isEmpty()) {
            System.out.println(priorityQue.poll());
        }
    }
}
