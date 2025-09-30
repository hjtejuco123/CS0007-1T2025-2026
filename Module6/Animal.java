//Injeritance
package Module6;

//SuperClass (Parent Class)
public class Animal {
    //name
    private String name;
    
    //constructor
    public Animal(String name){
        this.name = name;
    }
    
    //Method
    public void eat(){
        System.out.println(name + "is eating");
    }
    
    //Getter -> name 
    public String getName(){
        return name;
    }
}
