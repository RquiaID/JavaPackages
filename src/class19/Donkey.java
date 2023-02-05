package class19;

public class Donkey {

    String name;
    int age;// these are called instance variables
    double weight;

   // Donkey(){

       // System.out.println("This is non argument constructor");
   // }
    Donkey(String donName,int donAge){ // they are local variables to the constructors
       name=donName;
       age=donAge;

    }

    void print(){

        System.out.println("Donkey name is "+name+ " age is "+ age+" and weight is "+weight);
    }
}

/*
   Donkey(String name,int age){ =>> we use this method if we will have more than one name
    this. name=name;
    this. age=age; =>> take a value of my variable age and assign it to my instance variable
 */
 // name=name=> right is local variables left is instance
 //I want to mention that instance variable=to local I can do this.name=name;
// this refferes to the instance variable