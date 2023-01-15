package class8;

public class NestedLoop4 {
    public static void main(String[] args) {

        for( int i=0; i<3;i++){ // control how many lines should be printed

            for(int j=0; j<5;j++ ){// control how many starts should be printed

                if(j==1||j==2){
                    continue;
                }
                System.out.print("*");
            }
            System.out.println(); // creates new line if I remove it everything is going to be printed in one line
        }
    }
}
