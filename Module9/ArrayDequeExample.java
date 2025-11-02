
package TN28_Module9;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque <String> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("ArrayDeque Operations");
            System.out.println("1. Enqueue add to end");
            System.out.println("2. Dequeue remove from front");
            System.out.println("3. Add to front");
            System.out.println("4. Remove from end");
            System.out.println("5. Peek at front");
            System.out.println("6. Peek at end");
            System.out.println("7. View");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
                    
            switch(choice){
                case 1:
                    System.out.println("Enter the element to insert");
                    String enqueueElement = scanner.nextLine();
                    deque.addLast(enqueueElement);
                    System.out.println("Enqueue "+enqueueElement);
                    break;
                case 2:
                    if (!deque.isEmpty()){
                        String dequeueElement = deque.removeFirst();
                        System.out.println("Dequeued "+dequeueElement);
                    }else{
                        System.out.println("Deque is Empty ");
                    }
                    break;
                case 3:
                    System.out.println("Enter the element to insert to front");
                    String frontElement = scanner.nextLine();
                    deque.addFirst(frontElement);
                    System.out.println("Enqueue to front "+frontElement);
                    break;
                case 4:
                    if (!deque.isEmpty()){
                        String endElement = deque.removeLast();
                        System.out.println("Removed "+endElement);
                    }else{
                        System.out.println("Deque is Empty ");
                    }
                    break;
                case 5:
                    if (!deque.isEmpty()){
                        System.out.println("Front element "+deque.peekFirst());
                    }else{
                        System.out.println("Deque is Empty ");
                    }
                    
                    
                    break;
                case 6:
                    if (!deque.isEmpty()){
                        System.out.println("Front element "+deque.peekLast());
                    }else{
                        System.out.println("Deque is Empty ");
                    }
                    break;
                case 7:
                    System.out.println("Content is "+deque);
                    break;
                case 8:
                    System.out.println("Exit...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice ");
                    break;
                   
            
            
            }
        
        
        
        
        }
        
        
        
    }




    
}
