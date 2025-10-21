//multiple catch example


package Module78;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try{
            int numerator = 10;
            int denominator = 0;
            int result = divide(numerator,denominator);
            int[] numbers= {1,2,3};
            System.out.println("Access index 5 "+numbers[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutOfBoundsException "+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Cauth ArithmeticException "+e.getMessage());
        }catch(Exception e){
            System.out.println("Caught Generic Exception "+e.getMessage());
        }finally{
            System.out.println("Finally will be executed ");
        
        }    
           
    }

    public static int divide(int a, int b)throws ArithmeticException{
        if (b==0) {
            throw new ArithmeticException("Hey Division by Zero not allowed ");
        }
        return a/b;
    }
}    


