//sample 3: Method Overloading Example
package Module7;    
public class AreaCalculator {

    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public double calculateArea(double base, double height, String shapeType) {
        if (shapeType.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        } else {
            throw new IllegalArgumentException("Invalid shape type");
        }
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Calculate area of a circle
        double circleArea = calculator.calculateArea(5.0);
        System.out.println("Area of Circle: " + circleArea);

        // Calculate area of a rectangle
        double rectangleArea = calculator.calculateArea(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Calculate area of a triangle
        double triangleArea = calculator.calculateArea(3.0, 4.0, "triangle");
        System.out.println("Area of Triangle: " + triangleArea);
    }
}