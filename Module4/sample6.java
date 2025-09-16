package Module4;
//create a simple menu system where user can choose 1. Add, 2. Subtract, 3. Multiply, 4. Divide using do while loop
//syntax do{ statements } while(condition);
import java.util.Scanner;   
public class sample6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                double result = 0;

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        System.out.println("Exiting the program. Goodbye!");
        scanner.close();
    }
}
