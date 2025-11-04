
package Module10;
///Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10  

import java.io.*;
import java.util.*;

public class RestaurantOrderingSystem {
    private static final String FILE_NAME = "/Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10/orders.txt";
    private static final Map<String, Double> MENU = new HashMap<>();

    static {
        MENU.put("Burger", 5.99);
        MENU.put("Pizza", 8.99);
        MENU.put("Pasta", 7.49);
        MENU.put("Salad", 4.99);
        MENU.put("Soda", 1.99);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> orders = readOrdersFromFile();
        double totalBill = calculateTotalBill(orders);

        while (true) {
            System.out.println("\n=== Restaurant Ordering System ===");
            System.out.println("1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. View Total Bill");
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
                    displayMenu();
                    break;

                case 2:
                    System.out.print("Enter item name to order: ");
                    String item = scanner.nextLine().trim();
                    if (MENU.containsKey(item)) {
                        orders.add(item);
                        totalBill += MENU.get(item);
                        writeOrdersToFile(orders);
                        System.out.printf("Added %s to your order.\n", item);
                    } else {
                        System.out.println("Item not found in the menu.");
                    }
                    break;

                case 3:
                    System.out.printf("Your total bill is: $%.2f\n", totalBill);
                    break;

                case 4:
                    System.out.println("Thank you for visiting the restaurant. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n=== Menu ===");
        for (Map.Entry<String, Double> entry : MENU.entrySet()) {
            System.out.printf("%s: $%.2f\n", entry.getKey(), entry.getValue());
        }
    }

    private static List<String> readOrdersFromFile() {
        List<String> orders = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                orders.add(line);
            }
        } catch (IOException e) {
            System.out.println("No previous orders found. Starting fresh.");
        }
        return orders;
    }

    private static void writeOrdersToFile(List<String> orders) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String order : orders) {
                writer.write(order);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving orders to file.");
        }
    }

    private static double calculateTotalBill(List<String> orders) {
        double total = 0;
        for (String order : orders) {
            total += MENU.getOrDefault(order, 0.0);
        }
        return total;
    }
}