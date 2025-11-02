//Example 4: Iterating with a ListIterator
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample4 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        ListIterator<String> iterator = colors.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
