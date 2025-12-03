import java.util.Scanner;

abstract class travel{

    int total;
    int km;

    final int trainperkm = 500;
    final int flightperkm = 1000;
    final int busperkm = 100;

    abstract void fare();
}

class Train extends travel{
   void fare(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Km for Train");
    km = sc.nextInt();
    total = km*trainperkm;
    System.out.println("Total : "+ total +" for "+km+" km");
   }
}
class Flight extends travel{
    void fare(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Km for Flight");
    km = sc.nextInt();
    total = km*flightperkm;
    System.out.println("Total : "+ total +" for "+km+" km");
    }
}
class Bus extends travel{
    void fare(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Km for Bus");
    km = sc.nextInt();
    total = km*busperkm;
    System.out.println("Total : "+ total +" for "+km+" km");
    }
}

public class Agency{
    public static void main(String[] args) {

        Train t1 = new Train();
        t1.fare();

        Flight f1 = new Flight();
        f1.fare();

        Bus b1 = new Bus();
        b1.fare();
       
    }
}