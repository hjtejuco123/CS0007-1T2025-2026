// //create a sample program demostrate simple oop
// //This is sample 4 
// package Module5;

// public class Car {
//     private String make;
//     private String model;
//     private int year;
//     private boolean isRunning;
//     private int speed;

//     public Car(String make, String model, int year) {
//         this.make = make;
//         this.model = model;
//         this.year = year;
//         this.isRunning = false;
//         this.speed = 0;
//     }

//     public void displayInfo() {
//         System.out.println("Car Information:");
//         System.out.println("Make: " + make);
//         System.out.println("Model: " + model);
//         System.out.println("Year: " + year);
//     }

//     public void start() {
//         isRunning = true;
//         System.out.println("Car started.");
//     }
//     public void stop() {
//         isRunning = false;
//         speed = 0;
//         System.out.println("Car stopped.");
//     }

//     public void accelerate(int increment) {
//         if (isRunning) {
//             speed += increment;
//             System.out.println("Car accelerated. Current speed: " + speed + " km/h");
//         } else {
//             System.out.println("Start the car first.");
//         }
//     }
//     public void brake(int decrement) {
//         if (isRunning && speed > 0) {
//             speed -= decrement;
//             if (speed < 0) speed = 0;
//             System.out.println("Car slowed down. Current speed: " + speed + " km/h");
//         } else {
//             System.out.println("Car is not running or already at rest.");
//         }
//     }

//     public static void main(String[] args) {
//         Car myCar = new Car("Toyota", "Corolla", 2020);
//         myCar.displayInfo();
//         myCar.start();
//         myCar.accelerate(20);
//         myCar.brake(10);
//         myCar.stop();
        
//         //Another car object
//         Car anotherCar = new Car("Honda", "Civic", 2021);
//         anotherCar.displayInfo();
//         anotherCar.start();
//         anotherCar.accelerate(30);
//         anotherCar.brake(15);
//         anotherCar.stop();
//     }
// }
