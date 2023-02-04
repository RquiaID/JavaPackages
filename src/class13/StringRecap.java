package class13;

public class StringRecap {
    public static void main(String[] args) {


        String str = "Java is Great"; // print all  characters one by one
        for (int i  = 0; i < str.length (); i++) {
            System.out.println(str.charAt(i));
            // So we use this method to get all the characters
            // What is the input to the charAt => the input of chaAt method is integer 
            // the output is a char 

       int count=0;
            for (int j = 0; j < str.length(); j++) {  // this how to count how many times letter is repeated
                if(str.charAt(i)=='a'){
                    count++;
                }
                
            }
            System.out.println("Letter a has appeared" +count+ " Many times ");
        }

    }
}