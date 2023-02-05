package class19;

public class BankAccount { // we call it super or base class

    long accountNumber;

    double money;

    void deposit() { // name of method or behavior of BankAccount class

        System.out.println("Deposit methods from Bank account class");
    }

}

class Checking extends BankAccount {  // we call it child, sub or derived class
    // there is no relation between the first and second classes,it is  possible to create  a relation between them by using extends keyword
    double interest;

    void transfer() { // name of method

        System.out.println(" transfer methods from Checking class");
    }
}


    class Savings extends BankAccount {
        double profit;

        void takeProfit(){

            System.out.println("Profit method from Savings class");
        }
    }

class SuperSavings extends Savings {
    void superSaving() {
        System.out.println("Super saving methods from SuperSaving Class");

        //finish creating SuperSavings object and see which feature available to that class
    }
}
