package Replits;

public class Task71 {
    public static void main(String[] args) {
        //Write a program that creates an array of integers that stores
        // the following values: 45,78, 12,  67, 55, 89, 23, 77, 88
        //Print only values that stored with even index including 0.
        int[] integers={ 45,78, 12,  67, 55, 89, 23, 77, 88};
        for (int in = 0; in < integers.length; in+=2) {
            if(in%2==0);
            System.out.print(integers[in] + " ");

        }

    }

}
