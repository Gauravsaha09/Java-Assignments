class Bank{
    String Cust_name;
    int Ac_no;
    double balance;

    Bank(String Cust_name, int Ac_no, double balance) {
        this.Cust_name = Cust_name;
        this.Ac_no = Ac_no;
        this.balance = balance;
    }
   
   void deposit(double amount){
    balance += amount;
        System.out.println("Amount Deposited: " + amount);
   }
    
   void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
   }

void display(){
    System.out.println("Customer Name: " + Cust_name);
    System.out.println("Account Number: " + Ac_no);
    System.out.println("Current Balance: " + balance);
}
 public static void main(String[] args) {
     Bank b1 = new Bank("Gaurav", 7260, 5000);


     b1.deposit(2000);
     b1.withdraw(1000);
     
     b1.display();
 }
    
}