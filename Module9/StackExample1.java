//Stack Examples
//Stack is a subclass of Vector that implements a LIFO (Last-In-First-Out) data structure.

import java.util.Stack;

public class StackExample1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Plate1");
        stack.push("Plate2");
        stack.push("Plate3");
        System.out.println("Stack: " + stack);
    }
}

