package class26;

public class Account {
    private double balance;
    private String accountNumber;
    private String type;
    private String accountTitle;

    public void setAccountNumber(String accountNumber){
        if(accountNumber.length()!=16){
            System.out.println("Wrong account number");
        }else{
            this.accountNumber=accountNumber;
        }

    } // for setter method we put void then set plus name of the field we put void because we don't want to return anything .
    public void setBalance(double balance){
        // Sanitizing the input meaning checking the values before we can assign them.
        if(balance<0){
            System.out.println("Negative balance is not allowed its a current account");
        }else{
            this.balance=this.balance+balance;
        }
    }

    public double getBalance(){
        return balance;
    }
    public String getAccountTitle(){    // whenever you are making a method and through that method if you are going to return that value you put get and name of the account type.
    return accountTitle;

}
    public Account(double balance, String accountNumber, String type, String accountTitle) { // use generate, constructor then select the fields
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountTitle = accountTitle;
    }
}

class AccountTester{


    public static void main(String[] args) {
        Account account=new Account(-1000,"jhfsjkbs","kknkjnvs","nnsvjbmvbj ");// create separate classes and methods, you should not make your fields accessible
        System.out.println(account.getAccountTitle());
       // account.setBalance();
        // encapsulation said protect you field so that no one can access and assign those fields it said create method to assign values and sanitize the values. methods should start with set and then name of the field.

    }
}


