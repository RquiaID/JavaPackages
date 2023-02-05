package InheritenceHomework;

public class Mother {
    String beauty;
    String intelligence;

    void hardWorker() {
        System.out.println("Special method name of class mother");
    }
}
 class Daughter extends Mother {
     String smartness;
     int value;

     void studying() {

         System.out.println("name of method of class daughter");
     }
 }
 class Son extends Daughter{
    String strong;

    void exercising(){

        System.out.println(" The behavior of class son");
    }

 }




    /*
=> Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.

=>Write program to inherit class A that has method printF which is static and call or reuse that method into class B

=>Write a Java program called Teacher.  Identify features and 4 behaviour of that Class. Create 3 subclasses MathTeacher,

ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes

     */

