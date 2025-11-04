
package Module10;

import java.io.*;
import java.util.Scanner;

public class BankingSystem {
    ///Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10  
    private static final String FILE_NAME = "/Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10/account.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = readBalanceFromFile();

        while (true) {
            System.out.println("\n=== Banking System ===");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    try {
                        double depositAmount = Double.parseDouble(scanner.nextLine());
                        if (depositAmount < 0) {
                            System.out.println("Deposit amount cannot be negative.");
                        } else {
                            balance += depositAmount;
                            writeBalanceToFile(balance);
                            System.out.printf("Deposited %.2f successfully.\n", depositAmount);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid deposit amount. Please enter a valid number.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    try {
                        double withdrawAmount = Double.parseDouble(scanner.nextLine());
                        if (withdrawAmount < 0) {
                            System.out.println("Withdrawal amount cannot be negative.");
                        } else if (withdrawAmount > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance -= withdrawAmount;
                            writeBalanceToFile(balance);
                            System.out.printf("Withdrew %.2f successfully.\n", withdrawAmount);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid withdrawal amount. Please enter a valid number.");
                    }
                    break;

                case 3:
                    System.out.printf("Your current balance is: %.2f\n", balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the banking system. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static double readBalanceFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line = reader.readLine();
            return line == null ? 0 : Double.parseDouble(line);
        } catch (IOException e) {
            System.out.println("Error reading balance from file. Starting with a balance of 0.");
            return 0;
        } catch (NumberFormatException e) {
            System.out.println("Corrupted balance file. Starting with a balance of 0.");
            return 0;
        }
    }

    private static void writeBalanceToFile(double balance) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(String.valueOf(balance));
        } catch (IOException e) {
            System.out.println("Error writing balance to file.");
        }
    }
}