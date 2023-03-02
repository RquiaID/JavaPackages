package class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetsDemo1 {
    public static void main(String[] args) {

       HashSet<String> fruit=new HashSet<>();

      fruit.add("Mango");
      fruit.add("kiwi");
      fruit.add("Orange");
      fruit.add("Mango");
        System.out.println(fruit);

        ///Notes///
        //HashSet do not allow duplicate values.
       // they do not follow the order means, it does not maintain insertion order.
      // it is a good option if you have a question in interview to remove duplicate element


    }


}
