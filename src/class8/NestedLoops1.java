package class8;

public class NestedLoops1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // it is called outer for loop

            for (int j = 0; j < 5; j++) { // it is called inner for loop

                System.out.println("i=" + i + " j="+j);
            }
            System.out.println("****************");

        }
    }
}