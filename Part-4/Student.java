class Student{
    String name;
    int rollNo;
    //int subjects1, subjects2 , subjects3;
    int[] subjects = new int[3];

  Student(String name, int rollNo,int[] subjects){

    this.name = name;
    this.rollNo = rollNo;
    this.subjects = subjects;

  }
   
   int calculateTotal(){
       int sum = 0;

       for(int i=0; i<subjects.length;i++)
       {
            sum = subjects[i] +sum;
            
       }
        return sum;
       

   }

   void display(){
    System.out.println("Name of Student "+ name);
    System.out.println("Roll No of Student "+ rollNo);
    System.out.println("Total Marks of 3 Subject "+ calculateTotal());
   }

   public static void main(String[] args) {
        int[] subjects1 = {22, 28,30};
        int[] subjects2 = {22, 28,99};
       Student s1 = new Student("Gaurav", 1009,subjects1);
       Student s2 = new Student("RAhul", 1007, subjects2);

       s1.display();
       s2.display();

       if (s1.calculateTotal()> s2.calculateTotal()) {
           System.out.println(s1.name +" as Higest total marks "+ s1.calculateTotal());
       } else if(s2.calculateTotal()> s1.calculateTotal()) {
        System.out.println(s2.name +" as Higest total marks "+ s2.calculateTotal());
       }
   }
}



