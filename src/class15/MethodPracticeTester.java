package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {

        // this is how to call a  method.
        MethodPractice mp=new MethodPractice();

      boolean isEven=  mp.isEven(15);

        System.out.println(isEven);

        // call iseven method for the number 100 12 20

        MethodPractice num=new MethodPractice();
        boolean isEven1= num.isEven(100);
       System.out.println(isEven1);

         MethodPractice num2=new MethodPractice();
         boolean isEven2= num2.isEven(12);
        System.out.println(isEven2);

        MethodPractice num3=new MethodPractice();
        boolean isEven3= num3.isEven(20);
        System.out.println(isEven3);

        MethodPractice m=new MethodPractice();
        int n=20;
        Boolean result= m.isEven(n);
        System.out.println(result);

        MethodPractice m2=new MethodPractice();
        int num1=100;
        Boolean EvenOdd= m2.isEven(num1);
        System.out.println(m2.isEven(100));

        MethodPractice m3=new MethodPractice();
        int number=12;
        boolean Even=m3.isEven(number);
        System.out.println(m3.isEven(12));

        // how prof solve it
        boolean isEven4=mp.isEven(100);
        System.out.println(isEven4);
        // we can also use the shorter way
        System.out.println(mp.isEven(100));





    }
}
