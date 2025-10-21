/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Module78;

/**
 *
 * @author hadjitejuco
 */
public class DivisionExample {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        System.out.println("Answer is "+(a/b));
//    }
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Risky code
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
