package class8;

public class NestedLoop2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // it is called outer for loop

            for (int j = 0; j < 5; j++) { // it is called inner for loop
                System.out.println("i="+i+"j="+j);
                // in this case we need to finish iteration of inner loop first then we go to the outer loop
                //but still the value of j will keep iterating
            }
            System.out.println("***********");
        }
    }
}
