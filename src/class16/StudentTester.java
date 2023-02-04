package class16;

public class StudentTester {
    public static void main(String[] args) {
        //when we are creating  instance variable
        // for each object that we create for that class for each
        // instance a seperate cell memory in reserved for
        // that instance variable
        // an object of a class
        // a seperate cell memory

        Student Student=new Student();
        Student.name="Zafar";
        Student.id="123";
        Student.weight=70;
        Student.schoolName="Syntax";

        Student Student1=new Student();
        Student1.name="Hamid";
        Student1.id="456";
        Student1.weight=86;
        Student1.schoolName="Syntax";

        Student Student2=new Student();
        Student2.name="Nelson";
        Student2.id="789";
        Student2.weight=70;
        Student2.schoolName="Syntax";
        // local v smallest scope ,instance V little higher scope can
        // static is the biggest can be accessed inside method
        // INSTANCE VARIABLE ARE NOT SHARED VARIABLE INSIDE OBJECT
        // STATIC VARIABLE CAN BE ACCESS WITHIN METHOD, CLASS, AND ALL OBJECT AS WELL




    }
}
