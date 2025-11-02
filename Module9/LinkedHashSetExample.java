
//LinkedHashSet
//LinkedHashSet maintains the insertion order of elements while ensuring uniqueness.

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> colors = new LinkedHashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Colors in insertion order: " + colors);
    }
}
