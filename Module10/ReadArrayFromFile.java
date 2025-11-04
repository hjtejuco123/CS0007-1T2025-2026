
package Module10;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadArrayFromFile {
    public static void main(String[] args) {
        String fileName = "/Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10/numbers.txt";


        try (FileInputStream fis = new FileInputStream(fileName)) {
            System.out.println("Reading integers from the file:");
            int data;

            // Read until the end of the file
            while ((data = fis.read()) != -1) {
                System.out.println(data); // Print each integer
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
