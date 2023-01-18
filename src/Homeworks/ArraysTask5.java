package Homeworks;

public class ArraysTask5 {
    public static void main(String[] args) {
        // Create an array of size 5 on integers and calculate the sum of all elements in an array.
        int[] integers=new int[5];
       int sum=0;
        integers[0]=10;
        integers[1]=20;
        integers[2]=30;
        integers[3]=40;
        integers[4]=50;
        for (int i = 0; i < integers.length ; i++) {
            sum=sum+integers[i];
            System.out.println(sum);

        }




    }
}
