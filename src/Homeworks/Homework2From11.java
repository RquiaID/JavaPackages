package Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2From11 {
    public static void main(String[] args) {
        // Using Scanner create an array of countries. When an array is created, retrieve all values from it and while retrieving
        // those values print capital for each country. (use 2 different loops).

        Scanner scan = new Scanner(System.in);
        String[] countries = {"Morocco", "US", "UK", "France", "India"};
        for (int i = 0; i < countries.length; i++) {
            System.out.println("Capital of " + " " + countries[i] + " is ");
            String capital = scan.nextLine();

        }

        System.out.println("Capitals using for-each loop:");

        for (String country : countries) {
            System.out.print("Enter the capital of " + country + ": ");
            String capital = scan.nextLine();
            System.out.println(country + ": " + capital);


        }


    }
}












