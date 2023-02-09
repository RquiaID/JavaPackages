package overridingHomework;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.

    double balance;
    double interest;

    double calculateInterest(double balance) {
        return balance * (interest/100);
    }
}

class Visa extends CreditCard {

}

class AX extends CreditCard {
    @Override
    double calculateInterest(double balance) {
        return balance * (interest/100) * 1.5;
    }
}
class CreditCardTester{

    public static void main(String[] args) {
        CreditCard credit= new CreditCard();
       credit .balance = 7000;
        credit.interest = 10;
        System.out.println("The credit card interest is  " + credit.calculateInterest(credit.balance));

        Visa visa = new Visa();
        visa.balance = 15000;
        visa.interest = 15;
        System.out.println("The Visa interest is  " + visa.calculateInterest(visa.balance));

        AX ax = new AX();
        ax.balance = 20000;
        ax.interest = 17;
        System.out.println("The AX interest is  " + ax.calculateInterest(ax.balance));
    }
}