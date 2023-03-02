package class29Homework;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashes1 {
  /*  Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
   */

    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet();
        cities.add("Agadir");
        cities.add("Anza");
        cities.add("Marakkech");
        cities.add("Azrou");
        cities.add("Al Hoceima");
        cities.add("Casablanca");
        cities.add("Rabat");
        cities.add("Ain Harrouda");
        cities.add("Dakhla");
        cities.add("Tiznit");
        cities.add("Ait melloum");

        cities.removeIf(x-> x.startsWith("A"));
        System.out.println(cities);

    }
    
}
