package class16;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
      //  System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);

        // those variables which have a private modifier will
       // not be accessed in other class
        // I can only use it within the same class
        // private means can access things in the same class
        //Default also needs to be within the same package.
        // package can be anywhere inside my project

        //so if something is private I can only access it within the same class
        //with default accessed within the same package
        //with public anywhere inside my project
        // default says access within same class and within the same package but not in any other class in different package.
        person.printTiktokAccount();
      //  person.printPassword(); I got an error cuz private cant be accessed.
        String str="kjlhgds";



    }
}
