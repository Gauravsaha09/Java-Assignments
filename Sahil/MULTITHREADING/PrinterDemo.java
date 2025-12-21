// Printer — 2 students print documents simultaneously, use synchronized method to avoid overlapping output.

class Printer {
    synchronized void print(String StudentName){
       for (int i = 1; i <= 5; i++) {
           System.out.println(StudentName + " Printing Page " + i );
           try {
               Thread.sleep(3000);
           } catch (Exception e) {
            System.out.println(e);
           }
       }
    }
}

class student extends Thread {
    Printer p;
    String name;

     student(Printer p , String name){
        this.p = p;
        this.name = name;
     }

     public void run(){
        p.print(name);
     }

}


// class StudentB extends Thread{
//     public void run(){
      
//     }
// }


public class PrinterDemo {
    public static void main(String[] args) {

        Printer p = new Printer();

        student s1 =  new student(p, "Guarav");
        student s2 = new student(p, "Rahul");


        s1.start();
        s2.start();
    }
}