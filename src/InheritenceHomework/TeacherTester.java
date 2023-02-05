package InheritenceHomework;

import InheritenceHomework.Teacher;

public class TeacherTester {

        public static void main(String[] args) {
            Teacher t = new Teacher("Karim", 10000, 10);
            System.out.println(t.experience);
            System.out.println(t.name);
            System.out.println(t.salary);
            t.print();

            Teacher.MathTeacher mt = t.new MathTeacher("John",20000, 5, "Math");
            mt.print();

            Teacher.MathTeacher.ChemistryTeacher ct = mt.new ChemistryTeacher("Jane", 30000, 8, "Chemistry");
            ct.print();

            Teacher.MathTeacher.ChemistryTeacher.PianoTeacher pt = ct.new PianoTeacher("Bob", 40000, 12, "Piano", 45);
            pt.print();
        }
    }

