package Module3;
/*
 * The bitwise OR (|) operator in Java is used to perform a bitwise OR operation between two integral operands. It compares each bit of the operands and sets the corresponding result bit to 1 if either of the bits is 1. Otherwise, the result bit is set to 0.
 * 
 * result = operand1 | operand2;

 */
public class BitwiseOrOperator {
    public static void main(String[] args) {
        int a = 5; //8421 0101
        int b = 3; //8421 0011 
                   //     0111 = 7 
        System.out.println("Bitwise OR (a|b): "+(a|b));

    }
}
