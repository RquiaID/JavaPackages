package class29Homework;

import java.util.Set;

public class HashSet2 {
    /* Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
 Each student object should have name and studentID. Display name of each student.*/
    public static void main(String[] args) {

        // Create a Set collection to hold objects of Student type
        Set<Students> studentSet = new java.util.HashSet<>(); // this is better, we can achieve polymorphism through this way
        //HashSet<Student>students=new HashSet<>();   // we can also use this

        // Add some students to the set
        studentSet.add(new Students("John", 12345));
        studentSet.add(new Students("Mary", 67890));
        studentSet.add(new Students("Peter", 54321));

        // Display the name of each student
        for (Students student : studentSet) {
            System.out.println(student.getName());
        }
    }
}
class Students {
    private String name;
    private int studentID;

    public Students(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }
}



