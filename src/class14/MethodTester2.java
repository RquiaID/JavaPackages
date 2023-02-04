package class14;

public class MethodTester2 {
    public static void main(String[] args) {

        MethodDemo2 md=new MethodDemo2();/// creating object of a class

        md.printHello(); // calling a method, it is going to print the logic that I have define inside MethodDemo2
        // whenever we call a method all the logic inside the defining method will be printed



        md.printHelloManyTimes(10);
        md.printManyTimes(5,"I love Java");
    }
}
