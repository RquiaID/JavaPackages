package Replits;

import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        //Write a for loop that will print out a series of numbers starting at 0 and
        // ending at the doubled value of end(value must be taken from a user), exclusive.
        //Each number should be on the same line, separated by a space.


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int end = input.nextInt();
        int doubledend = end * 2;
        for (int i = 0; i <= doubledend; i++) {
            System.out.print(i + " ");
        }
    }



            }







