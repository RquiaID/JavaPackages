package class21;

public class CalculatorTester {
    public static void main(String[] args) {

        Calculator cal = new Calculator(); // I am first creating the object
        cal.add(10,10); // java knows by the data type and number of parameters, in this call I put 2 integers so
        // java will look for 2 parameters which are  integers.
        // NOTE: if Java couldn't find a perfect match, it is going to type cast
        // It works just for widening type casting.
    }
}