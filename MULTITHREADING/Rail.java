class Rail
{
    int aTick = 2;
    
    void bookTick(String name)
    {
        synchronized(this)
    {
        
        if(aTick > 0)
        {
            aTick = aTick-1;
            System.out.println("Ticket booked for "+name);

        }
        else
        {
            System.out.println("NO ticket available");
        }
    }
    }
}

class Passanger extends Thread
{
    String name;
    Rail r;
    Passanger(String name, Rail r ) {
        this.name = name;
        this.r = r;

    }
    
    public void run()
    {
        
        r.bookTick(name);
    }
}

class Main
{
    static Rail r = new Rail();
    public static void main(String[] args) {

        Passanger p1 = new Passanger("Sahil Maulana",r);
        Passanger p2 = new Passanger("Gaurav Kattewala",r);
        Passanger p3 = new Passanger("Aman Dudhwala",r);

        p1.start();
        p3.start();
        p2.start();
       
    }
}
//join, wait, yeild , notify, notify all