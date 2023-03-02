package class28;

import java.util.ArrayList;

public class BoxingDemo {  ////////VERY IMPORTANT////// Now we are dealing with classes in non-primitive
    public static void main(String[] args) {
        Integer integer=new Integer(10);   // I am creating object of Integer class (Integer is a class)
        int number=integer; // this part is auto unboxing
        int number2=integer.intValue(); // unboxing

        double d =12.3;
        Double wrapperD=new Double(d); // This is how  boxing is presented, the longer way

        Double wrapperP=d; // This how autoboxing is presented
        float f=12f;



    }
}
