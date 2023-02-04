package class15;

public class MPracticeTester {
    // calling the method needs:
    public static void main(String[] args) {
        // first we need the object of the class
        // then we say sout (mp.arraySum(array));

        MPractice3 mp= new MPractice3();
        int[]array={10,20,30};
        System.out.println(mp.arraySum(array));
        System.out.println(mp.arraySum(new int[]{10,20,30}));//mor we can use this

        // To call the method
        // create the object of the class that has the method
        //Objectname.methodename

    }
}
