// 2️⃣ Online examination platform — 3 threads (Question Loading, Timer, Auto-Save) run simultaneously using join() and sleep().

class QusLoading extends Thread{
    public void run(){
        System.out.println("Question Loading...");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Timer extends Thread{
    public void run(){
       System.out.println("Timer...");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


class AutoSave extends Thread{
    public void run(){
       System.out.println("Auto Save...");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


public class OnlineExamination{
    public static void main(String[] args) {

        QusLoading q1 = new QusLoading();
        Timer t1 = new Timer();
        AutoSave a1 = new AutoSave();


        try {
            q1.start();
            q1.join();

            t1.start();
            t1.join();

            a1.start();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}