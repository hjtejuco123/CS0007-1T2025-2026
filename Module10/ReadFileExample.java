
package JavaIO;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("/Users/hadjitejuco/NetBeansProjects/MyApps/src/JavaIO/example1.txt")) {
            int byteData;
            System.out.println("Reading file content:");
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}