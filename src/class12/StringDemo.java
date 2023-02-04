package class12;

public class StringDemo {
    public static void main(String[] args) {
        // The most widely used class in java.
        // Interviews ask a lot of questions about this class
        String strObj=new String("Java"); // we are creating an object of the String class

        // This is a shorter way of creating an object of String class
        //mostly this is how we create the objects of String class
        String strObj2="Java";
        System.out.println(strObj2.length());// this length is (method) behavior here // it calculate how many characters are in
        //the string

        String str="Banana ";
        int len=str.length();
        System.out.println(len);
        str.length();  // the output of this method is a number, I can store that output inside a variable


        String name="Rafik";
        if(name.length()>10){ //  .length to calculate characters of a string
            System.out.println("Name can not be more than 10 letters ");
            // length does not take any input it just calculates the numbers of characters
            //This method returns the length of this string
            // It returns the number of characters  in the string.
        }
    }
}
