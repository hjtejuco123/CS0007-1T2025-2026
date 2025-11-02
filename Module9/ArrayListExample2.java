//Example 2: Removing Elements

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.remove(Integer.valueOf(20)); // Remove by value
        System.out.println("Numbers after removal: " + numbers);
    }
}
