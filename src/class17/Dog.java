package class17;

public class Dog {

    String name;

    String breed;

    String color;

    int age;

    double weight;

    // constructors in java help us build objects

    // constructors do not have any return type

    // constructors do not have any name, the only name they can have is the same class name

    Dog(String dogName, String dogBreed, String dogColor,int dogAge,double dogWeight){ // this is a simple constructor
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;
    }
    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" Color "+color +" age "+age+" Weight "+weight);
    }


  // So a constructors help us to create objects ,help us initialize fields , reduce the amount of code we have to write



    }




