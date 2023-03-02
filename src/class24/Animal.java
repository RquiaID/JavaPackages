package class24;
/*
   create a class and define the speak eat methods and create 3 subclasses and override the speak eat method

    */

// Abstraction says ignore implementation on parent, you can only tell the header part of a method you can tell the name and out put of a method
// So we just write the name of method but not implementation or the body. Only focus on what that thing does
// But there is flexibility, not all methods supposed to be abstract I can name some methods in the body of parent class if you want
// Abstract forces  the child class to provide implementation to  the method or be declared as abstract
public abstract class Animal {// abstract word forces Java compiler to give you error if you are trying to implement any of the methods

   abstract void speak();// tells that the speak method will not have an implementation


    abstract void eat();

    }
class Cat extends Animal{
    void speak(){
        System.out.println("Meow Meow");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}

class Horse extends Animal{
    @Override
    void speak() {
        System.out.println("Horse is speaking");
    }

    @Override
    void eat() {
        System.out.println("Horse is eating");
    }

}
