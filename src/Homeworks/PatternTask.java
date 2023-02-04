package Homeworks;

public class PatternTask {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {//for each iteration of outer loop the inner loop changes
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // first half is printed

            }
            System.out.println();

        }//// This print the lower half

        for (int i = 1; i <= 4; i++) {//for each iteration of outer loop the inner loop changes
            for (int j = 0; j <4-i ; j++) {
                System.out.println("*");


            }
        }
    }
    /*

   *
   * *
   * * *
   * * * *
   * * *
   * *
   *

     */

}
