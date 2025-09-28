//Java banking program that demonstrates class mutators (setters) and 
//getters with user input
package Module5;
import java.util.Scanner;
public class Mutator2 {
    private String accountHolderName;
    private double accountBalance;

    // Setter for accountHolderName
    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for accountBalance
    public void setAccountBalance(double balance) {
        this.accountBalance = balance;
    }

    // Getter for accountBalance
    public double getAccountBalance() {
        return accountBalance;
    }

    public static void main(String[] args) {
        Mutator2 bankAccount = new Mutator2();
        Scanner scanner = new Scanner(System.in);

        // Input for account holder name
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        bankAccount.setAccountHolderName(name);

        // Input for account balance
        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();
        bankAccount.setAccountBalance(balance);

        // Displaying account information
        System.out.println("Account Holder Name: " + bankAccount.getAccountHolderName());
        System.out.println("Account Balance: " + bankAccount.getAccountBalance());

        scanner.close();
    }
}
