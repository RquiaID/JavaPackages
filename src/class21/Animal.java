package class21;

public class Animal {
    String name;
    String color="Black";
}
class Cat extends Animal{
    int age=10;
    double weight;


    void printColor(){
        String color="Blue";
        System.out.println(color);// call local variable
        System.out.println(this.color);
        System.out.println(super.color); // I can only use super keyword in child class
        // if I replace it with this I will see white in the console, So if I want to see instance variable I use "this", and "super" for parent class
        // super only works with immediate parent
    }


}
