package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo6 {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(4,"Saba");
        studentsMap.put(4,"Gul");
        studentsMap.put(4,"Bahar");

        Collection<String>values=studentsMap.values();
        // how to get only the values from a map
        System.out.println(values);

        //remove all values which contains the letter i
        values.removeIf(x->x.contains("i"));
        System.out.println(studentsMap);
        System.out.println(values);

        // remove the entries if key is greater than 2 and value contains the letter i
        // it is impossible because String presents inside the values and the keys which are 1,2,3 are not present inside values. The value method give access only to keys if we want to get the values first we have to call the keys

        // First thing we have to do is: see Demo7


    }
}
