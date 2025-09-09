package Module3;
//& operator
/*
 * The bitwise AND (&) operator in Java is used to perform a bit-level operation between two integers. It compares each bit of its operands and returns 1 if both corresponding bits are 1; otherwise, it returns 0.
 * 
 */
public class BitwiseAndOperator {
    public static void main(String[] args) {
        int a = 15; //8421 1111
        int b = 7; //8421  0111
        System.out.println("Bitwise AND (a&b) = "+ (a&b));
    }
}
