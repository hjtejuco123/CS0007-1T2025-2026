package Module3;
/*
 * The bitwise XOR (^) operator in Java performs an exclusive OR operation on each pair of corresponding bits of two numbers. The result is 1 if the bits are different and 0 if they are the same.
 * 
 */
public class BitwiseXOROperator {
    public static void main(String[] args) {
        int a = 5; //8421 0101
        int b = 3; //8421 0011
                   //     0110 
        System.out.println("Bitwise XOR (a^b): "+ (a^b));

    }
}
