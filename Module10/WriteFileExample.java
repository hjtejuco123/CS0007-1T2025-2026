
package JavaIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        String data = "Welcome to Java FileOutputStream Example!";
        try (FileOutputStream fos = new FileOutputStream("/Users/hadjitejuco/NetBeansProjects/MyApps/src/JavaIO/example1.txt")) {
            fos.write(data.getBytes());
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}