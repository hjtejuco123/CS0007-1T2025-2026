
package Module10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteUserInputToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ///Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10  
        String fileName = "/Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10/user_input.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("Enter text (type 'exit' to stop):");

            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
                writer.write(line + "\n"); // Write each line to the file
            }

            System.out.println("User input written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}