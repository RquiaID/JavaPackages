package class19;

public class ThisKeyWord {
    int a,b;
    ThisKeyWord(int a, int b){
        this.a=a;//=> this is instance variable
        this.b=b;//=> this is instance variable

        // To differentiate between local and instance variables we use this.
        // If I want to refer to instance variable I have to use this.
    }
    public void sum(int a,int b){ //=>> these are local variables

        System.out.println("Sum of local variables = "+(a+b));
        System.out.println("Sum of instance variables= "+(this.a+this.b));

    }
    void hello(){ // we call this also instance method

        System.out.println("hello batch 15");
    }
    void howAreYou(){ // instance method

        System.out.println("How are you batch 15");
    }
    void greetings(){ // instance method

       this.hello();// in here the compiler adds this.hello(); this keyword refers to the current instance methods
       this.howAreYou();// this is added implicitly it is there

        // So this key word can refer to current instance variables and instance methoods
    }


    public static void main(String[] args) {

       ThisKeyWord obj =new ThisKeyWord(10,20);

        System.out.println(obj.a);

        System.out.println(obj.b);

        obj.sum(100,200); // these give me sum of local variables
        //----------------------------------------------------------------------------------
        obj.greetings();





    }
}
