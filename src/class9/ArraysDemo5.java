package class9;

public class ArraysDemo5 {
    public static void main(String[] args) {
        // we can assign a value to a variable or left them empty
        int[] numbers=new int[5];// this five is the size we are telling how many elements this array can hold

        numbers[0]=50;
        numbers[1]=30;  // command D to repeat lines
        numbers[2]=55;
        numbers[3]=60;
        numbers[4]=52;
        for (int i = 0; i <numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
