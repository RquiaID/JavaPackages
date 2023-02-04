package class15;

import java.sql.SQLOutput;

public class DogTester {
    public static void main(String[] args) {
        System.out.println("Start");
        Dog dog=new Dog();
        dog.printFood();
        System.out.println("End");
        for (int i = 0; i <2 ; i++) { // i is a local variable

        }

        // System.out.println(i); can't use outside of block
    }
}
