//Sample 6: Constructor Overloading Example with User Input
package Module7;
import java.util.Scanner;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Default constructor
    public BankAccount() {
        this.accountHolder = "Unknown";
        this.accountNumber = 0;
        this.balance = 0.0;
    }

    // Constructor with account holder and account number
    public BankAccount(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Constructor with account holder, account number, and initial balance
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Account Number: " + accountNumber + ", Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many bank accounts do you want to create? ");
        int numAccounts = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        BankAccount[] accounts = new BankAccount[numAccounts];

        for (int i = 0; i < numAccounts; i++) {
            System.out.println("\nEnter details for Account " + (i + 1) + ":");
            System.out.print("Do you want to set an initial balance? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();

            if (response.equals("yes")) {
                System.out.print("Enter account holder's name: ");
                String accountHolder = scanner.nextLine();
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                System.out.print("Enter initial balance: $");
                double balance = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                accounts[i] = new BankAccount(accountHolder, accountNumber, balance); // Three-parameter constructor
            } else {
                System.out.print("Enter account holder's name: ");
                String accountHolder = scanner.nextLine();
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                accounts[i] = new BankAccount(accountHolder, accountNumber); // Two-parameter constructor
            }
        }

        // Display all account details
        System.out.println("\nBank Account Details:");
        for (BankAccount account : accounts) {
            account.displayDetails();
        }

        scanner.close();
    }
}