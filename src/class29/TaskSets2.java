package class29;

import java.util.TreeSet;

public class TaskSets2 {
    public static void main(String[] args) {
        // Create a Set collection in which you need to add names of the countries.
        // In this set we want all objects to be sorted in alphabetical order.
        // Using 2 different ways retrieve all elements from set.

        TreeSet<String> Countries = new TreeSet<>();
        Countries.add("Morocco");
        Countries.add("Turkey");
        Countries.add("Tajikistan");
        Countries.add("Pakistan");

        System.out.println(Countries);

        for (String x : Countries) {
            System.out.print(x + " ");
        }
    }
}
