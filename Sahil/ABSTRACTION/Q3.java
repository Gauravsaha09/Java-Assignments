import java.util.Scanner;

abstract class RideBooking {
    int total;
    int km;
    final int cabPerKm = 1000;
    final int autoPerKm = 100;
    final int bikePerKm = 50;
 
    abstract void pickup();
    abstract void drop();
    abstract void calculateFare();
}
class Cab extends RideBooking{
    
    void pickup(){
         System.out.println("Picked up");
    }
    void drop()
    {
         System.out.println("Drop");
    }
    void calculateFare()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter km");
        km = sc.nextInt();
        total = km*cabPerKm;
        System.out.println("Total : "+ total);

    }
}

class Auto extends RideBooking{
 void pickup(){
         System.out.println("Picked up");
    }
    void drop()
    {
         System.out.println("Drop");
    }
    void calculateFare()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter km");
        km = sc.nextInt();
        total = km*autoPerKm;
        System.out.println("Total : "+ total);
    }
}

class Bike extends RideBooking{
void pickup(){
         System.out.println("Picked up");
    }
    void drop()
    {
         System.out.println("Drop");
    }
    void calculateFare()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter km");
        km = sc.nextInt();
        total = km*bikePerKm;   
        System.out.println("Total : "+ total);
    }
}

public class Q3{
    public static void main(String[] args) {
        Cab c1 = new Cab();
        Auto a1 = new Auto();
        Bike b1 = new Bike();

        System.out.println("For Cab...");
        c1.pickup();
        c1.drop();
        c1.calculateFare();

        System.out.println("For Auto...");
        a1.pickup();
        a1.drop();
        a1.calculateFare();

        System.out.println("For Bike...");
        b1.pickup();
        b1.drop();
        b1.calculateFare();
    }
}