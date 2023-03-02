package class28;

import java.util.ArrayList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {// no shifting will happen only thing we will update is indexing
        long startTime=System.currentTimeMillis();

        ArrayList<String>numbers=new ArrayList<>();
        for(int i=0;i<10;i++){
            numbers.add(0,"Test Data");
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);



    }
}
