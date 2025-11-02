
package TN28_Module9;
//import java.util.*;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.addFirst(5);
        numbers.addLast(100);
        System.out.println("Elements "+numbers);
        
        Iterator itr = numbers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("Elements "+numbers);
    }
    
    
}
