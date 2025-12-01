import java.util.Scanner;

class Employees{
    int id;
    String name;
    String department;
    double salary;

    Employees(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display(){
        System.out.print("Employee Id : "+ id);
        System.out.print("Employee Name : "+ name);
        System.out.print("Employee Department : "+ department);
        System.out.print("Employee Salary : "+ salary);
    }
}

public class SalarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Employees [] Employees = new Employees[4];

        System.out.println("Enter details of 4 Employees: " );
        
        for(int i = 0; i <Employees.length; i++){
            System.out.println("\nEmployees "+ (i+1));

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employees[i] = new Employees(id, name, department, salary);
            // System.out.println();
        }
            System.out.print("\nEnter Salary : ");
            double SearchSalary = sc.nextInt();

        boolean found = false;

        for (Employees c : Employees) {
            if (c.salary == SearchSalary) {
                System.out.println("\nEmployee Found:\n");
                c.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo Employee found with this salary.");
        }

        sc.close();

        }

    }

    
