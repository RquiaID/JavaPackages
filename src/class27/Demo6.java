package class27;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {

        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);

        System.out.println(booleans.get(0));
        System.out.println(booleans.get(4));
        System.out.println(booleans.size());// to get the number of elements

        for (int i = 0; i < booleans.size(); i++) { //first we initialize i with 0 because it starts with 0 next thing we specify the condition then i++
            System.out.println(booleans.get(i));

     // we can also use while for loop
            int k = 0;
            while (k < booleans.size()) {
                System.out.println(booleans.get(k));
                k++;
            }


        }
    }

}
