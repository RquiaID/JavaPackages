package class12;

public class StringDemo10 {

    public static void main(String[] args) {
   // tells us the location of a character, it tells the index of a character
        // the input in this case is a char the output

        String str="Java is not pain";

        System.out.println(str.indexOf("not"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("p"));
        for (int i = 0; i <str.length() ; i++) { // to print the whole letters
            System.out.println(str.charAt(i)+" has the index"+i);

        }


        /// if we want to print all of them we can use loop
    }
}
