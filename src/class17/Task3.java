package class17;

public class Task3 {
    public static void main(String[] args) {
     //REMEMBER WE CAN CALL A METHOD ONLY BY MENTIONING ITS NAME BY MAKING IT STATIC

        System.out.println(  getOnlyVowels("Java") );

    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.

    return type=> String
    name of methods=> onlyVowels
    Parameters=>String inputStr

     */


     }
     private static String getOnlyVowels(String inputStr) {
        return inputStr.replaceAll("[^AEIOUYaeiouy]","");



     }


}

