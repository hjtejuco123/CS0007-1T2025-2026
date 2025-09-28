//Java Program that demostrate class attributes with user input

package Module5;
import java.util.Scanner;
public class Attributes2 {
    // Class attributes
    private String name;
    private int age;

    // Constructor
    public Attributes2(String name, int age) {
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

        Attributes2 obj = new Attributes2(name, age);
        obj.displayAttributes();

        scanner.close();
    }
}
