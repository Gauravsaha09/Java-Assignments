// class Welcome extends Thread{
//     public void run(){
//       for (int i = 1; i <=5; i++) {
//         System.out.println("Welcome...." + i);
//         try {
//             Thread.sleep(5000);
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//       }
//     }
// }
// class GroomName extends Thread{
//     public void run(){
//       for (int i = 1; i <=1; i++) {
//         System.out.println("Aman Yadav" + i);
//         try {
//             Thread.sleep(5000);
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//       }
//     }
// }
// class BrideName extends Thread{
//     public void run(){
//       for (int i = 1; i <=1; i++) {
//         System.out.println("Tanishka"  + i);
//         try {
//             Thread.sleep(5000);
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//       }
//     }
// }
// class WedDate extends Thread{
//     public void run(){
//       for (int i = 1; i <=1; i++) {
//         System.out.println("32-12-2026" + i);
//         try {
//             Thread.sleep(5000);
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//       }
//     }
// }
// class Add extends Thread{
//    public void run(){
//       for (int i = 1; i <=1; i++) {
//         System.out.println("MIT WPU" + i);
//         try {
//             Thread.sleep(5000);
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//       }
//     }
// }


// public class Q5{
//     public static void main(String[] args) {
//         Welcome w1 = new Welcome();
//         GroomName g1 = new GroomName();
//         BrideName b1 = new BrideName();
//         WedDate wd1 = new WedDate();
//         Add a1 = new Add();

//         w1.start();
//         g1.start();
//         b1.start();
//         wd1.start();
//         a1.start();
//     }
// }

class firstthread extends Thread{
    public void run(){
       System.out.println("Printing First Thread...");
       try {Thread.sleep(5000);} catch (Exception e) {
       }
    }
}

class secondthread extends Thread{
    public void run(){
        System.out.println("Printing Second Thread...");
         try {
        Thread.sleep(5000);
       } catch (Exception e) {
       }
    }
}

public class Q5{
    public static void main(String[] args) {
        firstthread f1 = new firstthread();
        secondthread s1 = new secondthread();
        try {
        f1.start();
        f1.join();
        s1.start();
        } catch (Exception e) {
            System.out.println(e);
        }

       
    }
}