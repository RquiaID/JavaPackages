package class27;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
         //<> they are diamand operator or angel brackets we specify the data type in them.
        // we have created an array of Strings
        ArrayList<String>names=new ArrayList<>();// used angel brackets to specify what type of data will be storing
        // because this arraylist is a class I have to store some method, and we call method using object name and press.

        // add method to add elements to this arrayList
        names.add("Nelson");
        names.add("Sam");
        names.add("Diana");
        names.add("Zahra");      // here we don't need to use a loop, but we can use it to print.
        names.add("Daria");
        names.add("Saba");
        System.out.println(names);

    }
}
