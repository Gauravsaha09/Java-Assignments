class calculator {
    int add(int a, int b){
       return a + b;
    }
    float add(float a, float b){
       return a + b;
    }
    String add(String a,String b){
        return a + b;
    }
}

class ScientificCalculator extends calculator{
    int add(int a , int b){
        return a + b;
    }

    double add(double a , double b){
        return a + b;
    }

    String add(String a , String b){
        return a + b;
    }
}



public class TestCalculator {
    public static void main(String[] args) {

      
    //   ScientificCalculator s1 = new ScientificCalculator();
       
       calculator s1 = new calculator();
               
       System.out.println("Parent int add: " + s1.add(5, 10));
       System.out.println("Parent int add: " + s1.add(2.5f, 2.5f));
       System.out.println("Parent int add: " + s1.add("GAurav ", "Kumar"));
        
    }
}