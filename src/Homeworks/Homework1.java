package Homeworks;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
      //  1) Prompt the user to enter person heights in inches. Person should be classified as one of the following:
     //• short (under 60 inch)
    //• medium(between 60 -72 inch
        //• tall (over 72 inch)
        System.out.println("Please enter your height in inches");
        int height= Scan.nextInt();
        if(height<60) {
            System.out.println("short");

        }else if(height==60 || height<=72){
            System.out.println("medium");

        }else if(height>72){
            System.out.println("tall");


        }

    }


}
