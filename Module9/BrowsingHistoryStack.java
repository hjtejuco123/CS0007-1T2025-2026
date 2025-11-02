
package TN28_Module9;

//LIFO (insert - push)(remove - pop)

import java.util.Stack;

public class BrowsingHistoryStack {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        
        //add
        history.push("Home Page");
        history.push("About Us");
        history.push("Services");
        history.push("Contact Us");
        
        //display
        System.out.println("Current browsing history");
        for (String page : history){
            System.out.println(page);
        }
        
        System.out.println("Top page: "+history.peek());
        System.out.println();
        System.out.println("Remove current page "+history.pop());
        
        System.out.println("Updated browsing history");
        for (String page : history){
            System.out.println(page);
        }
        System.out.println("Top page: "+history.peek());

//        //display
//        System.out.println("Current browsing history");
//        for (String page : history){
//            System.out.println(page);
//        }
////        
//        System.out.println();
//        System.out.println("Current page "+history.peek());
////        
        
    }
}
