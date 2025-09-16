package Module4;
//while loop
//create a program to ask the user to enter a number and detmine if positive or negative, if negative ask again until positive
import java.util.Scanner;
/*syntax 
    while(condition){
        statements
    }
*/
public class sample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number > 0) {
                System.out.println("The number is positive.");
                break;
            } else {
                System.out.println("The number is negative. Please enter a positive number.");
            }
        }

        scanner.close();
    }
}

