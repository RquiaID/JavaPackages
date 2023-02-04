package class16;

public class Task4 {
    //Create a method that will say Hello in different language based on the country that will passed when
    // method is executed
    //return type will be either String or void any of them no issues
    // name of method can be name=sayHello
    // parameter=> String countryName


    String sayHello(String countryName){
        //we will be going with switch statement is going to be better

        switch(countryName){
            case"USA":
                return "Hello";// break is not needed when we use the return keyword
            case"Kazakhstan":
                return"Salam";
            case"Italy":
                return"Ciao";
            case"China":
                return"Ni hao";
            default:
                return"Country not supported";

   // Why we do not need a break when we write return statement because return is doing the same job.
        }
    }

    public static void main(String[] args) {

        Task4 task4=new Task4();
        System.out.println(task4.sayHello("USA"));
    }

}
