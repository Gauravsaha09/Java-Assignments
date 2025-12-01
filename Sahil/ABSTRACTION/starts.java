abstract class Vehicle{
    abstract void start();
}

class Car extends Vehicle {
   void start(){
    System.out.println("Car Sound....");
   }
}

class Bike extends Vehicle{
   void start(){
    System.out.println("Bike Sound....");
   }
}

public class starts{
    public static void main(String[] args) {
        Car c1 = new Car();
        Bike b1 = new Bike();

        c1.start();
        b1.start();
    }
}