
package Module78;

//abstract class
abstract class LivingThing {
    //concreate method 
    public void breath(){
        System.out.println("Living things breathing...");
    }
    
    public void eat(){
        System.out.println("Living things eating...");
        
    }
    
    public abstract void walk();
}

class Human extends LivingThing{
    @Override
    public void walk(){
        System.out.println("Human walks on two legs...");
    }

}

class Dog extends LivingThing{
    @Override
    public void walk(){
        System.out.println("Dog walks on four legs...");
    }
    
}
