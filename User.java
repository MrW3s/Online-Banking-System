package com.banking;

import java.util.ArrayList;

public class User {

    private String name;
    private String birthDate;
    private String phoneNumber;
    private String email;
    private ArrayList<BankAccount> accounts;


    public User(String name, String birthDate, String phoneNumber,String email){
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    /** getter for name*/
    public String getName(){ return name;}

    /** getter for birthday*/
    public String getBirthDate(){return birthDate;}

    /** getter for phone number*/
    public String getPhoneNumber() {return phoneNumber;}

    /** getter for email address*/
    public String getEmail(){return email;}

    /** setter for name*/
    public void setName(String name) {this.name = name;}

    /** setter for birthdate*/
    public void setBirthDate(String birthDate) {this.birthDate = birthDate;}

    /** adds user new bank account*/
    public void addAccount(BankAccount account){this.accounts.add(account);}

    public ArrayList<BankAccount> getAccounts(){
        return accounts;
    }
}