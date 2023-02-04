package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str="KTDFDEijkjfj98986975$%#^&**()"; // to replace only uppercase or lowercase or special characters etc
          // Replaces all upper case letters from A TO Z
        System.out.println(str.replaceAll("[A-Z]","#"));// identify all the uppercase letters
        // if I put [A-K] any letter after k will not be replaced basically a range that I want tobe replaced.


        // Replaces all lower case letters from a to z
        System.out.println(str.replaceAll("[a-z]","#")); // replace lowercase

        // Replaces all numbers from 0-9
        System.out.println(str.replaceAll("[0-9]","#"));
        // Replaces upper case from A-Z and lower case from a-z
        System.out.println(str.replaceAll("[A-Za-z]","#"));// all uppercase and lowercase will be replaced
        // Replaces upper case from A-Z and lower case from a-z and numbers as well
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        //do not replace upper case from A-Z and lower case from a-z and numbers as well
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));//^^ is used to express not
        // replaces everything except letters(upper nad lower) and numbers
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));

    }
}
