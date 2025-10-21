/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Module78;

/**
 *
 * @author hadjitejuco
 */
public class LivingThingDemo {
    public static void main(String[] args) {
        //create object 
        LivingThing human = new Human();
        LivingThing dog =  new Dog();
        
        //call methods for Human
        System.out.println("Human Behavior");
        human.breath();
        human.eat();
        human.walk();
        System.out.println();
        //call method for Dog
        System.out.println("Dog Behavior");
        dog.breath();
        dog.eat();
        dog.walk();
        
        
    }
}
