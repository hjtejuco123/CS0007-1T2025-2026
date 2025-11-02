//Example 5: Updating an Element

import java.util.ArrayList;

public class ArrayListExample5 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Paris");
        cities.set(1, "London"); // Update element at index 1
        System.out.println("Updated cities: " + cities);
    }
}
