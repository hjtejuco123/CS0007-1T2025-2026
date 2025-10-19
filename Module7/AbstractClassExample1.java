//Sample 8: Abstract Class Example with Subclasses

package Module7;

// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();

    // Non-abstract method to display details
    public void displayDetails(String shapeType) {
        System.out.println("This is a " + shapeType);
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayDetails(String shapeType) {
        super.displayDetails(shapeType);
        System.out.println("Radius: " + radius);
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void displayDetails(String shapeType) {
        super.displayDetails(shapeType);
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

// Main class to demonstrate abstract class usage
public class AbstractClassExample1 {
    public static void main(String[] args) {
        // Create objects of Circle and Rectangle
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Display details and calculate area using polymorphism
        circle.displayDetails("Circle");
        System.out.println("Area: " + circle.calculateArea());

        rectangle.displayDetails("Rectangle");
        System.out.println("Area: " + rectangle.calculateArea());
    }
}