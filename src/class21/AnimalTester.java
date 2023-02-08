package class21;

public class AnimalTester {

        public static void main(String[] args) {
            Cat cat=new Cat();
            cat.printColor();
            System.out.println(cat.color);
            //use of super keyword is good when 2 same name fields are present inside child and child classes to avoid conflict
            // it is better to use super because by default java will prefer the closest class.

        }


    }

