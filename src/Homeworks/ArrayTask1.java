package Homeworks;

import java.sql.SQLOutput;

public class ArrayTask1 {
    public static void main(String[] args) {
        // 1) Create an array of chars and store grades into it: A,B,C,D,E,F.
        // Then print a grade B (use 2 different ways of creating an array).

        char[] grades={'A','B','C','D','E','F'};
        System.out.println(grades[1]);

        System.out.println("************************");


        char[]Grades= new char[] { 'A','B','C','D','E','F'};
        System.out.println(Grades[1]);



    }
}
