package class20;

public class JavaTeacher extends Teacher {

    void code(){
        System.out.println("Java teacher teaches how to code");
    }

    public static void main(String[] args) {
        JavaTeacher javaTeacher=new JavaTeacher();

        //inherited properties from super class
        javaTeacher.teacherName="Asel";
        javaTeacher.teacherId="A67";

        //inherited methods
        javaTeacher.homework();// public
        javaTeacher.grade();//protected
        javaTeacher.scholarship();//default
      //  javaTeacher.extraPoint();// private members (variables and methods) DO NOT Participate in the inheritance.
      // Default is available only withing the same package



    }



}
