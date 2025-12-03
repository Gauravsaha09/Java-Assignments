// Create an interface Taxable with incomeTax() and gst(). Implement it for Employee and Product.

interface Taxable{
    void incomeTax();
    void gst();
}

class Employee implements Taxable {
    
    double salary;

    Employee(double salary){
        this.salary = salary;
    }

    public void incomeTax(){
        double tax = salary*0.10;
        System.out.println("Employee income tax is : "+ tax);
    }
    public void gst(){
        System.out.println("Employees does not pay GST.");
    }
}

class Product implements Taxable{

    double price;

    public Product(double price) {
        this.price = price;
    }
    
   public void incomeTax(){
       double tax = price*0.9;
       System.out.println("Product income tax is : "+ tax);
       
   }
   public void gst(){
      double gst = price*18;
      System.out.println("Product gst :"+ gst);
   }
}

public class Q1{
    public static void main(String[] args) {
        Employee e1 = new Employee(50000);
        Product p1 = new Product(2000);


        System.out.println("...Employee...");
        e1.incomeTax();
        e1.gst();
        System.out.println("...Product...");
        p1.incomeTax();
        p1.gst();

    }
}