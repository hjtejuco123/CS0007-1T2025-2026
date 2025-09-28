//Java Program that demostrate class constructor
package Module5;

public class Constructor {
    // Class attributes
    private String name;
    private int age;

    // Constructor
    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display attribute values
    public void displayAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor("Hadji", 30);
        obj.displayAttributes();
    }
}
