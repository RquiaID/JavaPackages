package class16;

public class Student {

    String name;
    String id;
    String school;
    String schoolName;
    int age=10;
    double weight;

// If the value is not changed we should go with static variable
    void printName(){

        System.out.println(name);
        System.out.println(schoolName);
    }
    static void printStudentInfo(){
       // System.out.println(name); Can't access here
      //  System.out.println(schoolName);
    }
}
