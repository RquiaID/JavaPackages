package Replits;

public class task65 {
    public static void main(String[] args) {
        //``
        //
        //Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.
        //
        //Sample input/outputs:
        //
        //```
        //In: 7
        //6 5 4 3 2 1 0
        //```
        //
        //```
        //In: 12
        //11 10 9 8 7 6 5 4 3 2 1 0
        //```
        //
        //```
        //In: 20
        //19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0

        int x = 7;
        for (int i = x - 1; i >= 0; i--) {
            System.out.print(i + " ");

        }

        System.out.println();

        int y = 12;
        for (int j = y- 1; j >= 0; j--) {
            System.out.print(j+" ");
        }
        System.out.println();
        int z=20;
        for (int k = z-1; k >=0; k--) {
            System.out.print(k+" ");

        }



    }
}


