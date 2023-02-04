package Homeworks;

public class MaxAndMinimumValues {
    public static void main(String[] args) {
        double[] values={1,2,3,4};
        double max = values[0];

        for (int i = 0; i < values.length ; i++) {
            if(max>values[i]){
                max=values[i];
                System.out.println(max);
            }


        }

    }
}
