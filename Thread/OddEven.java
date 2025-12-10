class Even extends Thread{
    public void run(){
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("Even : " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Odd extends Thread{
    public void run(){
        for (int i = 1; i < 10; i+=2) {
            System.out.println("Odd : "+ i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


public class OddEven{
    public static void main(String[] args) {
        Even e1 = new Even();
        Odd o1 = new Odd();

        e1.start();
        o1.start();
    }
}