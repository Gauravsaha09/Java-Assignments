// Create an interface Vehicle with start(), stop(). Implement for 3 classes: Car, Bike, Bus.

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle{
    public void start(){
        System.out.println("Car starts with a key.");
    }
    public void stop(){
        System.out.println("Car Stop using Break.");
    }
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike starts with a key.");
    }
    public void stop(){
        System.out.println("Bike Stop using Break.");
    }
}
class Bus implements Vehicle{
    public void start(){
        System.out.println("Bus starts with a key.");
    }
    public void stop(){
        System.out.println("Bus Stop using Break.");
    }
} 

public class Q2{
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        Bus s = new Bus();
        
        System.out.println("...Car...");
        c.start();
        c.stop();
        System.out.println("...Bike...");
        b.start();
        b.stop();
        System.out.println("...Bus...");
        s.start();
        s.stop();
    }
}