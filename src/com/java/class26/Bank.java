package com.java.class26;

public class Bank {

    double balance;
    String accName;
    String accNumber;

    Bank(String accNameFrommUser, int balFromUser){
        accName = accNameFrommUser;
        balance = balFromUser;
        accNumber = accName+balance;
    }

    void deposit(double amount){
        balance = balance + amount;

    }
    void withdraw(double amount){
        balance = balance - amount;

    }
    void displayPersonalDetails(){
        System.out.println(balance);
        System.out.println(accName);
        System.out.println(accNumber);

    }
}
