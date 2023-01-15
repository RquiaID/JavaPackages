package class9;

public class ArraysDemo3 {
    public static void main(String[] args) {
        // Create an array to store the letters A B C D E F
        char[] letters= {'A','B','C', 'D','E','F'};

        letters[0]='z'; // it is also possible to update elements of an array

        for(int i=0;i<letters.length;i++){
            System.out.println(letters[i]);
        }

    }
}
