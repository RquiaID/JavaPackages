package class12;

public class CarTester {
    public static void main(String[] args) {
        // First we need to create the object of the class
        // car in here is the object of the class
        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;
        bmw.movingForward(); // we call the method in this case
        bmw.applyBrakes();
                //whenever we are inside a method the sequence matters
        Car audi=new Car();
        audi.make="Audi";
        audi.model="Audi Q8";
        audi.year=2023;
        audi.movingForward();
        audi.applyBrakes();
     // we can create lots of objects from a class which we can use it several times
    }
}
