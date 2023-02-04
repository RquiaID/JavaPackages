package Homeworks;

public class Homework9From11 {
    public static void main(String[] args) {

        int[] numbers = {3,5,1,8,4};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
                System.out.println("The minimum number is :" + min);
                System.out.println("The maximum number is :" + max);

            }
        }

    }
}
