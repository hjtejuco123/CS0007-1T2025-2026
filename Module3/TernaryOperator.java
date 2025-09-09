package Module3;
/*
 * an operator that deals with three operands.
Syntax:
variable = condition ? value : value;
 * 
 */
public class TernaryOperator {
    public static void main(String[] args) {
        // for one condtion
        // int a = 10; int b=20;
        // int max = (a>b) ? a:b;
        //     //if a>b 
        //         //max = a
        //     //else
        //         //max =b 
        // System.out.println("Max result is "+max);

        // int a = 10, b=20, c=30;
        // int max = (a>b) ? ((a>c) ? a:c) : ((b>c)? b:c);
        // System.out.println("Max number is "+max);

        int age = 18;
        String status = (age>=18) ? "Adult":"Minor";
        System.out.println("Status "+status);

    }
}
