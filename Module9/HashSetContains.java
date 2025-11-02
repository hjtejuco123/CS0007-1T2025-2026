
//Example 2: Checking for Existence
import java.util.HashSet;

public class HashSetContains {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Does set contain 20? " + numbers.contains(20));
    }
}
