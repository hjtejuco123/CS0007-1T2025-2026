//create a banking system using procedural programming include menu and user input  
//procedural programming
package Module5;
import java.util.Scanner;

public class sam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;

        while (true) {
            System.out.println("Welcome to the Banking System");
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
                    balance = deposit(balance, depositAmount);
                    System.out.println("Deposited: " + depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    balance = withdraw(balance, withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + balance);
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
    static double deposit(double balance, double amount) {
        return balance + amount;
    }
    static double withdraw(double balance, double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return balance;
        }
        System.out.println("Withdrew: " + amount);
        return balance - amount;
    }
    

}