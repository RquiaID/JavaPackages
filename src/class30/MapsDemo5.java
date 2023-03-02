package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {
        Map<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(1, "Nezir");
        studentsMap.put(2, "Anush");
        studentsMap.put(3, "Tami");
        studentsMap.put(4, "Aisha");
        // write a piece of code to remove all the keys from above map if they are  greater than  2

        Set<Integer> keys=studentsMap.keySet(); // we can also use collection because it is a parent of all
        keys.removeIf(x->x>2);
        System.out.println(keys);
        //the keys are not only removed from set they are also removed from map
        System.out.println(studentsMap);




    }
}
