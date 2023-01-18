package Replits;

import java.util.Scanner;

public class Task78 {
    public static void main(String[] args) {
        //Create an int array of integers with a size of 5 and input values with Scanner.
        //Don't print prompt questions for a user.
        //Using loop print out each element of the array that should look like the output below
        //1
        //2
        //3
        //4
        //5
        int[]integers= new int [5];
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter an integer 5 times");
        System.out.println();
        integers[0]=scan.nextInt();
        integers[1]=scan.nextInt();
        integers[2]=scan.nextInt();
        integers[3]=scan.nextInt();
        integers[4]=scan.nextInt();
    }

}
