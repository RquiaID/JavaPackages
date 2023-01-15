package class8;

public class NestedLoop5 {
    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) { // control how many lines should be printed

            if(i==1){ //to skip middle line use if

                System.out.println();
                continue;
            }
            for (int j = 0; j < 5; j++) {// control how many times starts should be printed

                    System.out.print("*");
                }
            System.out.println(); // empty println helps to go to a new one


            }
        }

    }
