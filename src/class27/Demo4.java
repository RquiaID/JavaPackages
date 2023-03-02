package class27;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        // String is a class that's why I don't get error
        // primitive data type cant be used in ArrayList
        // in java they created classes that will give same result as primitive data types:
        // byte=>Byte
        //short=>Short
        // int=>Integer
        //float=>Float
        //double=>Double
        //char=>Character
        //boolean=>Boolean

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(15);
        numbers.add(20);
        numbers.add(45);
        numbers.add(150);
        numbers.add(200);
        numbers.add(56);
        System.out.println(numbers);
    }
}
