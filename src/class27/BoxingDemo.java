package class27;

public class BoxingDemo {
    public static void main(String[] args) { // converting the primitive data type to wrapper class we call it boxing bringing data type  back to its origin is called unboxing

       int number=15;
       printData(number);// this flexibility is only given to wrapper classes

        //boxing and unboxing conversion between wrapper type and primitive type

        Integer f=10; // autoboxing
        int number2=f;

    }
    public static void printData(Integer number){ // this method is called autoboxing
        System.out.println(number);
    }
}
/*
In Java, a wrapper class is a class that provides an object-oriented representation of a primitive data type. There are eight primitive data types in Java: byte, short, int, long, float, double, boolean, and char. Each of these primitive types has a corresponding wrapper class in Java.

Here are the eight wrapper classes in Java:

Byte
Short
Integer
Long
Float
Double
Boolean
Character
Wrapper classes provide a number of useful methods and utilities for working with primitive types as objects. For example, wrapper classes can be used to convert between different numeric data types, perform arithmetic and bitwise operations, and work with collections of primitive values.

Wrapper classes are also useful for situations where an object is required, but a primitive data type is provided. For example, the ArrayList class in Java can only store objects, so if you want to store a collection of integers in an ArrayList, you can use the Integer wrapper class to provide an object-oriented representation of each integer.

In addition to the methods and utilities provided by wrapper classes, Java also provides a feature called autoboxing and unboxing, which allows you to automatically convert between primitive types and their corresponding wrapper classes. This can make working with primitive types in Java more convenient and expressive.
 */