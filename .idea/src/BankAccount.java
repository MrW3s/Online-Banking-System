/**
 * @author thomaswesley
 * Bank account gathers the users information and also enables withdraws, deposits, and gets balance
 *
 */

public class BankAccount{
    protected String name;
    protected double b_day;
    protected int acctnum;
    protected double balance;


    /**constructor for balance*/
    public BankAccount(String name, double b_day, int acctnum, double balance){
        this.name = name;
        this.b_day = b_day;
        this.acctnum = acctnum;
        this.balance = balance;
    }
    /** getter for name*/
    public String getName(){ return name;}

    /** getter for birthday*/
    public double getB_day(){return b_day;}

    /** getter for account # */
    public double getAcctnum(){return acctnum;}

    /** getter for balance*/
    public double getBalance(){return balance;}

    /** setter for name*/
    public void setName(String name) {
        this.name = name;
    }

    /** setter for birthdate*/
    public void setB_day(double b_day) {
        this.b_day = b_day;
    }

    /** setter for account #*/
    public void setAcctnum(int acctnum) {
        this.acctnum = acctnum;
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
    public void withdraw(double amount){
        if(amount <= this.balance){
            this.balance -= amount;
        }else {
            System.out.println("Insufficient Funds in your account.");
        }
    }//end of the withdraw method

}//end of class
