/**
 * @author thomaswesley
 * Bank account gathers the users information and also enables withdraws, deposits, and gets balance
 * --How can this improve? The app could offer products based on certain thresholds the account
 * holders reach ( pre-apprval for credit cards, loans, auto finance, etc) --
 *
 */

public class BankAccount{
    public String name;
    public int birthDate;
    public int acctnum;
    public double balance;


    /**constructor for balance*/
    public BankAccount(String name, int birthDate, int acctnum, double balance){
        this.name = name;
        this.birthDate = birthDate;
        this.acctnum = acctnum;
        this.balance = balance;
    }
    /** getter for name*/
    public String getName(){ return name;}

    /** getter for birthday*/
    public int getBirthDate(){return birthDate;}

    /** getter for account # */
    public double getAcctnum(){return acctnum;}

    /** getter for balance*/
    public double getBalance(){return balance;}

    /** setter for name*/
    public void setName(String name) {
        this.name = name;
    }

    /** setter for birthdate*/
    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
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
