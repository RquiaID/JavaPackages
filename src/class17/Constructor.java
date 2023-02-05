package class17;

public class Constructor {
    /*Write a java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.

     */
    int x;
    String name;
       public Constructor() {
          name="cons";
           x=5;
           }
    public static void main(String[] args) {

        Constructor constructor=new Constructor();
        System.out.println(constructor.name);
        System.out.println(constructor.x);



    }


    }


