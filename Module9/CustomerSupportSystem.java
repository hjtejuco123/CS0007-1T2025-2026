
package TN28_Module9;

import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerSupportSystem {
    public static void main(String[] args) {
        PriorityQueue<Integer> urgencyQueue = new PriorityQueue<>();
        Queue<String> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner (System.in);
        //Add Customer Ticket
        //Process Ticket
        //View All Tickets
        //Exit
        while(true){
        
            System.out.println("Customer Support APP");
            System.out.println("1. Add Customer Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. View All Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
            
                case 1:
                    System.out.println("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.println("Enter priority 1 high, the rest low");
                    int urgencyLevel = scanner.nextInt();
                    scanner.nextLine();
                    
                    //add queue
                    urgencyQueue.add(urgencyLevel);
                    customerQueue.add(customerName);
                    System.out.println("Ticket added for "+customerName+ " with urgency level "+urgencyLevel);
                    break;
            
                case 2:
                    if (!urgencyQueue.isEmpty() && !customerQueue.isEmpty()){
                        int nextUrgency = urgencyQueue.poll();
                        String nextCustomer = customerQueue.poll();
                        System.out.println("Ppocessing ticket for "+nextCustomer+ "with urgency level of "+nextUrgency);
                    
                    }else{
                        System.out.println("No ticket to process");
                    }
           
                    break;
                    
                case 3:
                     if (!urgencyQueue.isEmpty() && !customerQueue.isEmpty()) {
                        System.out.println("All Tickets in Queue:");
                        System.out.println("Customer Name - Urgency Level");
                        // Display customers and urgency levels
                        PriorityQueue<Integer> tempUrgencyQueue = new PriorityQueue<>(urgencyQueue);
                        Queue<String> tempCustomerQueue = new LinkedList<>(customerQueue);
                        while (!tempUrgencyQueue.isEmpty() && !tempCustomerQueue.isEmpty()) {
                            System.out.println(tempCustomerQueue.poll() + " - " + tempUrgencyQueue.poll());
                        }
                    } else {
                        System.out.println("No tickets in the queue.");
                    }
                    break;
          
                case 4:
                    System.out.println("Exit APP");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid Choice: ");
                    break;

            }
            
        
        
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
