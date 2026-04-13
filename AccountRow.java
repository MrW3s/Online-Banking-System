package com.banking;

public class AccountRow {
    private int accountNumber;
    private double balance;

    public AccountRow(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}