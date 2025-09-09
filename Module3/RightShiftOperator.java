package Module3;
//>>
//The right shift operator moves all bits by a given number of bits to the right.
public class RightShiftOperator {
    public static void main(String[] args) {
        int a = 20; // 10100
                    // 00101 = 5 (2)
                    // 10010 = 2 (3)
        System.out.println("Shift Right "+ (a >> 3));
    }
}
