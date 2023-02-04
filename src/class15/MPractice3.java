package class15;

public class MPractice3 {

    /*
    Create a method that takes an array of int sum all the elements from the array and return the sum

     */

    // we need to write the return type first which is int in this case
    // name of method=> arraySum
    // kind of parameters=> which is int[] arr
    // whenever we need to create we need to specify first return type after name of method() then parameters

    int arraySum(int[]arr){

        int sum=0;
        for (int num:arr) {
            sum+=num;

        }
        return sum;
    }


    }
