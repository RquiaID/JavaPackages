package class16;

import java.sql.SQLOutput;

public class Person {
    private double bankBalance=1250000;  // this is how we use private variable, this tells java
    // that this variable is only belongs to
    // this class and only should be shared within this class.

    String Address="Street 123"; // when we don't use any keyword the default access level is applied
    public String name="Jon Snow";

   private void printPhonePassword(){ // private access modifier is needed here is sensitive info

        System.out.println("pass123");
    }
    void printSSN(){ // it is not that private ,so we can use default access
        System.out.println("123456789");
    }
    void printTiktokAccount(){ // this kind of info is not private ,so I can use public access modifier
        System.out.println("user123");
    }


    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printSSN();
        person.printTiktokAccount();
        // here I can print everything cuz I am in the same class but if I use different class

    }
}
