//Java Program demostrate this keyword
package Module5;
import java.util.Scanner;
public class ThisKeword {
    private String name;
    private int age;
    // Constructor
    public ThisKeword(String name, int age) {
        this.name = name; // 'this' keyword to refer to the current object's attribute
        this.age = age;   // 'this' keyword to refer to the current object's attribute
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

        ThisKeword obj = new ThisKeword(name, age);
        obj.displayAttributes();

        scanner.close();
    }
}
