package class20;

public class BaseClass {
    String name="John";
     void hello(){
         System.out.println("Hello method from Baseclass ");
     }
}
class Child extends BaseClass{

    String name="Jane";
    void callMe(){

        System.out.println(name);// output is John actually this is added by default
        System.out.println(super.name);// when you want to differentiate between parent class and child one OUTPUT is John

    }
    void hello(){
        System.out.println("Hello from child class");
    }
    void callingParentMethod(){

        hello();// this is calling hello method from child class, this is added by default so this is calling current class and super calling the immediate class
        super.hello();// this is calling hello method from super class or parent

        //////We only use super keyword when parent and child class has same method name
    }

}