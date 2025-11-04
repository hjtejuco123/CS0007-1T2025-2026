
package Module10;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        // File name
        ///Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10/
        String fileName = "/Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10/output.txt";

        try (FileInputStream fis = new FileInputStream(fileName)) {
            int data;
            System.out.println("Reading data from the file:");

            // Read until the end of the file
            while ((data = fis.read()) != -1) {
                System.out.print((char) data); // Convert byte to character
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
