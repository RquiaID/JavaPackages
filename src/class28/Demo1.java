package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        var name="kjfnekjhhjfe";  // we do not have to put datatype name
        var c='S'; //////VERY IMPORTANT/// only works with java 10
        var f=12.5;




        // this is a method returns an object of type iterated, and it has 3 methods :
        // this hasNext will keep returning true until all elements are done // if there are any left element to iterate it will give true, it get elements from arraylist

        //// VERY IMPORTANT//////  does not work in java 7
        words.removeIf(s -> s.endsWith("a")); // there are some words present in ArrayList remove them if this condition is true the condition is if element ends with letter A.
        System.out.println(words);           // we do not need to specify the date type you have only to mention the variable

        //////VERY IMPORTANT/////it works from java 6 to java 19
        /*
        Iterator<String> iterator=words.iterator();
         while(iterator.hasNext()) { // this hasNext will keep returning true until all elements are done // if there are any left element to iterate it will give true, it get elements from arraylist
            String s=iterator.next();
            if (s.endsWith("a")) {
                iterator.remove();

         */



         // very important////  using a loop is not a safe option if you want to change some elements
        }
        }

    // we can not use normal for loop or normal loop to perform any operation that modify the size of arrayList
   //Iterators have their own mechanism to adjust themselves accordingly, loops can not do that they are static

