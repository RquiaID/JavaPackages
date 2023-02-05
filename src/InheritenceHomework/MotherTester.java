package InheritenceHomework;

import Homeworks.Daughter;
import InheritenceHomework.Mother;
import Homeworks.Son;

public class MotherTester {
    public static void main(String[] args) {
        Mother mother=new Mother();
        mother.beauty="beautiful";
        mother.intelligence="Very intelligent";
        mother.hardWorker();
        System.out.println(mother.beauty);
        System.out.println(mother.intelligence);

        System.out.println("--------------Creating object of Daughter-----------------");

        Daughter d=new Daughter();
        // features from Mother
        d.beauty="Pretty";
        d.intelligence="Absolutely";
        //features from herself
        d.smartness="Brilliance";

        // Behaviors or methods
        d.hardWorker();
        d.studying();
        System.out.println(d.beauty);
        System.out.println(d.intelligence);
        System.out.println(d.smartness);

        Son s=new Son();
        s.beauty="Handsome";
        s.intelligence="Critical thinker";
        s.smartness=" Clever";
        s.strong="Very";
        s.exercising();
        s.hardWorker();
        s.studying();
        System.out.println(s.beauty);
        System.out.println(s.value);// output will be 0  because I didn't assign a value to it
        System.out.println(s.intelligence);


    }

}
