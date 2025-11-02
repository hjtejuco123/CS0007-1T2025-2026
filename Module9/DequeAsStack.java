//Example 2: Using ArrayDeque as a Stack
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsStack {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Plate1");
        stack.push("Plate2");
        stack.push("Plate3");

        System.out.println("Processing plates (LIFO):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
