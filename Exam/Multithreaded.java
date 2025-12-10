// Write a multithreaded Java program with the following threads:

// Thread–1: Print all multiples of 5 from 5 to 100.

// Thread–2: Count uppercase letters in the string "Java MULTITHREADING Program".

// Thread–3: Display the sum of all prime numbers between 1 to 100.


class FiveThread extends Thread {
    public void run() {
        for (int i = 5; i <= 100; i += 5) {
            System.out.println("Multiple of 5: " + i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Thread-2: Count uppercase letters
class UpperThread extends Thread {
    public void run() {
        String s = "Java MULTITHREADING Program";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                count++;
        }

        System.out.println("Uppercase Letters = " + count);
        try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}

// Thread-3: Sum of prime numbers
class PrimeThread extends Thread {
    public void run() {
        int sum = 0;

        for (int n = 2; n <= 100; n++) {
            boolean prime = true;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                sum += n;
        }

        System.out.println("Sum of Prime Numbers = " + sum);
        try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}

public class Multithreaded{
    public static void main(String[] args) {
        FiveThread f1 = new FiveThread();
        UpperThread u1 = new UpperThread();
        PrimeThread p1 = new PrimeThread();


        f1.start();
        u1.start();
        p1.start();
    }
}