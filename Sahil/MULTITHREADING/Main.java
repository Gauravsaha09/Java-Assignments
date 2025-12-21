class A extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread A :" + i);
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread B :" + i);
        }
    }
}

class C implements Runnable{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread C :" + i);
        }
    }
}


public class Main{
    public static void main(String[] args) {

         B b1 = new B();
       A a1 = new A();


       C c1 = new C();
        
       a1.start();
       b1.start();
    
    }
}