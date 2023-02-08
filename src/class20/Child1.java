package class20;

public class Child1 extends Parent{
    public static void main(String[] args) {
        Child1 c1=new Child1(); // object of child1
        c1.hello();
        c1.bye();
       // c1.money();money() has private access modifier

        // How static members should be accessed: it is through the class name
        Parent.bye(); // static bye method is accessed through Parent class
        Child1.bye(); // also my method bye can be accessed through Child1 with the help of keyword extends it actually comes from parent class
         // static members belongs to the class and can be accessed through the class
        c1.name="Rquia"; // this is how we access instance members

        Child1.lastname="Idbella";

    }

}
