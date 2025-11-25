class Employee{
    String emp_name;
    String emp_id;
    String designation;
    double salary;

    Employee(String emp_name, String emp_id, String designation, double salary){
      this.emp_name = emp_name;
      this.emp_id = emp_id;
      this.designation = designation;
      this.salary = salary;
 }

void showData(){
    System.out.println("Employee Name "+emp_name);
    System.out.println("Employee id "+emp_id);
    System.out.println("Employee designation "+designation);
    System.out.println("Employee salary "+salary);
   }

   public static void main(String[] args) {
    Employee E1 = new Employee("Gaurav", "1009","Developer" , 56000);
    Employee E2 = new Employee("Rahul", "1002","Seo" , 50000);


   E1.showData();
   E2.showData();

   if (E1.salary > E2.salary) {
       System.out.println(E1.emp_name+" as Highest Salary");
   } else if(E1.salary < E2.salary) {
     System.out.println(E2.emp_name+" as Highest Salary");
   }

       
   }

}