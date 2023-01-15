package class8;

public class NestedLoops6 {
    public static void main(String[] args) {
        for (int j = 0; j < 3; j++) { // outer controls how many times code will be repeated I mean lines
            for (int i = 0; i <= 5; i++) {// inner controls how many times
                System.out.print(i + " ");

            }
            System.out.println();
        }
    /*
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5

     */

       // Notes: If you want to write numbers in one line write print instead of println.
        // if you want to put space put double quotation
        // if you want to repeat the same logic use loop
        // if I want to print out things in new line create empty sout

        for (int i = 0; i <= 3; i++){//executes the below code 3 times
            for (int j = 1; j <= 5; j++) {
                System.out.print(j+" ");// prints the value of j from 1 to 5
            }
            System.out.println();
            //The outer for loop represents the vertical row and the inner for loop represents the horizontal column



        }

    }
}



