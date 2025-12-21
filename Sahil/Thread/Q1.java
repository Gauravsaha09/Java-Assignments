class print extends Thread{
    public void run(){
        System.out.println("Hello from Thread");
    }
}

public class Q1{
    public static void main(String[] args) {
        print p1 = new print();
        p1.start();
    }
}