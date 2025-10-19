//Sample 7: Constructor Overloading Example with User Input
package Module7;
import java.util.Scanner;

public class BankAccount2 {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Default constructor
    public BankAccount2() {
        this.accountHolder = "Unknown";
        this.accountNumber = 0;
        this.balance = 0.0;
    }

    // Constructor with account holder and account number
    public BankAccount2(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Constructor with account holder, account number, and initial balance
    public BankAccount2(String accountHolder, int accountNumber, double balance) {
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
        boolean continueLoop = true;

        System.out.println("Welcome to the Bank Account Management System!");

        while (continueLoop) {
            try {
                System.out.print("\nHow many bank accounts do you want to create? ");
                int numAccounts = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (numAccounts <= 0) {
                    System.out.println("Number of accounts must be greater than zero. Please try again.");
                    continue; // Restart the loop
                }

                BankAccount2[] accounts = new BankAccount2[numAccounts];

                for (int i = 0; i < numAccounts; i++) {
                    boolean validInput = false;

                    while (!validInput) {
                        try {
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
                                accounts[i] = new BankAccount2(accountHolder, accountNumber, balance); // Three-parameter constructor
                                validInput = true; // Exit the inner loop
                            } else if (response.equals("no")) {
                                System.out.print("Enter account holder's name: ");
                                String accountHolder = scanner.nextLine();
                                System.out.print("Enter account number: ");
                                int accountNumber = scanner.nextInt();
                                scanner.nextLine(); // Consume newline
                                accounts[i] = new BankAccount2(accountHolder, accountNumber); // Two-parameter constructor
                                validInput = true; // Exit the inner loop
                            } else {
                                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please try again.");
                            scanner.nextLine(); // Clear the invalid input
                        }
                    }
                }

                // Display all account details
                System.out.println("\nBank Account Details:");
                for (BankAccount2 account : accounts) {
                    account.displayDetails();
                }

                // Ask the user if they want to try again
                System.out.print("\nDo you want to create more accounts? (yes/no): ");
                String response = scanner.nextLine().toLowerCase();
                if (!response.equals("yes")) {
                    continueLoop = false; // Exit the loop
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        System.out.println("\nThank you for using the Bank Account Management System!");
        scanner.close();
    }
}