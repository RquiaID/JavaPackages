package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {
        // 10 20 30 45 50
        int sum=0;
        int[] numbers = {10, 20, 30, 45, 50};
        for (int i = 0; i < numbers.length; i++) {// we start from 0 because index starts from 0
            sum=sum+numbers[i]; // this how to print the sum=> we are adding numbers

            System.out.println(sum);

        }
    }
}