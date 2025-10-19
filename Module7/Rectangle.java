//Sample 4 Constructor Overloading Example with User Input
package Module7;
import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Constructor with one parameter (square)
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    // Constructor with two parameters
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Rectangle Program!");

        // Loop to allow multiple rectangle creations
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Create a default rectangle");
            System.out.println("2. Create a square");
            System.out.println("3. Create a custom rectangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            Rectangle rectangle = null;

            switch (choice) {
                case 1:
                    rectangle = new Rectangle(); // Default constructor
                    break;
                case 2:
                    System.out.print("Enter the side length of the square: ");
                    double side = scanner.nextDouble();
                    rectangle = new Rectangle(side); // Single-parameter constructor
                    break;
                case 3:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    rectangle = new Rectangle(length, width); // Two-parameter constructor
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            // Display the area of the rectangle
            System.out.println("The area of the rectangle is: " + rectangle.getArea());
        }
    }
}