package class16;

public class Task8 {

    // Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the creating an instance of the class
    // return type  is int
    // name of method aumArrayElements
    //Parameters=> int[] arr
    //access modifier will be default



    int sumArrayElements(int[]array){// if  I put static here,  I dont  have to  make an instance when I call a method
       // So I will be creating a method without creating a new instance if I remove it I have to create the object

        int sum=0;
        for(int num:array){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) { // this is how we call this method

        int[] arr={10,25,35,45};
        Task8 task8=new Task8();
        System.out.println(task8.sumArrayElements(arr));

    }
    }






