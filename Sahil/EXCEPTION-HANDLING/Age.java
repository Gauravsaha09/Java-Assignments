class InvalidAgeException extends Exception{
    public InvalidAgeException(){
        super("Age must be 18 or above!");
    }
}



public class Age {
    public static void main(String[] args) {

        try {
            int age = 15;

            if (age < 18) {
                throw new InvalidAgeException();
            }

            System.out.println("You can vote");

        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}

