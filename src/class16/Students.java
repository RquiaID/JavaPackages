package class16;

public class Students {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students

    String Name;
    int ID;
    static int numberOfStudents;


    public static void main(String[] args) {
        Students Rquia=new Students();
        String Name="Rquia";
        int ID=123459;
        Rquia.numberOfStudents++;



        Students Arinas=new Students();
        String Name2="khad";
        int ID2=12345;
        Arinas.numberOfStudents++;

        System.out.println(Students.numberOfStudents);





    }
}
