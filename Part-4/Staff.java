class Staff{
    String name;
    String birthDate;
    String designation;
    double salary;


   //Constructor
    Staff(String name, String birthDate, String designation, double salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.designation = designation;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name " + name);
        System.out.println("BirthDate "+ birthDate);
        System.out.println("Designation "+ designation);
        System.out.println("Salary " + salary);
    }

    public static void main(String[] args) {
        
       Staff s1 = new Staff("Gaurav", "09-05-2005", "Manager", 45000);
       Staff s2 = new Staff("Sahil", "05-01-2003", "Developer", 55000);

       s1.display();
       s2.display();

       if (s1.salary>s2.salary) {
        System.out.println("Staff s1 as higest salary "+s1.salary);
       } else if(s1.salary<s2.salary) {
        System.out.println("Staff s2 as higest salary "+s2.salary);
       } 
    }
}