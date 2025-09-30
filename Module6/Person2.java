//Enpasulation - Hide variable (private variables)
//User input
package Module6;
import java.util.Scanner;

public class Person2 {
    //private
    private String name;
    private int age;
    
    //setters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //age setter - add validation
    //positive
    public void setAge(int age){
        if (age>0){
            this.age = age;
        }else {
            System.out.println("Age must be positive");
        }
    }
    public int getAge(){
        return age;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person2 person2 = new Person2();
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        person2.setName(name);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        person2.setAge(age);
        
        System.out.println("Name: "+person2.getName());
        System.out.println("Age: "+person2.getAge());
        
        scanner.close();
      
    }    
}
