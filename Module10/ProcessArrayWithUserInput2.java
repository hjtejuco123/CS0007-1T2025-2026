
package Module10;

import java.io.*;
import java.util.Scanner;

public class ProcessArrayWithUserInput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ///Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10  
        String fileName = "/Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10/array_data.txt";

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

        // Write array and sum to a file
        writeArrayToFile(numbers, sum, fileName);

        // Read array and sum from the file
        readArrayFromFile(fileName);

        scanner.close();
    }

    // Method to write array and sum to a file
    private static void writeArrayToFile(int[] numbers, int sum, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Array Elements: ");
            for (int num : numbers) {
                writer.write(num + " ");
            }
            writer.newLine();
            writer.write("Sum of Array: " + sum);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing data to file.");
            e.printStackTrace();
        }
    }

    // Method to read array and sum from a file
    private static void readArrayFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nReading data from file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. No data to display.");
        } catch (IOException e) {
            System.out.println("Error reading data from file.");
            e.printStackTrace();
        }
    }
}