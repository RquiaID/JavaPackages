package class21;

public class Calculator {
    void add(int num1, int num2) {

        System.out.println(num1 + num2);
    }
    void add(int num1,int  num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    void add(int num1, double num2) { // data type is different
        System.out.println(num1 + num2);
    }

    void add(double num2, int num1) { // sequence is different
        System.out.println(num1 + num2);
    }
// class is consists of fields and behaviors
// if we are building something as real life user to add something we can use this
// when you overload something the end use will have a good benefit of it, it helps us give flexibility to end user to call


}
