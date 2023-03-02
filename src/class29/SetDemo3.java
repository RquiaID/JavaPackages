package class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> fruit=new TreeSet<>(); // whenever you see Set in a class which means for sure this class will not allow duplicate
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("Kiwi");
        fruit.add("Apple");


        System.out.println(fruit);

                //Notes//
        //removes duplicates
        // Sorts data ( Alphabetical order)
    }
}
