package class28;
import class26.Dog;
import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {


    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>(); // this is a genetic example in java it uses the angel brackets and hold one data type at a time

        names.add("10");


        Object a=new String("some value");
        Object b= new Integer(10);
        Object c=new Scanner(System.in);

        // No one now uses the arrays like this.
        ArrayList name=new ArrayList(); // this is non-genetic it has diverse data types
        name.add("Ehsan");
        name.add(10);
        name.add('a');
        name.add(new Dog("Jacky","Green","unknow"));

        for (Object j:name) {
            ((String)j).trim();
        }

 // in java everything stored by default has an object as a father

    }
}
