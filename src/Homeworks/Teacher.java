package Homeworks;

public class Teacher {
    /*
  Write a Java program called Teacher.  Identify features and 4 behaviour of that Class. Create 3 subclasses MathTeacher,

ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes

     */
    String name;
    int salary;
    int experience;


    Teacher(String name, int salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public void print() {
        System.out.println("Teacher's name is " + name + " his salary is " + salary + " and he has " + experience + " of experience");

    }

    public class MathTeacher extends Teacher {

        String subject;

        public MathTeacher(String name, int salary, int experience, String subject) {
            super(name, salary, experience);
            this.subject = subject;

        }

        public void print() {

            System.out.println("Teacher's name is " + name + " his salary is " + salary + " and he has "
                    + experience + " of experience" + " the subject is " + subject);

        }

        public class ChemistryTeacher extends MathTeacher {

            public ChemistryTeacher(String name, int salary, int experience, String subject) {
                super(name, salary, experience, subject);

            }

            public void print() {
                System.out.println("Teacher's name is " + name + " his salary is " + salary + " and he has "
                        + experience + " of experience" + " the subject is " + subject);
            }

            public class PianoTeacher extends ChemistryTeacher {

                int age;

                public PianoTeacher(String name, int salary, int experience, String subject, int age) {

                    super(name, salary, experience, subject);

                    this.age = age;

                }

                public void print() {
                    System.out.println("Teacher's name is " + name + " his salary is " + salary + " and he has "
                            + experience + " of experience" + " the subject is " + subject + " his age is " + age);

                }
            }
        }
    }
}









