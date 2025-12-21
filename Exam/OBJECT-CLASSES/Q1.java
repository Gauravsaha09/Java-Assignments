// 1️⃣ University Hostel System
// A hostel wants to maintain resident details (roomNo, name, course, feesPaid).
// Accept details of 6 students and display students who have paid full fees.

class Student{
    int roomNo;
    String name;
    String course;
    int fees;

    public Student(int roomNo, String name ,String course, int fees) {

    this.roomNo = roomNo;
    this.name = name;
    this.course = course;
    this.fees = fees;
    }

    void display(){
        System.out.println("RoomNo: " + roomNo + "Student Name: " + name + "Course: "+ course + "Fees" + fees);
    }
}


public class Q1{
    public static void main(String[] args) {

        int amount  = 30000;

        Student [] stu = new Student[6];

        stu[0]= new Student(1009, "Gaurav", "Mca", 10000);
        stu[1]= new Student(1009, "Aman", "Mca", 20000);
        stu[2]= new Student(1009, "Ansh", "Mca", 30000);
        stu[3]= new Student(1009, "Sahil", "Mca", 40000);
        stu[4]= new Student(1009, "Aditya", "Mca", 50000);
        stu[5]= new Student(1009, "Riya", "Mca", 60000);


// for (int i = 0; i < stu.length; i++) {
//     if (amount >= stu[i].fees) {
//         System.out.println("Fees has paid");
//     } else {
//         System.out.println("Fees Not Paid");
//     }
// }
System.out.println("Students who paid full fees:\n");
        for (int i = 0; i< stu.length; i++) {
           if (stu[i].fees >= amount) {
                stu[i].display();
            }
        }


       



    }
}