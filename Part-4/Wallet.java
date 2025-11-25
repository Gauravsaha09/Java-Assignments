class Wallet{
    String owner_name;
    int wallet_id;
    float amount;

Wallet(String owner_name, int wallet_id, float amount){
    this.owner_name = owner_name;
    this.wallet_id = wallet_id;
    this.amount = amount;
}

 void addAmount(double balance){
    amount += balance;
        System.out.println("Amount Deposited: " + balance);
   }
    
   void deductAmount(double balance) {
        if (balance > amount) {
            System.out.println("Insufficient wallet balance!");
        } else {
             amount -= balance ;
            System.out.println("Amount Withdrawn: " + balance);
        }
   }

   void display(){
      System.out.println("Owner name " + owner_name);
      System.out.println("wallet id " + wallet_id);
      System.out.println("final wallet balance " + amount);
   }


   public static void main(String[] args) {
        
        Wallet w1 = new Wallet("Gaurav" ,1009 , 10000);

        w1.addAmount(5000);
        w1.deductAmount(2000);

        w1.display();
   }

}
