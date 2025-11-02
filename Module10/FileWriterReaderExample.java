
package JavaIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderExample {
    public static void main(String[] args) {
        String data = "This is an example of FileWriter and FileReader in Java.";
        
        // Writing data to a file
        try (FileWriter writer = new FileWriter("/Users/hadjitejuco/NetBeansProjects/MyApps/src/JavaIO/example2.txt")) {
            writer.write(data);
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }
        
        // Reading data from the file
        try (FileReader reader = new FileReader("/Users/hadjitejuco/NetBeansProjects/MyApps/src/JavaIO/example2.txt")) {
            int charData;
            System.out.println("Reading file content:");
            while ((charData = reader.read()) != -1) {
                System.out.print((char) charData);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during reading: " + e.getMessage());
        }
    }
}