public class DivideExample{
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;
            int result = a/b;
            System.out.println("Result : "+ result);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}