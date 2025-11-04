
package Module10;


import java.io.FileOutputStream;
import java.io.IOException;

public class WriteArrayToFile {
    public static void main(String[] args) {
        // Array of integers
        ///Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10   

        int[] numbers = {10, 20, 30, 40, 50};
        String fileName = "/Users/hadjitejuco/NetBeansProjects/CS0007TS21/src/Module10/numbers.txt";

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            for (int num : numbers) {
                fos.write(num); // Write each number as a byte
            }
            System.out.println("Array written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}