package class17;

public class Task2 {

    /*
 Create a method that will take a String as a parameter and returns reversed String.
 Method should be available to all classes within your project and accessible by class name.
     */
    /*
    Static methods can be called by just writing the name of the class method name
     */
  public static String reverseStr(String input){ // if we use static we don't need to write the class name to call the method if we are
      // in the same class

   return new StringBuilder(input).reverse().toString();

}

    public static void main(String[] args) {
        //if we are within the same class we dont need the class name as well
        reverseStr("Monday");
    }



}
