package class29;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) { // I am creating the constructor by clicking on generate=>constructor=>select what I want to

        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    void printDogName(){
        System.out.println(name);
    }
}
