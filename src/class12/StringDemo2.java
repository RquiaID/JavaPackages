package class12;

public class StringDemo2 {
    public static void main(String[] args) {

        //Converts uppercase letters to lower case  (str.toLowerCase)

        String str="JAVA is FUN";
        // a method that we are calling to this object

       String newStr= str.toLowerCase();// there is no output of this method
        System.out.println(newStr);// it produces an output which is String in lower case

        String str2="i love java"; // the method name is toUpperCase
        String upperCaseLetter=str2.toUpperCase();
        System.out.println(upperCaseLetter);

    }
}
