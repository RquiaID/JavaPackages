package class19;

public class Furniture {

    String type;
    double price;
    String color;
    // with the help of constructor we can initialize object with specific value
    Furniture(String type,double price,String color){
       this. type=type; //the value of local variable will be used to initialize the  instance variable type
       this.price=price;
       this.color=color;

    }

    //void Furniture(){// the moment we add void it becomes a method not a constructor because of return type

    void print(){

        System.out.println(type+" price is "+price+" and color is "+color);
    }
}
