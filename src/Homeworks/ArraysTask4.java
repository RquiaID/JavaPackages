package Homeworks;

public class ArraysTask4 {
    public static void main(String[] args) {
        // Create an array that can store names of cars and store 6 elements into it.
        // Print all values from the array.
        String[]cars=new String [6];
       cars[0] ="DrakGTE";
       cars[1]="Pagani Huayra";
        cars[2] ="Gordon Murray";
       cars [3]="Koenigsegg Gemera";
       cars [4]="Czinger 21C" ;
        cars [5]="NamX";
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }




}
