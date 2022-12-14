package com.java.practice.Interface;

interface Bank {
    int ROUTING_NUMBER = 454324;

    void deposit(int amount);

    void withdraw(int amount);

}

interface PSUBank extends Bank {
    void virtualCallToManager();

    void quickSupport();

}
//
//class ChaseBank implements PSUBank, Bank {
//
//    int balance;
//
//    public void deposit(int amount) {
//        balance = balance + amount;
//    }
//
//    public
//}