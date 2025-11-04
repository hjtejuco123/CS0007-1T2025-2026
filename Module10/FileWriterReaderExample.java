
package Module10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderExample {
    public static void main(String[] args) {
        // File name
        String fileName = "/Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10/textfile.txt";

        // Writing to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            String message = "Java I/O is powerful and flexible.";
            writer.write(message);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from the file
        try (FileReader reader = new FileReader(fileName)) {
            int data;
            System.out.println("\nReading data from the file:");

            // Read until the end of the file
            while ((data = reader.read()) != -1) {
                System.out.print((char) data); // Convert byte to character
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}