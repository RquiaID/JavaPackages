package class9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //  Write a program that reads a range of integers (start and end point),
        //  provided by a user and then from that range prints the sum of the even and odd integers.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers starting point and ending point");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println("start " + start + "end " + end);
        int evenSum=0;
        int oddSum=0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {

             evenSum+=i;
            } else {
                oddSum=oddSum+i;// can all be written like this oddSum+=i

                System.out.println("Sum of all the Even Numbers"+evenSum);
                System.out.println("Sum of all the Odd Numbers"+oddSum);
// We check the number if it is even we add it to even part if it is odd we add it to odd number

            }
        }
    }
}