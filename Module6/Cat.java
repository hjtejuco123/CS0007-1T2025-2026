
package Module6;

class Cat extends Animal{
    //constructor
    public Cat (String name){
        super(name); //Call the superclass constructor
    }
    
    @Override
    public void eat(){
        System.out.println(getName()+ " is eating cat food ");
    }
    
    public void meow(){
        System.out.println(getName()+ " is meowing ");
    }
}
