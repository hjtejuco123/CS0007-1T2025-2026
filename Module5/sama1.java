//create a procedural programming Calculate Area of different shapes with user input include circle, rectangle, square with menu input
package Module5;
import java.util.Scanner;
public class sama1 {
    static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    static double areaOfSquare(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a shape to calculate the area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of Circle: " + areaOfCircle(radius));
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    System.out.println("Area of Rectangle: " + areaOfRectangle(length, width));
                    break;
                case 3:
                    System.out.print("Enter the side of the square: ");
                    double side = scanner.nextDouble();
                    System.out.println("Area of Square: " + areaOfSquare(side));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
