package class30;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class EntryDemo {
    public static void main(String[] args) {
        // this entrySet is a set that contains object of entry class

        Set<Entry> entrySet=new LinkedHashSet<>();
        entrySet.add(new Entry(1,"Nezir"));
        entrySet.add(new Entry(2,"Anush"));
        entrySet.add(new Entry(3,"Tami"));
        entrySet .add(new Entry(4,"Aisha"));  // in java these entries are not internally stored they are not joined this entry class call these object together
        entrySet.add(new Entry(4,"Saba"));
        entrySet.add(new Entry(4,"Gul"));
        entrySet.add(new Entry(4,"Bahar"));

        // remove those objects for which value of key is greater than 2 and value contains the letter i
        //this x is going to be the object of thi sentrySet from that object we call the method getkey followed by the condition which greater than 2 the n we call the second method which is getValue followed by its condition that is contains letter i

        entrySet.removeIf(x->x.getKey()>2&&x.getValue().contains("i"));
        System.out.println(entrySet);



    }
}
