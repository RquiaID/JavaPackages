package class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();  // we are creating the object of arrayList, and contains method comes from arrayList class
        names.add("Fizzy");
        names.add("Savo");
        names.add("Sam");
        names.add("Urwa");
        names.add("Tarik");
        names.add("Abeera");

        System.out.println(names.contains("Daria")); // this contains method  comes from ArrayList
        System.out.println(names);
        names.remove( "Sam"); // dynamic nature if ArrayList, it can shift elements automatically
        System.out.println(names);

        names.set(3,"James Bond"); // first we write the index that we want to replace then the string we want to replace index with.
        System.out.println(names);
        System.out.println(names.indexOf("Savo")); // Java do calculation and find out the index of a specific name or value
    }
}
