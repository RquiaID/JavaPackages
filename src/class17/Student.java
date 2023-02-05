package class17;

public class Student {

    /*
     Create a class call it Student define 4 instance fields like id Name, age, weight
        create 5 objects of this class do this without constructors and with constructors

     */
    String id;
    String name;
    int age;
    double weight;

     public Student( String studentId,String studentName,int studentAge){
        id=studentId;
        name=studentName;
        age=studentAge;// another constructor to create an object even by passing 3 values

    }
   public  Student(String studentId,String studentName,int studentAge,double studentWeight){
    id=studentId;
    name=studentName;
    age=studentAge;
    weight=studentWeight;

    }
    void printInfo(){
        System.out.println("ID is "+id+" Name is "+name+" Age is "+age+" Weight is "+ weight);



    }


}



