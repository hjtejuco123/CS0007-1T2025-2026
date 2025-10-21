//age example
//18 - eligible othewise not 

package Module78;

public class ThrowExample {
    public static void main(String[] args) {
        
        try {
            checkAge(15);
        }catch(IllegalArgumentException e){
            System.out.println("Caugh Exception "+e.getMessage());
        }
        
    }

    public static void checkAge(int age){
        if (age<18)  {
            throw new IllegalArgumentException();
        }else{
            System.out.println("You are eligible");
        
        }
    
    }
    
}
