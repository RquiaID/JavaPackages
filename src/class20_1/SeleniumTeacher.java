package class20_1;

import class20.Teacher;

public class SeleniumTeacher extends Teacher {
    public static void main(String[] args) {

        SeleniumTeacher selenium=new SeleniumTeacher();
        selenium.homework(); // public
        selenium.grade();// protected available through inheritance
         //default are only visible within the same package
         // through inheritance protected members can be available
       // selenium.scholarship();//default not available in different package

    ////////Note////////// Protected members( methods and variables) can be visible through inheritance even in different package.

    }
}
