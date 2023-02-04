package class12;

import class1.Main;

public class StringDemo4 {
    public static void main(String[] args) {


        String str = "  ";
        boolean isEmpty=str.isEmpty();
        System.out.println(str.isEmpty()); // input of this method is nothing but the output will be boolean answer true
        // but if we write something inside string it will return false
        // this is an example when you write a wrong password it shows you wrong but if you dont write anything it does not show
        // anything.
        // it also counts space it will show false as you typed something inside the string it is more precise.

        System.out.println(str.isBlank());// it does not count the spaces, even we have space it will not show false but
        // it will show true

        // Empty method checks if the string is empty or not if empty it will print true, if you write something inside string
        // or even a space it will show false.
        // like if you don't enter any information to logging to a website like amazon


    }
}