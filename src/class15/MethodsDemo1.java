package class15;

import java.util.Scanner;

public class MethodsDemo1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter a number");
        scan.nextInt(); // we are calling a method(next.Int) in this line, when we call this method, my computer wait
        // for my input in the console,if I don't enter a number the code will not be executed, so this method is
        //defined in the scanner class.

        //How a method can give us something when we call it ? it is only possible because of return keyword.
        // All methods we learned in the scanner class were returned due to the return keyword not with void.

        System.out.println("Another line of code");

        Methods methods=new Methods();




    }
}
