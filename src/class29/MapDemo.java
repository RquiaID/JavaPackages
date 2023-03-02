package class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
    // collections we have discussed so far like LinkedSet, HashSet,TreeSet  they all store one value at a time,but if you want to store two values at a time we use Map
    public static void main(String[] args) {

         //  HashMap<String,Integer>groceries=new HashMap<>(); // we specify types of classes name of dat that we are going to specify in this example.
        //  LinkedHashMap<String,Integer>groceries=new LinkedHashMap<>();
        TreeMap<String,Integer>groceries=new TreeMap<>();

        groceries.put("Eggs",10); // first thing mentioned is called keys "eggs" and acts as index, if I want to print it instead of specifying the index we specify the key
        groceries.put("Milk",5);
        groceries.put("Bread",5);
        groceries.put("Rice",6);
        groceries.put("Meat",7);
        groceries.put("Soap",5);
        System.out.println(groceries.get("Rice")); //instead of specifying the index, we specify the key to print
        System.out.println(groceries);

        // just like ArrayList if we want to check if this Array is empty we have this method as well

        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        System.out.println(groceries.remove("Meat"));// the key and value will be removed
        System.out.println(groceries);




    }
}





//////Note///////
//Note HashMap is not a part of a collection framework
// Also since this Hash which means does not print elements in order
//ArrayList and Maps are very important as a tester.
