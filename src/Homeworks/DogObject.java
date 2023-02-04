package Homeworks;

public class DogObject {

    // Create a Dog Class and create 3 different objects of it:
    // Husky, Bulldog, Labrador  with specific  attributes and behaviors
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Husky ";
        dog1.color="Silver-Grey ";
        dog1.gender="Female ";
        dog1.weight=20;
        dog1.aggressive=false;
        dog1.age=5;
        dog1.obedient=true;
        dog1.Safety();

        Dog dog2=new Dog();
        dog2.name=" Bulldog ";
        dog2.color=" Fawn-white ";
        dog2.gender="Male";
        dog2.weight=18;
        dog2.aggressive=false;
        dog2.age=3;
        dog2.obedient=true;


        Dog dog3=new Dog();
        dog3.name="Labrador ";
        dog3.color="Chocolate";
        dog3.gender="Male ";
        dog3.weight=25;
        dog3.aggressive=false;
        dog3.age=7;
        dog3.obedient=true;


    }
}
