package class19;

public class School {
    public static void main(String[] args) {
       Teacher teacher1 =new Teacher("John",1290);// I am calling first construct because signature matches

       Teacher teacher2 =new Teacher("James",13498,"Java"); // here I am calling the second constructor in teacher class

        System.out.println("end of the code");
    }
}
