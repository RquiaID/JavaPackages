package class20;

public class SuperClass {

    SuperClass(){
        System.out.println("I am a constructor from the parent class");

    }
}
    class SubClass extends SuperClass{

    SubClass(){
    super();    // makes a call to the parent class constructor
        // super makes a call to immediate parent.
        // as this keyword it needs to be in the first line
        // even we don't have super compiler will add it by default

        System.out.println("I am a child constructor");

    }




}
