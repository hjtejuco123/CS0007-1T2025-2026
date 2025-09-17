package Module2;
//create a sample banking application using all the data types and scanner class
import java.util.Scanner;
public class sample6 {
    public static void main(String[] args) {
        // Sample banking application
        String accountHolderName;
        int accountNumber;
        double accountBalance;
        boolean isActive;
        char accountType;

        Scanner scanner = new Scanner(System.in);

        // Taking user input for account details
        System.out.print("Enter account holder name: ");
        accountHolderName = scanner.nextLine();

        System.out.print("Enter account number: ");
        accountNumber = scanner.nextInt();

        System.out.print("Enter account balance: ");
        accountBalance = scanner.nextDouble();

        System.out.print("Is the account active? (true/false): ");
        isActive = scanner.nextBoolean();

        System.out.print("Enter account type (S for Savings, C for Checking): ");
        accountType = scanner.next().charAt(0);

        // Closing the scanner
        scanner.close();

        // Displaying account details
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Account Balance: $%.2f%n", accountBalance);
        System.out.println("Account Active: " + isActive);
        System.out.println("Account Type: " + accountType);

        // Simulating a deposit
        double depositAmount = 500.00;
        accountBalance += depositAmount;
        System.out.printf("After depositing $%.2f, new balance is: $%.2f%n", depositAmount, accountBalance);

        // Simulating a withdrawal
        double withdrawalAmount = 200.00;
        if (withdrawalAmount <= accountBalance) {
            accountBalance -= withdrawalAmount;
            System.out.printf("After withdrawing $%.2f, new balance is: $%.2f%n", withdrawalAmount, accountBalance);
        } else {
            System.out.println("Insufficient funds for withdrawal of $" + withdrawalAmount);
        }
    }
}
