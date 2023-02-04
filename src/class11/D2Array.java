package class11;
import java.util.Arrays;
public class D2Array {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };
        System.out.println(matrix[2][4]); // the first square is for the row the second is for column
        // if I want to get the information from the first array only we can say
        System.out.println(Arrays.toString(matrix[0]));

        // we can also use loop
        for (int i = 0; i <matrix[0] .length; i++) {
            System.out.println(matrix[0][i]); // to get the information in the first D array
            // or we can also use
            int []arr=matrix[0];//
            for (int j = 0; i < arr.length; j++) {
                System.out.println(arr[j]);

            }
            for (int k = 0; k <matrix[2].length ; k ++) {
                System.out.println(matrix[2][k]);


            }

        }
    }
}
