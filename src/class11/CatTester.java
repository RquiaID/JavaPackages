package class11;

public class CatTester {
    public static void main(String[] args) {
        // creating an object from the Cat class

         Cat cat1=new Cat();
         cat1.name="lego";
         cat1.breed="Van Cat";
         cat1.age=2;
         cat1.color="grey";
         cat1.attitude=false;
         cat1.eat(); // I am calling the eat method using the object cat1

         Cat cat2=new Cat();
         cat2.name="loki";
         cat2.breed="Domestic";
         cat2.color="White";
         cat2.speak();

    }
}
