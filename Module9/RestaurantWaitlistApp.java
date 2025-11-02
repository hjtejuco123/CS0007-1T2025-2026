
package TN28_Module9;
//Queue - FIFO

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class RestaurantWaitlistApp {
    public static void main(String[] args) {
        Queue<String> waitlist = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        //Add customer to list
        //Serve next customer
        //view waitinglist
        //exit
        
        
        while(true){
            System.out.println("\nRestaurant WaitingList APP");
            System.out.println("1. Add Customer to Waiting List");
            System.out.println("2. Serve Next Customer ");
            System.out.println("3. View Waiting List");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1:
                    System.out.println("Enter Customer name: ");
                    String customer = scanner.nextLine();
                    waitlist.add(customer);
                    System.out.println("Customer added to wait list");
                    break;
                case 2:
                    //remove poll
                    String nextCustomer = waitlist.poll();
                    if (nextCustomer != null){
                        System.out.println("Serving customer "+nextCustomer);
                    }else{
                        System.out.println("No Customer in waiting list ");
                    }
                    
                    break;
                case 3:
                    System.out.println("Current waiting list");
                    for (String name : waitlist){
                        System.out.println(name);
                    }
                    break;
                case 4:
                    System.out.println("Exit App");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Option ");
                    break;
                  
            
            
            
            
            
            }
        
        
        
        }
    }
}
