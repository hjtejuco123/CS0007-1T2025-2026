//Example 4: Iterating Through the List

import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
