public class CheckingAccount extends BankAccount {

    // warns user they are about to overdraft their account
    private double over_draft;

    /** constructor for the subclass to create the relationship with BankAccount */
    public CheckingAccount(String name, int birthDate, int acctnum, double balance, double over_draft) {
        super(name, birthDate, acctnum, balance);
        this.over_draft = over_draft;
    }

    // setters and getters
    public double getOver_draft() {
        return this.over_draft;
    }

    public void setOver_draft(double over_draft) {
        this.over_draft = over_draft;
    }

    /** solves for the instance prompting the user they are overdrafting their account */
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else if (amount <= getBalance() + over_draft) {
            balance -= amount;
            System.out.println("Warning: You have overdrafted your account!");
        } else {
            System.out.println("Insufficient funds — exceeds your overdraft limit.");
        }
    }
}