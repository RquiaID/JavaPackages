package class14;

public class MethodDemo2 {
    // void does not return anything, after void we write the name of method after name parenthesis we define
    // inside parenthesis the input
    // inside curly brackets we write the logic
    void printHello() { // tHis is how I am defining a method
        System.out.println("Hello world"); // logic present inside the method
        System.out.println("Hello world"); // logic present inside the method
        System.out.println("Hello world"); // logic present inside the method

    }

    void printHelloManyTimes(int times) {
        // we can tell inside a method what kind of variable will be printed
        // and we can pass how many times you want it to be repeated in
        //the calling method

        for (int i = 0; i < times; i++) {
            System.out.println("Hello World");
        }
        }
        // we can also customize what we want to print in the console

        void printManyTimes(int times,String word){
            for (int i = 0; i < times; i++) {
                System.out.println(word);

            }

            }
        }








