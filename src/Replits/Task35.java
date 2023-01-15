package Replits;


import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan=scan.nextBoolean();
        if(loan==true){
            System.out.println("What is your credit score");
            int score=scan.nextInt();
            if(score>=600){
                System.out.println("You may be eligible");
            }
        }


            }
        }







