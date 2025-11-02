//ArrayList
package TN28_Module9;

//import java.util.*;
import java.util.ArrayList;
import java.util.Iterator; // for the iterator loop

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Hadji");//0
        names.add("Bob"); //1
        names.add("James");//2
        names.add("Hadji");//3
       
        System.out.println("ArrayList Elements "+names);
        
        Iterator itr = names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        System.out.println("First Element: "+names.get(0));
        System.out.println("Element 2: "+names.get(2));
        names.remove(1);
        System.out.println("list of names after removal "+names);
        names.remove(1);       
        System.out.println("list of names after removal "+names);

        
    }
}
