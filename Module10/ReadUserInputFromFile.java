
package Module10;

import java.io.FileReader;
import java.io.IOException;

public class ReadUserInputFromFile {
    public static void main(String[] args) {
        String fileName = "/Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10/user_input.txt";

        try (FileReader reader = new FileReader(fileName)) {
            System.out.println("Reading user input from the file:");

            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data); // Convert byte to character
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}