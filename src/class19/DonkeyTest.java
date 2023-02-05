package class19;

public class DonkeyTest {
    public static void main(String[] args) {

        Donkey donkey=new Donkey("Pepper",3);// this new Donkey(); is a call to a constructor, it initializes obj
        //anything after new is calling a constructor
        //The moment you create a constructor and put parameters on it  compiler does not give any default constructor

        donkey.print();// here making a call to the method
        // output is null for name and 0 for age those values are assigned by default by the compiler
        // Compiler takes responsibility to names the values
    }
}
