package class29;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        LinkedHashSet<String>fruit=new LinkedHashSet<>(); // whenever you see Set in a class which means for sure this class will not allow duplicate
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("Kiwi");
        fruit.add("Apple");


        System.out.println(fruit);


        //Notes//
        // LinkedHashSet also removes duplicate, but it will retain the element's order but slower that HashSet.
    }
}
