//sample2: Banking System with Function Overloading
package Module7;
import java.util.Scanner;

// Main class to demonstrate function overloading in a banking system
public class BankingSystem {

    // Method to add a SavingsAccount with account number and initial balance
    public void addAccount(int accountNumber, double initialBalance) {
        System.out.println("\nAdding a Savings Account...");
        System.out.println("Account Type: Savings");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Initial Balance: $" + initialBalance);
        System.out.println("Account successfully created!");
    }

    // Overloaded method to add a CurrentAccount with account number, initial balance, and overdraft limit
    public void addAccount(int accountNumber, double initialBalance, double overdraftLimit) {
        System.out.println("\nAdding a Current Account...");
        System.out.println("Account Type: Current");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Initial Balance: $" + initialBalance);
        System.out.println("Overdraft Limit: $" + overdraftLimit);
        System.out.println("Account successfully created!");
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingSystem bankingSystem = new BankingSystem();
        boolean continueLoop = true;

        System.out.println("Welcome to the Banking System!");

        // Loop to allow the user to try again or add another account
        while (continueLoop) {
            try {
                // Prompt the user to choose the type of account to add
                System.out.println("\nChoose the type of account to add:");
                System.out.println("1. Savings Account");
                System.out.println("2. Current Account");
                System.out.print("Enter your choice (1 or 2): ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    // Add a SavingsAccount
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Enter Initial Balance: $");
                    double initialBalance = scanner.nextDouble();

                    // Call the overloaded method for SavingsAccount
                    bankingSystem.addAccount(accountNumber, initialBalance);
                } else if (choice == 2) {
                    // Add a CurrentAccount
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Enter Initial Balance: $");
                    double initialBalance = scanner.nextDouble();
                    System.out.print("Enter Overdraft Limit: $");
                    double overdraftLimit = scanner.nextDouble();

                    // Call the overloaded method for CurrentAccount
                    bankingSystem.addAccount(accountNumber, initialBalance, overdraftLimit);
                } else {
                    System.out.println("Invalid choice. Please try again.");
                    continue; // Restart the loop
                }

                // Ask the user if they want to add another account
                System.out.print("\nDo you want to add another account? (yes/no): ");
                String response = scanner.next().toLowerCase();
                if (!response.equals("yes")) {
                    continueLoop = false; // Exit the loop
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        System.out.println("\nThank you for using the Banking System!");
        scanner.close();
    }
}