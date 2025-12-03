class Product{

    double amount;

    Product(double amount) {
        this.amount = amount;
    }
    
    double discount(){
        return amount;
    }
}

class Electronics extends Product{

    public Electronics(double amount) {
        super(amount);
    }

    double discount(){
        return amount - amount*0.20;
    }

}
class Clothing extends Product{

    public Clothing(double amount){
        super(amount);
    }
    double discount(){
        return amount - amount*0.30;
    }
}
class Groceries extends Product{
      public Groceries(double amount){
        super(amount);
    }
    double discount(){
        return amount - amount*0.40;
    }
}


public class ShoppingApp {
    public static void main(String[] args) {

    Electronics e1 = new Electronics(20000);
    Clothing c1 = new Clothing(10000);
    Groceries g1 = new Groceries(5000);


    System.out.println("Electronics Price : "+ e1.discount());
    System.out.println("Clothing Price : "+ c1.discount());
    System.out.println("Groceries Price : "+ g1.discount());
    
        
    }
}