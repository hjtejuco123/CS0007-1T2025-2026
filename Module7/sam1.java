
//give example of Method Overloading 
package Module7;

public class sam1 {
    public static void main(String[] args) {
        sam1 obj = new sam1();
        System.out.println(obj.add(5, 10));          // Calls method with two int parameters
        System.out.println(obj.add(5.5, 10.5));      // Calls method with two double parameters
        System.out.println(obj.add(5, 10, 15));      // Calls method with three int parameters
    }   
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
