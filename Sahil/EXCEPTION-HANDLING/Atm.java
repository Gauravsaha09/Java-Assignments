class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(){
        super("Insufficient Balance !");
    }
}

public class Atm{
    public static void main(String[] args) throws InsufficientBalanceException {
        int Balance = 5000;
        
       
            if (Balance < 5001) {
                throw new InsufficientBalanceException();
            }
        
    }
}