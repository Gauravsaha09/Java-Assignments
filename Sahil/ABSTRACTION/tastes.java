abstract class Fruit{
   abstract void taste();
}

class Mango extends Fruit{
    void taste(){
        System.out.println("Mango as sweet teast");
    }
}

class Orange extends Fruit{
    void taste(){
        System.out.println("Orange as yaad nhi aa raha teast");
    }
}

public class tastes{
   public static void main(String[] args) {
       Mango m1 = new Mango();
       Orange o1 = new Orange();
       m1.taste();
       o1.taste();
   }
}