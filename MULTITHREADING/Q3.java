class ATM{
    private int balance = 5000;

    synchronized void withdraw(String name, int amount){
        
            if (balance >= amount) {
                System.out.println("Amount Withdram by " + ": " + name +""+ amount);
                balance = balance - amount;
                System.out.println("Remaining Balance : " + balance);
            } else {
                System.out.println("Amount not Avalible for " + name + " Tried "+amount + " balance "+ balance);
            }
        }
    
}

class  customers extends Thread{
    
    String name ;
    int amount;
    ATM a;

    public customers(String name, int amount, ATM a) {
        this.name = name;
        this.amount = amount;
        this.a = a;
    }
    
    public void run(){

    a.withdraw(name , amount);


}

}

public class Q3{
    public static void main(String[] args) {
             

    ATM a = new ATM();

    customers c1 = new customers("Gaurav", 4000 ,a);
    customers c2 = new customers("Rahul", 2000,a);

    c1.start();
    c2.start();
        
    }
}