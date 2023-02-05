package class19;

public class ConstructorChain {

    ConstructorChain(){ // Here non parametrized

        System.out.println("I am non argument constructor");
    }

    ConstructorChain(String str){// WE CAN NOT HAVE THE SAME CONSTRUCTOR WITH THE SAME NAME. HERE WE HAVE PARAMETRIZED CONS

        //So =>>>> I can only have different parameter constructors which means one with parameters the other without.
        // Also, I can only have one constructor without parameters , or I can assign different parameters
        // Signature of our parameters must be different

        // whenever I want to make a call to the current class constructor this(); always must be at the first line
        this(); // I am referring to constructor with no parameters which is the top one

        System.out.println(str);

    }
    ConstructorChain(String str,int number){
        this(str);
        System.out.println("This is constructor with int parameter");

    }

    public static void main(String[] args) {

        ConstructorChain obj=new ConstructorChain("hello",10);
        System.out.println("------End of the code---------");

    }

}
