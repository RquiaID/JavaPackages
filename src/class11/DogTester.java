package class11;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {

        // We are creating an actual an object from the class Scanner
        // Scanner scanner=new Scanner(System.in);
        //Scanner.next();
        Dog dog1=new Dog(); // this is how we create objects from class
        // if I write a cat it will give me error because the computer does not know anything about cat
        // we didn't define it in the same package.
        // the class and the object needs to be in the same class

        dog1.sleep();

    }
    // is real life we only have one class and one main method
    // we have created a class and define some behaviors using void key word like int double
    //if we want to create the object we write the name of class and any variable after that= new name of class();

}
