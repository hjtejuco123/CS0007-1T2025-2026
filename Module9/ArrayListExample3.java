//Example 3: Accessing Elements

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("First color: " + colors.get(0));
    }
}
