package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {
        // Create an empty array then store 45 44 33 20 and 10 in it then use a loop
        // to add all the elements which are present in even indexes


        // create an array and store 10,20,30,4,5,6,7,80
        //add all the elements which are multiple of 2

        // first create sum variable
        int[] numbers = new int[5]; // this is how to create empty array # 5 means number of elements the array will hold

        numbers[0] = 45; // Remember all arrays stats from 0
        numbers[1] = 44;
        numbers[2] = 33;
        numbers[3] = 20;
        numbers[4] = 10;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) { // i should be  <numbers.length
            if (i % 2 == 0) {// we are not using numbers[i] because we do not want even numbers but even indexes
                sum = sum + numbers[i];   // this is how to add sum  of numbers, but we
                // need to declare a Variabe first
                System.out.println(sum);
/*
                int sum01 = 0;
                int[] integers = {10, 20, 30, 4, 5, 6, 7, 80};
                for (int j = 0; j < integers.length; j++) {
                    if (integers[j] % 2 == 0) ;
                    sum01 = sum01 + integers[j];
                    System.out.print(sum01);*/
  //if you wanna check even indexes so we write (i%2==0) i represents the index...........
                //  if you wanna check the values of arrays are even or odd
                //  we write (variable name[index]) (numbers[i]% 2==0)
                }

            }


        }
    }

