class Emp{
    String empName;
    int empId;
    double salary;
    
    
    Emp(String empName,int empId,double salary){
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
    }


    double calculateBonus(){
        return salary * 0.10;
    }
    

    void Display(){
        double bonus = calculateBonus();
        double total = salary + bonus;
        System.out.println("Employee Name " + empName);
        System.out.println("Employee Id " + empId);
        System.out.println("Employee Salary with 10% bonus + salary is "+total);
    }

    public static void main(String[] args) {
        
        Emp e1 = new Emp("Gaurva", 1009, 89000);

        e1.Display();
    }


}