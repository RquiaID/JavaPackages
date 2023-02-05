package class19;

public class Store {
    public static void main(String[] args) {
       Furniture table= new Furniture("Table",100,"White");// on the right side is my object new keyword creates object and initializes it
       table.print();


       Furniture chair=new Furniture("Chair",30,"Brown");// we have to follow the order we followed inside the class when we call an object
        chair.print(); // a copy of instance variables is created type,price,color,and the value is assigned to object by the use of keyword this which assigning the local variables to instance one

        //THIS REFERS TO INSTANCE VARIABLES.
    }
}
