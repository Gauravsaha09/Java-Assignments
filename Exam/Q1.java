// Define a class Bank with data members Customer Name, Account Number, and Balance.
// Use constructors, deposit(), withdraw() methods, and print top two customers based on highest balance.

class Bank{
  String cust_num;
  int ac_no;
  double balance;

Bank(String cust_num, int ac_no, double balance){
    this.cust_num = cust_num;
    this.ac_no = ac_no;
    this.balance = balance;
  }

void deposit(double ammount){
     balance += ammount;
}

void withdraw(double amount){
    if (amount <= balance) {
        balance -= amount;
    } else {
      System.out.println("Insufficient Balance");
    }
}
void display(){
      System.out.println("Name: "+ cust_num +
                         ", Account No: " + ac_no +
                          ", Balance: " + balance);
    }
   
}

public class Q1 {
    public static void main(String[] args) {

        Bank b1 = new Bank("Gaurav", 1009, 5000);
        Bank b2 = new Bank("Rahul", 1008, 6000);
        Bank b3 = new Bank("Aman", 1007, 8000);

        Bank first, second;

        // Compare b1 and b2
        if (b1.balance > b2.balance) {
            first = b1;
            second = b2;
        } else {
            first = b2;
            second = b1;
        }

        // Compare with b3
        if (b3.balance > first.balance) {
            second = first;
            first = b3;
        } else if (b3.balance > second.balance) {
            second = b3;
        }

        System.out.println("Top Two Customers with Highest Balance:");
        first.display();
        second.display();
    }
}
