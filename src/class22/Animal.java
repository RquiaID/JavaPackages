package class22;

public class Animal {

    String name;
    String color;
    int age;
    double weight;

   void speak(){

        System.out.println("Animal can speak");
    }
    void eat(){

        System.out.println("All the animals eat");
    }
}
class Cat extends Animal{

   void speak(){
        // we are overriding speak method in Cat class
      //  super.speak(); // if I want to keep the implementation of speak used in the parent class
        System.out.println("Meow Meow.......");

    }

}
class Dog extends Animal{

}

class Tester{

    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.speak();
    }
}
