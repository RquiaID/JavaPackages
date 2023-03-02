package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsDemo7 {
    public static void main(String[] args) {
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");  // in java these enteries are not internally stored they are not joined this entry class call these object together
        studentsMap.put(4,"Saba");
        studentsMap.put(4,"Gul");
        studentsMap.put(4,"Bahar");

        // They have created a class called entrySet this Set
        //this Entry can call keys and values

      // in mapsDemo7 we are importing Entry class created by java devs, and in EntryDemo we are using Entry class that we created?
     //    so put method simplifies the code and save us from creating other class, objects and instances.

        Set<Entry<Integer,String>> entrySet=studentsMap.entrySet();
        for(Entry<Integer,String>entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        entrySet.removeIf(x->x.getKey()>2&&x.getValue().contains("i"));
        System.out.println(studentsMap);




       /*     In Java, an Entry class refers to a data structure that represents a single key-value pair in a map. A map is a collection of key-value pairs, where each key is unique and maps to a corresponding value.

        The Entry interface is defined within the Map interface and represents a single mapping between a key and a value. It contains two methods:

        getKey(): This method returns the key associated with the mapping.

                getValue(): This method returns the value associated with the mapping.

                The Entry interface is used primarily for iteration over maps, as it allows you to access each individual key-value pair in the map.

        Some of the commonly used implementations of the Map.Entry interface in Java include:

        HashMap.Entry: This class is used to represent a single key-value pair in a HashMap.

        TreeMap.Entry: This class is used to represent a single key-value pair in a TreeMap.

        LinkedHashMap.Entry: This class is used to represent a single key-value pair in a LinkedHashMap.

        Overall, the Entry class provides a convenient way to work with individual key-value pairs in a map in Java.*/







    }
}
