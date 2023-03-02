package class29;

import java.util.TreeSet;

public class TaskSets {
    public static void main(String[] args) {



   /* List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
    How can you remove all duplicates from ArrayList?*/

        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Jane");
        names.add("James");
        names.add("Jasmine");
        names.add("Jane");
        names.add("James");
        System.out.println(names);

    }
    }



