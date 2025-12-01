abstract class Animal{
   abstract void sound();
}

class Dog extends Animal{
  void sound(){
    System.out.println("Dog Barks");
  }
}

class Cat extends Animal{
  void sound(){
    System.out.println("Cat meows");
  }
}

public class sounds{
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.sound();
        c.sound();
    }
}