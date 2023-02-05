package class19;

public class Teacher {

    String name;
    int TeacherId;

    String subject;

    Teacher(String name, int teacherId){
        this.name=name;// purple points to instance variables
        this.TeacherId=teacherId;

    }
    Teacher(String name,int teacherId,String subject){
        // I can make a call by using this
        this(name,teacherId);
        this.subject=subject;// I write down this because I didn't initialize it in the first constructor.



    }

}
