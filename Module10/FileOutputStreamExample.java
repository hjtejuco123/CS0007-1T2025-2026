///Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10   
package Module10;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        // File name
        String fileName = "/Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10/output.txt";

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            // Writing a single byte
            fos.write(65); // ASCII value of 'A'

            // Writing a string
            String message = "Welcome to Java I/O Streams!";
            byte[] byteArray = message.getBytes(); // Convert string to byte array
            fos.write(byteArray);

            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            //e.printStackTrace();
        }
    }
}