
package Module6;

import java.util.Scanner;

public class MainShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        
        
        do {
        
            System.out.println("\nMenu");
            System.out.println("1. Create A circle ");
            System.out.println("2. Create A Retangcle ");
            System.out.println("3. Exit ");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1:
                    System.out.print("Enter color of circle: ");
                    String circleColor = scanner.nextLine();
                    System.out.print("Enter radius ");
                    double radius = scanner.nextDouble();
                    
                    Circle circle = new Circle(circleColor, radius);
                    circle.displayColor();
                    circle.calculateArea();
                    break;
                    
                case 2:
                    System.out.print("Enter color of rectangle: ");
                    String rectangleColor = scanner.nextLine();
                    
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    
                    Rectangle rectangle = new Rectangle(rectangleColor,length,width);
                    rectangle.displayColor();
                    rectangle.calculateArea();
                    break;
                
                case 3:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid Choice ");

            }      
        }while (choice !=3);
        scanner.close();
        
    }
}
