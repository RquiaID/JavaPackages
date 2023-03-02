package class30;

import java.util.Map;
import java.util.TreeMap;

public class EntryExampleDemo9 {
   /* Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.*/

    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("Morocco", "Rabat");
        countries.put("USA", " Washington, D.C");
        countries.put("India", "New Delhi");
        countries.put("France", "Paris");
        // first we need to get all the entries
        // getKey to get only keys
        // getValue to get only values
        /// instead of specifying the complete dataType we can use var keyword

        var entrySet = countries.entrySet();

        // this set contains object of entry class ,so we need to write this

        for (var entry : entrySet) {

            System.out.println(entry.getKey() + " " + entry.getValue());// easier way
        }

        var iterator = countries.values().iterator();
        while (iterator.hasNext()) {

            var value = iterator.next();
            System.out.println(value);

        }
    } ///////////////////var/////////////// keyword works only with java 10.
}


