package class16;

public class SyntaxEmployee {
    String empId; // this ID will be different for each so, we will be creating it as instance

    double salary; // this will be instance V too because salary is different so it is going to be instance

    static String CEO="Sumair"; // this is going to be same so we create this one as static.

    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
            emp1.empId="S123";
            emp1.salary=100000;

        SyntaxEmployee emp2=new SyntaxEmployee();
        emp1.empId="S124";
        emp1.salary=10000000;
        System.out.println(emp1.empId);
        System.out.println(emp1.salary);
        System.out.println(emp1.CEO);






        }
    }

