package class9;

public class ArraysDemo7 {
    public static void main(String[] args) {
        // create an array and store 10,20,30,4,5,6,7,80
        //add all the elements which are multiple of 2
        int sum01 = 0;
        int[] integers = {10, 20, 30, 4, 5, 6, 7, 80};
        for (int j = 0; j < integers.length; j++) {
            if (integers[j] % 2 == 0) {
                sum01 = sum01 + integers[j];

            }

        }
        System.out.print(sum01);
    }
}