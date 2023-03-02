package class23;

public class Task1 {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(100,10);
        creditCard.calculateInterest();
        Visa visa=new Visa(100,10);
        visa.calculateInterest();
        AX ax=new AX(100,10);
        ax.calculateInterest();


    }
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.

    ////////////// instance method is method that is created without static keyword//////////
    // Constructors help us initialize the instance field of a class.

}
class CreditCard{

   double balance;

   double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest(){ // this is the instance method public in here controls accessibility which means that if I am going to access ths method in other classes , I will be able to access it anywhere inside any class.If I remove it, it  will be default which means I will be accessing it only inside the same package. Purpose of a method to be able to use code again and again.

       System.out.println("Interest "+(balance*interest)/100);// this is usually how we count interest
   }


   }
   class Visa extends CreditCard{
         public Visa(double balance,double interest){  // I have to create a constructor to the child class as well like the parent otherwise I will have an error
             super(balance,interest);
         }

   }
   class AX extends CreditCard{

    public AX(double balance, double interest){// In here to I have to have a constructor that takes two fields , I am inheriting from CreditCard class
        super(balance,interest);
    }

       @Override
       public void calculateInterest() {
           System.out.println("Interest "+(balance*interest)/100+30);
       }
   }






