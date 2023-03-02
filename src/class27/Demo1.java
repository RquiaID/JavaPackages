package class27;

public class Demo1 {
    public static void main(String[] args) {
        String name="Zafar";
        String name2="Aiperi";
        String name3="Sarah";

        String[]names={"Hiral","Nima","Laura","Nat"};
        displayNames(names); // here we are calling the method we don't have to create an instance because it is static
        // and its in the same class
        display2(name,name2,name3);

    }
    public static void displayNames(String[]names){ // this how to create parameters
        for(String name:names){
            System.out.println(name);
        }

    }
    public static void display2(String name,String name2,String name3){

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
    }
        }



