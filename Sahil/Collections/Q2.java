import java.util.*;

class Student{
    int num;
    String name;

    Student( int num,String name){
        this.num = num;
        this.name = name;
    }
}

public class Q2{
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1009, "Gaurav"));
        list.add(new Student(1008, "Rahul"));

        for(Student s : list){
            System.out.println(s.num + "" + s.name);
        }

        
    }
}