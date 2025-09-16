//create a program to determine the color B=Blue or b=blue, G=Green or g=green, R=Red or r=red, Y=Yellow or y=yellow
//use switch case
package Module4;
import java.util.Scanner;
public class sample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a color code (B/G/R/Y): ");
        char colorCode = scanner.next().charAt(0);
        String colorName;

        switch (colorCode) {
            case 'B':
            case 'b':
                colorName = "Blue";
                break;
            case 'G':
            case 'g':
                colorName = "Green";
                break;
            case 'R':
            case 'r':
                colorName = "Red";
                break;
            case 'Y':
            case 'y':
                colorName = "Yellow";
                break;
            default:
                colorName = "Invalid color code";
        }

        System.out.println("The color is: " + colorName);
        scanner.close();
    }
}
