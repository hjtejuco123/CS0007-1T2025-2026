//Java Program that demonstrate class mutators (setters) and 
//setters with user input
package Module5;
import java.util.Scanner;
public class Mutator {
    private String name;
    //setter method to set the value of name
    public void setName(String name) {
        this.name = name;
    }
    //getter method to get the value of name
    public String getName() {
        return name;
    }
    
    public static void main(String[] args) {
        Mutator obj = new Mutator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userInput = scanner.nextLine();
        obj.setName(userInput); //using setter to set the name
        System.out.println("Your name is: " + obj.getName()); //using getter to get the name
        scanner.close();

    }  
}
