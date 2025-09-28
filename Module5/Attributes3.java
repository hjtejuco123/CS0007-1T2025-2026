//Java Program that demostrate class attributes with user input
//banking system using OOP include menu and user input

package Module5;
import java.util.Scanner;   
public class Attributes3 {
    // Class attributes
    private String name;
    private int age;
    private double balance;

    // Constructor
    public Attributes3(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    // Method to display attribute values
    public void displayAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        Attributes3 obj = new Attributes3(name, age, balance);
        obj.displayAttributes();

        while (true) {
            System.out.println("Welcome " + name);
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    obj.balance += depositAmount;
                    System.out.println("Deposited: " + depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > obj.balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        obj.balance -= withdrawAmount;
                        System.out.println("Withdrew: " + withdrawAmount);
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: " + obj.balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the Banking System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
