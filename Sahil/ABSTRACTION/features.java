abstract class Mobile{
    abstract void features();
}

class Samsung extends Mobile{
    void features(){
        System.out.println("Samsung as foldable display");
     }
}

class iPhone extends Mobile{
    void features(){
        System.out.println("iphones as better Security");
    }
}

public class features{
    public static void main(String[] args) {
    Samsung m1 = new Samsung();
    iPhone p1 = new iPhone();

    m1.features();
    p1.features();
}
}