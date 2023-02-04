package class15;

public class Methods {
    String doSomething() { // I am creating this method with help of void keyword, I will not be able to get return with
        // the void no matter how many times I am calling it

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            // here I am missing return keyword, and I am using void. I will get an error in the object of class If I
            // want to fix that I have to tell java what kind of method that I want to return so instead of void I need
            // to write int
            // whenever I am specifying a datatype I need to create a return value to that method like:
        }

        return null;
    }




    char method2() {// this part is called method header
        return 'd'; // if I change char to double it will return error because the method should match
        // the return value
        // whatever we specify in the method should much the return value
    }
}


