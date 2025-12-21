class Grocery{
    private int milk = 10;

    void buymilk(String name){
        synchronized (this) {
            if (milk > 0) {
                System.out.println("Milk booked for "+ name);
                milk = milk - 1;
            } else {
                System.out.println("Milk not Available for "+ name);
            }
        }
    }
}

class customers extends Thread{
    String name;
    Grocery g;

    public customers(String name, Grocery g){
        this.name = name;
        this.g = g;

    }

    public void run(){
        g.buymilk(name);
    }
}



public class Q2{
    public static void main(String[] args) {
         
    Grocery g = new Grocery();

    customers p1 = new customers("Sahil", g);
    customers p2 = new customers("Gaurav", g);
    customers p3 = new customers("Aman", g);
    customers p4 = new customers("Muskan", g);
    customers p5 = new customers("Ritesh", g);
    customers p6 = new customers("Rohit", g);
    customers p7 = new customers("ROhan", g);
    customers p8 = new customers("Saurav", g);
    customers p9 = new customers("Aditya", g);
    customers p10 = new customers("Anil", g);
    customers p11 = new customers("Rishab", g);
    customers p12 = new customers("kunal", g);
    customers p13 = new customers("Rupash", g);
    customers p14 = new customers("Chandan", g);
    customers p15 = new customers("Shayam", g);


    p1.start();
    p2.start();
    p3.start();
    p4.start();
    p5.start();
    p6.start();
    p7.start();
    p8.start();
    p9.start();
    p10.start();
    p11.start();
    p12.start();
    p13.start();
    p14.start();
    p15.start();
    }
}