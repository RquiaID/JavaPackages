package class14;

public class ArrayAddMachine {
    public static void main(String[] args) {
        int[]array2={10,10,10,20,30};
        addArrayElementsMachine(array2);// we give the input
        int[]array3={20,20,40,40};
        addArrayElementsMachine(array3);
        // whenever we are writing lots of logic and planning to reuse it again , and again we should create a method for
        // it and recall it by writing this method name
    }

    static void addArrayElementsMachine(int[]arr){// this line tells java what the input will be ,and then we write logic to
        //add the elements
        int sum=0;
        for(int number:arr){
            sum+=number;
        }
        System.out.println(sum);

    }
}
