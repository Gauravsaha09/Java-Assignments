class A extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("A :"+ i);
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("B :"+ i);
        }
    }
}

public class Q3{
    public static void main(String[] args) {
       A a1 = new A();
       B b1 = new B();


       a1.start();
       b1.start();
    }
}