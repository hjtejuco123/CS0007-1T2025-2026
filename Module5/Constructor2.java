//Java Program that demostrate class constructor
//different types of constructors
package Module5;

public class Constructor2 {
    // Class attributes
    private String name;
    private int age;

    // Default constructor
    public Constructor2() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Constructor2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display attribute values
    public void displayAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Constructor2 obj1 = new Constructor2();
        obj1.displayAttributes();

        Constructor2 obj2 = new Constructor2("Hadji", 30);
        obj2.displayAttributes();
    }
}

