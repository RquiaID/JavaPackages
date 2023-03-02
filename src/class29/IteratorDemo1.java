package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {

    public static void main(String[] args) {
        ArrayList<Double>numbers=new ArrayList<>(); //we can not use primitive data type with collection framework
        numbers.add(10.0);
        numbers.add(15.0);
        numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.3);

        // with the help of enhanced for loop we will be able to print all elements one by one
        // overloading method is when we have same method but can hold different parameters

       ///Very Important// numbers.removeIf(number -> number > 11); //This is called lambda expression helps to remove the element based on the condition // Only work with java 8.

        // getting object of iterator
       Iterator<Double>iterator=numbers.iterator();
       // hasNext method tells us if there is any more element left to iterate. I t only returns false if there is no more element left to iterate.
       /* System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(numbers);*/

        // hasNext keeps on returning true as long as there are elements left to be iterated
        while(iterator.hasNext()){// this method checks if the element present
           double number= iterator.next();// this next method grab the element
            if(number>11){
                iterator.remove();
            }
        }
        System.out.println(numbers);

    }
}
