//Enpasulation - Hide variable (private variables)
package Module6;

public class Person {
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
        Person person = new Person();
        person.setName("Hadji");
        person.setAge(1);
        System.out.println("Name: "+person.getName());
        System.out.println("Age: "+person.getAge());
    }    
}
