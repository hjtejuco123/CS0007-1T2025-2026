//Example 5: Searching in Stack
import java.util.Stack;

public class StackExample5 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Position of 'Banana': " + stack.search("Banana"));
    }
}
