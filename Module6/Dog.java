
package Module6;

//subclass (Child Class)
//Dog
class Dog extends Animal{
    //constructor
    public Dog (String name){
        super(name); //Call the superclass constructor
    }
    
    @Override
    public void eat(){
        System.out.println(getName()+ " is eating dog food ");
    }
    
    public void bark(){
        System.out.println(getName()+ " is barking ");
    }
    
   } 
  
