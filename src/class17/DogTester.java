package class17;

public class DogTester {
    public static void main(String[] args) {

        // In method, we write logic once , and we reuse it again and again
        // here we are initializing the fields of dog method

        Dog husky=new Dog("Husky","Husky the dog","White",2,25.2);

         husky.printInfo();
        Dog poodle =new Dog("Poodle", "Max","Brown",10,17.0);

        poodle.printInfo();
        Dog Shepherd=new Dog("Shepherd","Chow Chow","Black",4,20.0);
        Shepherd.printInfo();

        /*
        Create a class call it Student define 4 instance fields like id Name, age, weight
        create 5 objects of this class do this without constructors and with constructors


         */

    }
}
