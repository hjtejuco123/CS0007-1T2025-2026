//Vector Examples
//Vector is similar to ArrayList but is synchronized, making it thread-safe.

//Example 1: Adding Elements

import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector<String> animals = new Vector<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        System.out.println("Animals: " + animals);
    }
}
