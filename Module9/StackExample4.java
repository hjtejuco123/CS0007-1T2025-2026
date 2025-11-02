//Example 4: Checking if Stack is Empty
import java.util.Stack;

public class StackExample4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.push("Item1");
        System.out.println("Is stack empty after push? " + stack.isEmpty());
    }
}
