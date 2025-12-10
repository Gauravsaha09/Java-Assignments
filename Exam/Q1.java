// 1. Write a multithreaded program for demonstrating following thread 

// a. Display all odd number between 1001 to 2001. 
// b. Display the nunmber of vowels present in the String "MATHEMATICS" 
// c. Display all Prime Numbers between 1 to 50. 

class OddThread  extends Thread{
    public void run(){
       for (int i = 1001; i <= 2001; i+=2) {
           System.out.println("Odd Number Between : " + i);
       }
    }
}

class VowelThread  extends Thread{
    public void run(){
        String a = "MATHEMATICS";
        int count =0;
        for(int i=0; i<a.length(); i++){
        char ch = a.charAt(i);
        if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                count ++;
        }
        System.out.println("Vowels in Mathematics = "+ count);
    }
}

class PrimeThread extends Thread{
    public void run(){
        System.out.println("Prime numbers between 1 to 50: ");
        for (int n = 2; n < 50; n++) {
            boolean Prime = true;

            for (int i = 2; i <= n/2; i++) {
                if(n % i == 0){
                    Prime = false;
                    break;
                }
                
            }
            if(Prime){
                System.out.println(n);
            }
            
        }
    }
}

public class Q1{
    public static void main(String[] args) {
        OddThread o1 = new OddThread();
        VowelThread v1 = new VowelThread();
        PrimeThread  p1 = new PrimeThread ();

        o1.start();
        v1.start();
        p1.start();
    }
}