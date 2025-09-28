//Java Program that demostrate class constructor
//with user input
package Module5;
import java.util.Scanner;
public class Constructor3 {
    // Class attributes
    private String name;
    private int age;

    // Constructor
    public Constructor3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display attribute values
    public void displayAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        Constructor3 obj = new Constructor3(name, age);
        obj.displayAttributes();

        scanner.close();
    }
}
