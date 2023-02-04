package class12;

public class StringDemo3 {
    public static void main(String[] args) {
        String firstName="Rquia";
        String lastName="Idbella";
        String fullName=firstName+" "+lastName; // most widely used
        System.out.println(fullName);
        System.out.println(firstName+" "+lastName);
        // there another method called concat
        System.out.println(firstName.concat(" "+lastName)); //method concat, input lastName, output is fullName
    }
}
