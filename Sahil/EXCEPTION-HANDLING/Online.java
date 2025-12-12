// 2️⃣ Online shopping — if cart price < minimum amount, throw MinAmountRequiredException.

class MinAmountRequiredException extends Exception{
    public MinAmountRequiredException(){
        super("Minimum amount required");
    }
}



public class Online {
    public static void main(String[] args) {
        try {

            int cartPrice  = 5000;
            int minAmount  = 8000;

            if (cartPrice < minAmount) {
                throw new MinAmountRequiredException();
            }
        } catch (MinAmountRequiredException e) {
            System.out.println(e.getMessage());
        }
    }
}