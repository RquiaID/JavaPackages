package class14;

import java.util.Scanner;

public class ReturnDemoTester {
    public static void main(String[] args) {

        ReturnDemo rd=new ReturnDemo();
      String str = rd.method1();// assign method to a variable
        // then call them
        System.out.println(str);
        // remember I have to assign the variable first then call
        // the method
        int result= rd.method2();
        System.out.println(result );
    }
}
