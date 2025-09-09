package Module3;

public class AssignOperator {
    public static void main(String[] args) {
        int bt = 24;
        System.out.println("bt: " + bt);
        //Increments then assigns
        bt += 10;
        System.out.println("bt: " + bt);
        //Decrements then assigns
        bt -= 2;
        System.out.println("bt: " + bt);
        //Multiplies then assigns
        bt *= 2;
        System.out.println("bt: " + bt);
        //Divides then assigns
        bt /= 2;
        System.out.println("bt: " + bt);
        //Modulus then assigns
        bt %= 7;
        System.out.println("bt: " + bt);
    }
}
