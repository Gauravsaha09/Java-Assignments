// A college portal wants to maintain student records (roll, name, branch, marks).Implement class Student, take input of 5 students,
// and display topper’s details.

import java.util.Scanner;

class Student {
    int roll;
    String name;
    String branch;
    double marks;

    public Student(int roll, String name, String branch, double marks) {
        this.roll = roll;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", Branch: " + branch + ", Marks: " + marks);
    }
}

public class StudentPortal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5]; 

     
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll number: ");
            int roll = scanner.nextInt();
            scanner.nextLine();  
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Branch: ");
            String branch = scanner.nextLine();
            System.out.print("Marks: ");
            double marks = scanner.nextDouble();

            
            students[i] = new Student(roll, name, branch, marks);
        }

      
        Student topper = students[0];  
        for (int i = 1; i < 5; i++) {
            if (students[i].marks > topper.marks) {
                topper = students[i];
            }
        }

     
        System.out.println("\nTopper's details:");
        topper.displayDetails();
    }
}
