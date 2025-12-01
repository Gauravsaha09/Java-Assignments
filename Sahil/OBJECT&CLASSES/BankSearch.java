
import java.util.Scanner;

class Customer {
    String name;
    int accNo;
    double balance;

    Customer(String name, int accNo,double balance){
        this.name =name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void display(){
        System.out.println("Coustomer Name : "+ name);
        System.out.println("Coustomer Account No : "+ accNo);
        System.out.println("Coustomer Balance : "+ balance);
    }
}

public class BankSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Customer [] Customer = new Customer[10];

        System.out.println("Enter details of 10 Coustomer: " );

        for (int i = 0; i < Customer.length; i++) {
            System.out.println("Coustomer "+ (i+1));

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Account No: ");
            int accNo = sc.nextInt();

            System.out.print("balance: ");
            double balance = sc.nextDouble();


            Customer[i] = new Customer(name, accNo, balance);
            System.out.println();

            System.out.print("Enter account number to search: ");
            int searchAcc = sc.nextInt();

        boolean found = false;

        for (Customer c : Customer) {
            if (c.accNo == searchAcc) {
                System.out.println("\nCustomer Found:\n");
                c.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No customer found with this account number.");
        }

        sc.close();
        }
    }
}