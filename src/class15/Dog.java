package class15;

public class Dog {

     String name; // instance variable (even you don't use them , they still exist in the memory)
     String breed; // instance variable
     String color; // instance variable

     static int noOfLegs=4;// static variable; // they are outside method and inside class with word static
     void printFood(){
          String food="Meat";// local they are only created the moment you need them and occupy for a period of time
          System.out.println(food);
     }

}
