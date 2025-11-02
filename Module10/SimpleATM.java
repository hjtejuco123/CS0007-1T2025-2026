package JavaIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleATM {
    private static double balance = 1000.00; // Initial balance
    private static ArrayList<String> transactionHistory = new ArrayList<>();
    private static final String FILE_NAME = "/Users/hadjitejuco/NetBeansProjects/MyApps/src/JavaIO/transactions.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loadTransactions(); // Load transaction history from file
        int choice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    viewTransactionHistory();
                    break;
                case 5:
                    saveTransactions(); // Save transactions to file
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void checkBalance() {
        System.out.println("\nYour current balance is: " + balance);
        addTransaction("Checked balance: " + balance);
    }

    private static void depositMoney(Scanner scanner) {
        System.out.print("\nEnter amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " successfully!");
            addTransaction("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    private static void withdrawMoney(Scanner scanner) {
        System.out.print("\nEnter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " successfully!");
            addTransaction("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            System.out.println("Invalid amount. Withdrawal failed.");
        }
    }

    private static void viewTransactionHistory() {
        System.out.println("\n--- Transaction History ---");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }

    private static void addTransaction(String transaction) {
        transactionHistory.add(transaction);
    }

    private static void saveTransactions() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (String transaction : transactionHistory) {
                writer.write(transaction + "\n");
            }
            System.out.println("\nTransaction history saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving transaction history: " + e.getMessage());
        }
    }

    private static void loadTransactions() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                transactionHistory.add(line);
            }
            System.out.println("\nTransaction history loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("\nNo previous transaction history found.");
        } catch (IOException e) {
            System.out.println("Error loading transaction history: " + e.getMessage());
        }
    }
}