package Module2;
//create a program to demostrate input and output using scanner class
//use all data types
import java.util.Scanner;
public class sample5 {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);

        // Taking input of different data types
        System.out.print("Enter an integer: ");
        int myInt = scanner.nextInt();

        System.out.print("Enter a double: ");
        double myDouble = scanner.nextDouble();

        System.out.print("Enter a character: ");
        char myChar = scanner.next().charAt(0);

        System.out.print("Enter a boolean (true/false): ");
        boolean myBoolean = scanner.nextBoolean();

        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume the newline character
        String myString = scanner.nextLine();

        // Displaying the input values
        System.out.println("You entered:");
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("String: " + myString);

        // Closing the scanner
        scanner.close();
      
    }    
}
