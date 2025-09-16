package Module4;
//create a grocery store tracker program using two dimensional arrays
//to store item names, quantities, and prices
//syntax datatype[][] arrayName = new datatype[rows][columns];
//or datatype[][] arrayName = {{value1, value2}, {value3, value4}, ...};
//use scanner to get user input
import java.util.Scanner;
public class sample11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] groceryItems = new String[2][3]; // 5 items, 3 attributes (name, quantity, price)

        for (int i = 0; i < groceryItems.length; i++) {
            System.out.print("Enter item name: ");
            groceryItems[i][0] = scanner.nextLine();
            System.out.print("Enter quantity: ");
            groceryItems[i][1] = scanner.nextLine();
            System.out.print("Enter price: ");
            groceryItems[i][2] = scanner.nextLine();
        }

        System.out.println("\nGrocery Items:");
        System.out.printf("%-15s %-10s %-10s%n", "Item Name", "Quantity", "Price");
        for (int i = 0; i < groceryItems.length; i++) {
            System.out.printf("%-15s %-10s %-10s%n", groceryItems[i][0], groceryItems[i][1], groceryItems[i][2]);
        }
        //add total price
        double totalPrice = 0.0;
        for (int i = 0; i < groceryItems.length; i++) {
            totalPrice += Double.parseDouble(groceryItems[i][2]) * Integer.parseInt(groceryItems[i][1]);
        }
        System.out.printf("Total Price: $%.2f%n", totalPrice); 
        scanner.close();        
    }
}
