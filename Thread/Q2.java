class mythread extends Thread{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number : "+ i);
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


public class Q2{
    public static void main(String[] args) {
        mythread m1 = new mythread();
        m1.start();
    }
}