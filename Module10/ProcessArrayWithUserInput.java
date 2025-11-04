
package Module10;

import java.util.Scanner;

public class ProcessArrayWithUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");

        // Populate the array with user input
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of the array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("The sum of the array is: " + sum);
    }
}
