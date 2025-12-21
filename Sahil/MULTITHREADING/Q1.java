class Rail{
    int aticket = 3;

    void bookticket(String name){
        synchronized(this){
            if(aticket > 0){
                System.out.println("Ticket Booked for " + name);
                aticket = aticket - 1;
            }else{
                System.out.println("No Ticket Available for " + name);
            }
        }
    }
}

class Passenger extends Thread{
    String name;
    Rail r;

    public Passenger(String name, Rail r) {
        this.name = name;
        this.r = r;
    }

    public void run(){
        r.bookticket(name);
    }
}



public class Q1{
    public static void main(String[] args) {
        Rail r1 = new Rail();

    Passenger p1 = new Passenger("Sahil", r1);
    Passenger p2 = new Passenger("Gaurav", r1);
    Passenger p3 = new Passenger("Aman", r1);
    Passenger p4 = new Passenger("Muskan", r1);
    Passenger p5 = new Passenger("Ritesh", r1);


    p1.start();
    p2.start();
    p3.start();
    p4.start();
    p5.start();
    }
}