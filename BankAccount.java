/**
 * @author thomaswesley
 * Bank account gathers the users information and also enables withdraws, deposits, and gets balance
 * --How can this improve? The app could offer products based on certain thresholds the account
 * holders reach ( pre-apprval for credit cards, loans, auto finance, etc) --
 *
 */

public abstract class BankAccount{

    private int accountNumber;
    protected double balance;


    /**constructor for balance*/
    public BankAccount(int accountNumber, double balance){

        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    /** getter for account # */
    public int getAccountNumber(){return accountNumber;}

    /** getter for balance*/
    public double getBalance(){return balance;}



    /** setter for account #*/
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /** setter for balance*/
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /** method that deposits funds to account */
    public void deposit(double amount){
        this.balance += amount;
    }

    /**determines if a user has funds to make a withdraw*/
    public abstract void withdraw(double amount);

}//end of class
