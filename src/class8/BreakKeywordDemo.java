package class8;

public class BreakKeywordDemo {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){

            if(i==3){
                break; //loop will see this block and will stop the processing and execute the if block
                //We always right break inside the if condition
            }
            System.out.println(i);
        }
        System.out.println("Last line in our code");
    }
}
