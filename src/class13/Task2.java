package class13;

public class Task2 {
    //2) Create a String and print it in reverse order (Sunday → yadnuS).
    public static void main(String[] args) {
        // we are going to use the method charAt
        String str="Sunday";
        for (int i = str.length()-1; i>=0 ; i--) { // this method is to print is reverse order
            // str.length()-1  gives me the reverse order
            System.out.print(str.charAt(i));



            }

        }
    }

