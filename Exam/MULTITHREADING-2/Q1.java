// 🧩 CASE STUDY QUESTIONS — MULTITHREADING (NEW)

// 1️⃣ Bank Transaction System
// Multiple threads perform deposit and withdraw operations on same account.
// Use synchronization to maintain correct balance.

class BankAccount {
    int balance = 5000;

    synchronized void deposit(int amt) {
        balance = balance + amt;
        System.out.println("Deposited: " + amt + " Balance: " + balance);
    }

    synchronized void withdraw(int amt) {
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Withdrawn: " + amt + " Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

class Customer extends Thread {
    BankAccount acc;

    Customer(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        acc.deposit(1000);
        acc.withdraw(2000);
    }
}

public class Q1 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(); // shared account

        // Array of customer objects
        Customer[] customers = new Customer[2];

        customers[0] = new Customer(account);
        customers[1] = new Customer(account);

        // Start threads using array
        for (int i = 0; i < customers.length; i++) {
            customers[i].start();
        }
    }
}
