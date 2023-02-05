package class19;

public class Test {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.accountNumber=12345678987l;
        ba.money=10000;
        ba.deposit();
        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        //methods and variables  defined in child class are not available to the parent class

        System.out.println("--Creating an object of checking account");

        Checking check=new Checking();
        //features from parent
        check.accountNumber=907967;
        check.money=90000;
        //feature from checking class itself
        check.interest=0;

        check.deposit();//a method also is inherited  from parent
        check.transfer();//a method is also inherited from parent

        System.out.println("---Creating an Object of Savings account");

        Savings save=new Savings();
        save.accountNumber=8758585985l;
        save.money=7657;
        save.profit=100;
        //save.interest=0; siblings features are not available

        save.deposit();//from parent
        save.takeProfit();//comes from savings
        //save.transfer(); not available

        SuperSavings superSavings= new SuperSavings();
        //features from Saving class
        superSavings.accountNumber=9876543222498l;
        superSavings.money=200.000;
        superSavings.profit=7000;
        System.out.println(superSavings.money);
        //methods inherited from saving
        superSavings.takeProfit();
        superSavings.deposit();
        //method inherited from itself
        superSavings.superSaving();




    }
}



