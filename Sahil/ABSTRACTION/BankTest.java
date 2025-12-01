
abstract class BankAccount {
    String accountNo;
    String accName;
    double balance;

BankAccount(String accountNo, String accName,double balance){
    this.accountNo = accountNo;
    this.accName = accName;
    this.blance = balance;
    }


void deposit(double amount){
    balance += amount;
    System.out.println("Deposited: " + amount);
}
abstract void withdraw(double amount);

void balance(){
    System.out.println("Current Balance :"+balance);
}

}

class SavingsAccount extends BankAccount {
    final double Main_Balance = 20000;

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
@Override
void withdraw(double amount){
    if (balance - amount < Main_Balance) {
            System.out.println("Withdraw Failed! Minimum balance of ₹1000 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
}
    
}

class CurrentAccount {
    
}

public class BankTest{
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("1009","Gaurav", 10000);
        CurrentAccount c1 = new CurrentAccount("1008","Rahul", 5000);




    }
}

