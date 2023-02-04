package class12;

public class StringDemo5 {
    public static void main(String[] args) {

        String str="Java";
        String str2="JAVA";
        // if these 2 strings are equal I will get true
        // what is the input of this method: string; the  output: boolean check if these two strings are equal;
        // they are case-sensitive if one of java word is lower or upper case I will  get false

        boolean areEqual=str.equals(str2); // This is case-sensitive it will return false
        System.out.println(areEqual);
        boolean areEqual2=str.equalsIgnoreCase(str2); // Ignores case sensitive like emails are case ignore case
        // however password not.
        System.out.println(areEqual2);

    }

}
