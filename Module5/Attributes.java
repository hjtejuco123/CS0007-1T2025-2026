//create a java program that demostrate class attributes

package Module5;

public class Attributes {
    // Class attributes
    private String name;
    private int age;

    // Constructor
    public Attributes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display attribute values
    public void displayAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Attributes obj = new Attributes("Hadji", 30);
        obj.displayAttributes();
    }
}
