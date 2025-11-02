//Example 3: Peeking at the Top Element
import java.util.Stack;

public class StackExample3 {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        System.out.println("Top element: " + numbers.peek());
    }
}
