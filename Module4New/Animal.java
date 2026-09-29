class Animal {

    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

class Bird extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Bird says: Tweet!");
    }
}

public class PolymorphismExample {

    public static void main(String[] args) {

        // Superclass references
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Bird();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();

        System.out.println("\nUsing an array:");

        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Bird()
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
