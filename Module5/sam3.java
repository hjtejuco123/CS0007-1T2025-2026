//create a banking system using procedural programming include menu and user input use array

package Module5;
import java.util.Scanner; 
public class sam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] balances = new double[5]; // Array to hold balances for 5 users
        int userId;

        System.out.print("Enter your user ID (0-4): ");
        userId = scanner.nextInt();

        if (userId < 0 || userId >= balances.length) {
            System.out.println("Invalid user ID.");
            scanner.close();
            return;
        }

        while (true) {
            System.out.println("Welcome User " + userId);
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
                    balances[userId] = deposit(balances[userId], depositAmount);
                    System.out.println("Deposited: " + depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    balances[userId] = withdraw(balances[userId], withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + balances[userId]);
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
