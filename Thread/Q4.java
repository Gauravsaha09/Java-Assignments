class Music extends Thread{
   public void run(){
       for (int i = 1; i < 5; i++) {
           System.out.println("Playing Music…" + i);
           try {
               Thread.sleep(2000);
           } catch (Exception e) {
            System.out.println(e);
           }
       }
   }
}
class UI extends Thread{
    public void run(){
        for (int i = 1; i < 5; i++) {
            System.out.println("Loading UI…" + i);
        }
    }
}

public class Q4{
    public static void main(String[] args) {
        Music m1 = new Music();
        UI u1 = new UI();

        m1.start();
        u1.start();
    }
}