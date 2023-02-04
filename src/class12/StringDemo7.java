package class12;

public class StringDemo7 {
    public static void main(String[] args) {
        String str="I love java";
        boolean starsWith=str.startsWith("I");//checks if a string starts with a specific characters
        System.out.println(starsWith);
        System.out.println(str.endsWith("java"));//checks if string ends at specific characters


        // this method is called Method chaining is when multiple methods are called on the same line
        // only those methods can be chained which returns a String
        System.out.println(str.toLowerCase().startsWith("i"));// it will give true because I am converting everything to lower case


        System.out.println(str.contains("java"));// check if a word is present in a string if so we get true if not we get false
    }


}
