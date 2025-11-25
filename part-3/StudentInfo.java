import java.util.Scanner;

class StudentInofo{
    int StudPRN;
    String StudName;
    String StudGender;
    String StudContactNumber;


    StudentInofo(int PRN, String Name, String Gender, String Contact){
    StudPRN = PRN;
    StudName = Name;
    StudGender = Gender;
    StudContactNumber = Contact;
}

void display(){
    System.out.println("Student PRN: "+ StudPRN);
    System.out.println("Student Name: "+ StudName);
    System.out.println("Student Gender: "+ StudGender);
    System.out.println("Student Contact: "+ StudContactNumber);

}
}

class StudentERP{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student PRN: ");
        int prn = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Student Name: ");
        String Name = sc.nextLine();

        System.out.println("Enter Student Gender: ");
        String Gender = sc.nextLine();

        System.out.println("Enter Student Contact: ");
        String Contact = sc.nextLine();



        StudentInofo s1 = new StudentInofo(prn, Name, Gender, Contact);

        s1.display();
    }
}

