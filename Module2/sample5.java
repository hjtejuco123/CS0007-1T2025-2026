package Module2;
//create a program to demostrate input and output using scanner class
import java.util.Scanner;
public class sample5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();

        // Display the input back to the user
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.printf("Your height is %.2f meters.%n", height);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }    
}
