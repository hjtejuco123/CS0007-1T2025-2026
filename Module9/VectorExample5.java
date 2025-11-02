//Example 5: Iterating with Enumeration
import java.util.Enumeration;
import java.util.Vector;

public class VectorExample5 {
    public static void main(String[] args) {
        Vector<String> cities = new Vector<>();
        cities.add("New York");
        cities.add("Paris");
        cities.add("London");

        Enumeration<String> enumeration = cities.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
