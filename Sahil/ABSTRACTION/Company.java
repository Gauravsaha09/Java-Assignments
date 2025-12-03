abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }

    abstract double calculateSalary();   // abstract method
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(String name, int id, int hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

public class Company {
    public static void main(String[] args) {

        FullTimeEmployee f = new FullTimeEmployee("Gaurav", 101, 25000);
        PartTimeEmployee p = new PartTimeEmployee("Rahul", 102, 40, 200);

        f.display();
        System.out.println("Full-time Salary: " + f.calculateSalary());

        System.out.println();

        p.display();
        System.out.println("Part-time Salary: " + p.calculateSalary());
    }
}
