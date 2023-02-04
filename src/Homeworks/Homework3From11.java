package Homeworks;

import java.util.Arrays;

public class Homework3From11 {
    public static void main(String[] args) {
        //Create a 2D array of integer values. Print the sum of all numbers.
        int[][] integers = {{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};
        int sum=0;
        for (int i = 0; i < integers.length ; i++) {
            for (int j = 0; j < integers[i].length ; j++) {
                sum+=integers[i][j];
                System.out.println(sum);


            }



        }

     }
    }


