package class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));// print a specific name //Tami//
        System.out.println(studentsMap.size());// size
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.containsValue("Aisha"));
        System.out.println(studentsMap.remove(3));
        System.out.println(studentsMap);

        //Replace a value
        studentsMap.replace(2,"Asli");
        System.out.println(studentsMap);


        ////Remember this is dynamic it can grow or shrink that is why we can not use normal loops


    }


}
