/*
ArrayList Examples
ArrayList is a resizable array implementation of the List interface. It allows random access and maintains insertion order.

Example 1: Adding Elements

*/

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Fruits: " + fruits);
    }
}
